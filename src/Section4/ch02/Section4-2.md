## 생활 속에서 객체를 찾아 클래스로 구현해 보기

---
### 생활 속 객체 (예시)

- 온라인 쇼핑몰에 회원 로그인을 하고 여러 판매자가 판매하고 있는 제품 중 하나를 골라 주문
- 아침에 회사 가는 길에 카페에 들려서 아이스 카페라떼 주문
- 성적 확인을 위해 학사 관리 시스템에 로그인 하여 수강 한 과목들의 성적을 확인

### Class 는 객체의 청사진(blue print) 이다.
- 객체의 속성은 클래스의 멤버 변수(member variable)로 선언함
- 학생 클래스
  - ```java
    public class Student {
        int studentId;
        String studentName;
        int majorCode;
        int grade;
    }
    ```
    - | 속성    | 자료형    | 변수 이름       | 설명                                                |
      |-------|--------|-------------|---------------------------------------------------|
      | 학번    | int    | studentId   | 학번은 정수로 나타냄                                       |
      | 이름    | String | studentName | 이름은 문자의 연속으로 되어있음. 문자열을 지원하는 JDK 의 String 클래스를 사용 |
      | 전공 코드 | int    | majorCode   | 전공은 정수로 나타냄. 전공 객체를 참조하여 전공 이름을 찾을 수 있음           |
      | 학 년   | int    | grade       | 학년은 정수로 나타냄                                       |
- 주문 클래스
  - ```java
    public class Order {
        int orderId;
        String buyerId;
        String sellerId;
        int productId;
        String orderDate;
    }
    ```
- 회원 클래스
  - ```java
    public class UserInfo {
        String userId;
        String userPassword;
        String userName;
        String userAddress;
        String phoneNumber;
    }
    ``` 
- 객체 지향 프로그래밍을 할 때는
  - 객체를 정의하고
  - 각 객체의 속성을 멤버 변수로 역할을 메서드로 구현하고
  - 각 객체간의 협력을 구현
- 클래스 코딩하기
  - 클래스는 대문자로 시작하는 것이 좋음
  - java 파일 하나에 클래스는 여러개가 있을 수 있지만, public 클래스는 하나이고, public 클래스와 .java 파일의 이름은 동일함
  - camel notation 방식으로 명명
> ### 용어정리
> - 청사진(blue print) : 연산(Operation)의 집합으로 애플리케이션 객체에 등록해서 실행시킬 수 있도록 하는 객체