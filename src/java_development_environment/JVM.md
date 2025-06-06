# JVM
* `JVM(Java Virtual Machine)이란?`: 자바 가상 머신의 약자
* `Java`와 `OS` 사이에서 중계자 역활을 수행 (Write Once, Run Anywhere)
    * Java가 OS의 종류에 <U>영향을 받지 않고 수행</U>될 수 있도록 함 
* 메모리를 자동으로 관리해줌. (GC)

<br>

## JVM의 필요성
* 컴퓨터는 0과 1밖에 모르는 바보임
* 우리가 열심히 코딩을 해도 컴퓨터 입장에서는 어? 이게 뭐지? 하는 상황이 나옴
![alt text](<../설명사진/컴퓨터의 바보성.png>)
* 위와 같은 문제를 해결해 주기 위해서 만들어진 것이 `컴파일(Compile)`
![alt text](<../설명사진/컴파일 과정.png>)
    * 사람이 알수 있는 언어를 컴퓨터가 알 수 있는 <U>바이너리 코드로 변환</U>을 해주는 작업을 진행
* ⚠️ 여기서 또 문제는  CPU 제조사마다 바이너리 코드가 다르다는 것..
![alt text](<../설명사진/또 문제.png>)
* 위와 같이 바이너르 코드(기계어)는 CPU 환경에 따라 달라서 하나의 언어가 아니였음. 
* 그래서 각각 다른 컴퓨터 환경에서 실행하고 싶으면 각 제조사에 맞는 기계어를 알고 있어야하는 번거러움 발생
* JVM이 등장하여서 각각 다른 CPU환경에서 이식성의 문제가 없도록 실행할 수 있게 도와줌
* 위 사실때문에 다른 운영체제에 구애 받지 않아 널리 사용화가 되었다고 한다.


<br>

## 자바 프로그램의 실행 순서
![alt text](<../설명사진/자바프로그램 실행 순서.png>)
### 1. java code 작성 (*.java)
* 개발자기 IDE에서 .java 확장자의 자바 소스코드를 작성
* `*.java` 파일은 사람이 읽을 수 있는 텍스트 기반 코드
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### 2. 컴파일 - 바이트 코드 생성 (.class)
* `javac`(자바 컴파일러)가 `*.java`파일을 읽어서 `*.class` 파일로 변환함.

### 3. JVM이 .class 파일을 실행
* JVM은 `.class` 파일을 읽음
* 내부적으로 해석
* 실제 OS 위에서 프로그램 실행

<br>

# JVM의 메모리 구조
![alt text](<../설명사진/JVM 메모리 구조.png>)

## 자바 실행 단계 
1. 자바 소스 코드를 작성하고 컴파일하게 되면 `Class Fil`e이 생성됨
    * `Class File` 안에는 어떤 필드 몇개 선언 되어있고, 메서드는 몇개이며 이름은 무엇인지, 바이트 코드까지 포함해서 <U>클래스에 대한 모든 정보</U>가 들어있음.
2. 해당 `Class File`을 실행하게 되면 `JVM`은 `Class Loader`을 통해 `ClassFile`을 읽어드림
3. `Class Loader`은 해당 Class File의 정보를 메모리에 올리고 검증하며, static 변수들을 초기화하는 등의 역활을 수행함

<br>

## Runtime Data Area 
* JVM이 사용하는 가상 메모리의 공간

### 1. **Method Area (클래스 영역이라고도 함)**
* `JVM` 실행 시에 생성되며. `Class Loader`에 의해 클래스 정보가 로드 됨
* 클래스 정보와 static 멤버를 저장하는 공유 영역
* 이 영역은 변경이 불가능 (클래스 정보가 로딩되면 수정X)
* 프로세스 종료 시에 해제 됨
* 클래스 관련 정보 저장:
    * 클래스 이름, 부모 클래스 정보
    * static 필드, 메서드
    * 메서드의 바이트코드
    * 상수

### 2. **Heap Area**
* `JVM 시작` 시 생성, <U>스레드 간 공유</U>됨
* 객체들이 동적으로 저장되는 공간이며, `가비지 컬렉터(GC)`가 이들을 관리함
    * `new 키워드`로 생성된 객체와 배열이 저장됨
    * 런타임 중 생성된 객체들이 저장되고, `GC`가 관리
* **Heap 영역 세부 구조**
![alt text](<Heap영역에 대해.png>)
    1. **Permanent Generation (Java 8 이전)**
        * 클래스에 대한 메타정보 저장 영역 (Java 8 이후 Metaspace로 대체됨)
    2. **New Generation (새 객체 저장)**
        * **Eden** : 새로 생성된 모든 객체가 처음 저장되는 공간  
            → 객체가 생성되면 Eden 영역에 저장됨
        * **Survivor 1 / 2**:
            * Eden에서 Minor GC가 발생하면, 살아남은(참조중)객체만 Survivor1 또는 Survivor2로 복사됨  
            * 두 영역은 번갈아가며 사용되며, Minor GC가 반복될 때마다 Eden과 한쪽 Survivor에서 활성 객체를 다른 Survivor로 이동  
            * 이 방식은 Copy & Scavenge 알고리즘으로, 빠르고 효율적으로 메모리를 관리함
            > 위와 같이 여러 번 GC(수거)를 거쳐도 살아남은 객체만 Old 영역으로 이동하게 됨.
    3. **Old Generation (오래된 객체 저장)**
        * 여러 번 GC에서 살아남은 객체들이 이곳으로 이동
        * Full GC 대상
    


### 3. **Stack Area**
* **메서드 실행 시에 필요한 정보가 저장되는 스레드 전용 영역**
    *  스레드마다 <U>독립적으로 하나씩 존재</U>하며, 스레드가 시작될 때 생성됨
* 메서드가 호출될 때 마다 `Stack Frame`이 생성되며, `Stack Frame`이 쌓여 스택을 구성
    * `Stack Frame`: 메서드가 하나 호출될때 마다 새로 생성되고 메서드가 끝나거나, 예외 상황이 발생했을 경우 소멸
* 컴파일 시에 `스택 크기(size)`와 `Life cycle(생명주기)`이 정해짐
    * 호출 스택의 제일 상위에 위치한 메소드가 현재 실행중인 메소드(나머지는 대기 상태)


### 4. **PC Register**
* 재 실행 중인 명령어의 주소를 저장하는 작은 저장소
* 스레드마다 하나씩 존재
* <U>JVM 내부 명령어(Bytecode)의 현재 주소</U>를 추적함
* `JVM`이 어떤 명령을 실행해야 할지 알려주는 역할을 수행

### 5. **Native Method Stack**
* java가 아닌 타 플랫폼 언어(C/C++) 작성된 네이티브 메서드 실행 시 사용하는 스택
* JVM이 아닌 외부 도움 받은 기능용 작업 테이블

<br></br>
<br></br>

# 🚨 주의
![alt text](<../설명사진/jVM 고려사항.png>)