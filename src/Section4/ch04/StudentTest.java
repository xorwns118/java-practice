package Section4.ch04;

/*
웹서버 쪽에서 main 함수 잘 안씀
Client 에서 Request 가 들어오면 WebServer 가 Thread 화 해서 실행하게끔 함
*/
public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(); // => 참조 변수
		studentLee.studentName = "Lee"; // 생성된 변수의 속성
		studentLee.studentAddress = "Seoul";

		Student studentKim = new Student();
		studentKim.studentName = "Kim";
		studentKim.studentAddress = "New York";

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();

		System.out.println(studentLee); // Section4.ch04.Student@65b54208 FullName@32bit주소 => 참조 값
		System.out.println(studentKim);
	}
}
