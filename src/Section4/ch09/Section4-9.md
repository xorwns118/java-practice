## 객체 자신을 가리키는 this

---

### this 가 하는 일
- 인스턴스 자신의 메모리를 가리킴
- 생성자에서 또 다른 생성자를 호출할 때 사용
- 자신의 주소(참조 값)을 반환함

### 생성된 인스턴스 메모리의 주소를 가짐
- 클래스 내에서 참조 변수가 가지는 주소 값과 동일한 주소 값을 가지는 키워드
- ```java
  public void setYear(int year) {
    this.year = year;
  }
  ```
  
### 생성자에서 다른 생성자를 호출하는 this
- 클래스에 생성자가 여러개인 경우, this 를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
- 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로<br>
this() statement 이전에 다른 statement를 쓸 수 없음