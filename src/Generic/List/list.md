<h2>ArrayList와 LinkedList의 차이점</h2>

<h3>**ArrayList** </h3>

<li>ArrayList 는 내부 적으로 배열을 사용하여 요소를 저장한다.</li>
<li>요소의 접근은 빠르지만, 요소의 추가, 삭제 등이 발생했을 때 해당 배열의 크기를 조절해야하는 작업(배열 복사 등..) 이 필요하게 된다</li>
<li>정리하자면 요소의 접근은 빠르지만 요소 추가, 삭제 등의 작업은 느리게 작동한다.</li>

<h3>**LinkedList**</h3>
<li>내부적으로 2중 연결 리스트를 이용하여 요소를 저장한다.</li>
<li>각 요소들은 이전 요소와 다음 요소를 가르키는 링크를 가지고 있다.</li>
<li>요소의 추가와 삭제가 이루어질때 링크만을 조절하면 되기 때문에 요소의 추가 삭제에 용이하다. </li>

<h3>**정리**</h3>
<li>요소의 접근을 주로 한다 - 접근에 용이한 ArrayList를 사용 </li>
<li>요소의 추가, 삭제를 주로 한다 - 요소의 추가와 삭제에 용이한 LinkedList를 사용한다.</li>

ArrayList와 LinkedList 의 차이는 사용 방법이 아닌, 내부적인 요소를 저장하는 방법에서 차이가 난다는 것이다.