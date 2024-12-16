# **Iterator과 Collection**

---


## Iterator
```java
    public interface Iterator {
    boolean hasNext(); // 읽어 올 요소가 남아있는지 확인 (있으면 true, 없으면 false)
    Object next(); // 다음 요소를 읽어 옴. (hasNext로 있는지 없는지 확인하는 것이 안전함)
    void remove(); // next()로 읽어온 요소를 삭제
    }
```
* `Iterator이란? ` 
  * 컬렉션(List,Set,Map)에 저장된 요소들을 순차적으로 순회하기 위해 만들어진 인터페이스 
    * 컬렉션 구조에 상관 없이 동일한 방식으로 데이터를 순회할 수 있게 도와주는 도구
  * 컬렉션의 내부 구조를 노출하지 않고 요소를 처리할 수 있게 설계 되어 있음


---

## Collection
```java
    public interface Collection {
    boolean isEmpty(); // 컬렉션이 비어있는지 확인 
    Iterator<E> iterator(); // 컬렉션 요소를 반환하기 위해서 Iterator의 객체를 반환함
    Object[] toArray(); // 컬렉션의 요소를 배열로 반환함
    }
```
* 자바의 컬렉션 프레임 워크 중 최상위 인터페이스
  * 모든 컬렉션 클래스의 기반이 되는 인터페이스
* iterator()를 정의하고 있어 `Iterator에서 생성된 객체`가 특정 메서드를 호출하여 데이터를 순회함
* 단일 요소의 그룹(집합)을 표현함
* 다양한 컬렉션의 유형 중에 공통된 동작을 정의

```java
// 참조 타입을 Collection으로 지정한 이유 (결론: 다형성)
// Collection에는 존재하지 않고 ArrayList에만 있는거라면 참조 타입을 ArrayList로 변경
// 그렇지 않다면 Collection으로 지정: LinkedList로 바꾸고 싶다면 new 옆에 선언문 하나만 변경해주면 되기 때문
  Collection<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Very");
    list.add("Hard");
    
    // Iterator 객체 생성
    Iterator<String> it = list.iterator(); 
    
    // list의 요소가 있을 때까지 순회
    while(it.hasNext()){ //Iteration이 다음 요소가 있나 확인
        System.out.println(it.next()); // 현재 요소를 반환 후 다음 요소로 커서 이동
        }
```