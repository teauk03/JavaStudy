# **Optional**

---
```java
public final class Optional<T> {
  private static final Optional<?> EMPTY = new Optional<>(null);
  private final T value;
  //methods..
}
```
* `java 8`에 도입됨
* 연산의 결과를 `Optional 객체`에 담아서 반환함
* `NPE`(실제 값이 아닌 null을 가지고 있는 객체/변수를 호출할 때 발생하는 예외)를 방지

<br></br>

## **Optional 객체 생성**

---
```java
// 반드시 null이 아닌 값을 포함해야함
public static <T> Optional<T> of(T value) {
  return new Optional<>(Objects.requireNonNull(value));
}
// null일수도 있는 값을 포함할 수 있음
public static <T> Optional<T> ofNullable(T value) {
  return value == null ? (Optional<T>) EMPTY
    : new Optional<>(value);
}
// Optional<T>타입의 참조변수를 기본 값으로 초기화 할 경우
// 빈 객체로 초기화 됨
public static<T> Optional<T> empty() {
@SuppressWarnings("unchecked")
        Optional<T> t = (Optional<T>) EMPTY;
        return t;
}
```


<br></br>

## **Optional 사용**

---

**생성 관련 메서드**

| 메서드                 | 설명                                                                      |
|------------------------|---------------------------------------------------------------------------|
| `empty()`              | 빈 `Optional` 객체를 반환함.                                         |
| `of(T value)`          | null이 아닌 값을 감싸는 `Optional`을 생성함.                          |
| `ofNullable(T value)`  | 값이 null일 수도 있는 경우 사용하며, null이면 빈 `Optional`을 생성함. |

## 값 확인 메서드
| 메서드                 | 설명                                                                      |
|------------------------|---------------------------------------------------------------------------|
| `get()`                | 값이 존재하면 반환하고, 값이 없으면 예외를 던짐.                      |
| `isPresent()`          | 값이 존재하면 `true`, 아니면 `false`를 반환함.                       |
| `isEmpty()`            | 값이 없으면 `true`, 아니면 `false`를 반환함.                         |

**값 처리 메서드**

| 메서드                                         | 설명                                                                      |
|------------------------------------------------|---------------------------------------------------------------------------|
| `ifPresent(Consumer<? super T> action)`        | 값이 존재하면 해당 동작을 수행함.                                     |
| `ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)` | 값이 존재하면 `action`을 실행하고, 값이 없으면 `emptyAction`을 실행함. |

**기본값 반환 메서드**

| 메서드                                  | 설명                                                                      |
|-----------------------------------------|---------------------------------------------------------------------------|
| `orElse(T other)`                       | 값이 존재하면 해당 값을 반환하고, 없으면 기본값을 반환함.              |
| `orElseGet(Supplier<? extends T> supplier)` | 값이 없을 때 기본값을 제공하는 함수 결과를 반환함.                   |
| `orElseThrow()`                         | 값이 없으면 `NoSuchElementException`을 던짐.                         |
| `orElseThrow(Supplier<? extends X> exceptionSupplier)` | 값이 없으면 제공된 예외를 던짐.                                   |

**값 변환 및 필터링 메서드**

| 메서드                                  | 설명                                                                      |
|-----------------------------------------|---------------------------------------------------------------------------|
| `map(Function<? super T, ? extends U> mapper)` | 값을 다른 값으로 변환하여 새로운 `Optional`을 반환함.              |
| `flatMap(Function<? super T, Optional<U>> mapper)` | 중첩된 `Optional`을 평탄화하여 반환함.                            |
| `filter(Predicate<? super T> predicate)` | 조건을 만족하면 값을 포함하는 `Optional`을 반환하고, 그렇지 않으면 빈 `Optional`을 반환함. |

**기타 메서드**

| 메서드                 | 설명                                                                      |
|------------------------|---------------------------------------------------------------------------|
| `stream()`             | `Optional`을 스트림으로 변환함.                                       |
| `equals(Object obj)`   | 다른 객체와의 동등성을 검사함.                                        |
| `hashCode()`           | 객체의 해시코드를 반환함.                                             |
| `toString()`           | `Optional`의 문자열 표현을 반환함.                                    |
