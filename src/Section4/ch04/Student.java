package Section4.ch04;

public class Student {
	int studentId;
	String studentName;
	String studentAddress;

	public void showStudentInfo() {
		System.out.println(studentName + "," + studentAddress);
	}

	public String getStudentName() { // 클래스를 쓰는 쪽 입장으로 기준으로 명명, 클라이언트 코드 : 웹 서비스 쪽의 모듈을 가져다쓰기 때문에 불림
		return studentName;
	}
}
