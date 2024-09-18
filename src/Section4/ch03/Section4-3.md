## 함수 호출과 스택 메모리

---
- 스택 : 함수가 호출 될 때 지역 변수들이 사용하는 메모리
- 함수의 수행이 끝나면 자동으로 반환되는 메모리
  - ```java
    public class Cal {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;
            int total = add(num1, num2);
            System.out.println(total);
        }
    
        public static int add(int num1, int num2) {
            int result = num1 + num2;
            return result;
        }
    }
    ```
    ### 메모리 순서
    - main() 함수가 사용할 메모리 공간이 스택에 생성됨 (num1, num2, total)
    - main() 에서 add() 호출
    - add() 함수가 사용할 메모리 공간이 스택에 생성 됨 (num1, num2, result)
    - return
    - add() 함수가 사용한 메모리 공간은 자동으로 사라짐
    - add() 수행 후 메모리 해제
    - main() 함수

> ### 용어 정리
> - 지역 변수 : 함수 내에서 선언된 변수, 함수 내에서만 사용 가능, 함수를 벗어나면 자동으로 메모리 해제
> - 전역 변수 : 함수 밖에서 선언된 변수, 모든 함수에서 사용 가능, 선언되는 순간 메모리가 생성, 코드 전체가 끝날 때 까지 메모리 차지 