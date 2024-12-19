# **Map Collection Class**

---

* Map 인터페이스는 Collection 인터페이스와는 다른 저장 방식을 가짐
* Key-Value를 하나의 쌍으로 저장하는 방식을 사용
  * Key: Value를 찾기 위한 유일(고유)한 번호
  * Value: 실질적인 값
* 순서에 의존하지 않고 Key로 Value를 가져옴

### **Map 컬렉션 클래스의 공통된 특징**
1. 요소의 저장 순서가 유지되지 않음
2. 키(Key)의 값은 중복을 허용하지 않지만, 값(Value)의 값은 중복을 허용함

### **대표적인 Map 컬렉션 클래스**
1. HashMap: null 키 값과 값을 허용, 비동기적이여서 멀티 스레드 환경에서 안정성이 떨어짐
2. HashTable: null 키 값과 null 값을 허용하지 않음, 동기화가 되어 있어 멀티 스레드 환경에서 안전함
### **정렬이 필요할때 사용하는 Map 컬렉션 클래스**
1. TreeMap: 키의 순서를 유지(디폴트: 오름차 순), null 키 값은 허용 X, 값은 허용, 비동기적이라 멀티 스레드 환경에서 안정성이 떨어짐
2. LinkedHashMap: 삽입된 순서대로 유지, key 값과 value 값의 null 허용, 비동기적이여서 멀티 스레드 환경에서 안전하지 않음

### **Map의 상속 계층도**
![Map 상속 계층도.png](..%2F..%2F%EC%84%A4%EB%AA%85%EC%82%AC%EC%A7%84%2FMap%20%EC%83%81%EC%86%8D%20%EA%B3%84%EC%B8%B5%EB%8F%84.png)

<br></br>


## HashMap ##

------
**Java 실제 HashMap 클래스 내부의 코드**
* Entry 라는 내부 클래스를 정의 
* Entry 타입의 배열을 선언

-> `Key-Value를 하나의 클래스로 정의 하고 그 클래스를 하나의 배열로 다룸`

```java
import java.io.Serializable;
import java.util.Map;

public class HashMap extends AbstractMap implements Map, Cloneable, Serializable {
  transient Entry[] table;
  ...

  static class Entry implements Map.Entry
  {
    final Object key;
    Object value;
  }
  ...
}
```

* HashMap은 Map 인터페이스를 구현하므로, 중복된 키를 허용하지 않음
  * 같은 값을 다른 키로 저장할 수 있음
* 해시 알고리즘을 사용하여 데이터를 저장하고 검색함
  * 평균적으로 검색, 삽입, 삭제의 시간 복잡도는 O(1)이나, 최악의 경우 O(n)
* 데이터 저장 순서를 보장하지 않음
* 기본적으로 비동기적으로 동작하기 때문에 다중 스레드 환경에서는 Thread-safe하지 않음
  * 다중 스레드 환경에서는 Collections.synchronizedMap 또는 ConcurrentHashMap 사용 필요
* null 허용:
  * 키: null 하나만 허용
  * 값: 여러 개의 null 값 허용


<br></br>


## HashTree ##

--- 
![TreeMap.png](..%2F..%2F%EC%84%A4%EB%AA%85%EC%82%AC%EC%A7%84%2FTreeMap.png)
* 이진 검색 트리 형식으로 키와 값의 쌍으로 이루어진 데이터를 저장 (key가 자동으로 정렬)
* 각 노드는 Key와 Value의 쌍으로 이루어져 있음
* Key를 기준으로 오름차순으로 정렬함
* 검색과 정렬에 정절한 컬렉션 클래스