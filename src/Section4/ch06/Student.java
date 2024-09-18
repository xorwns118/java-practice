package Section4.ch06;

public class Student {
	int studentId;
	String studentName;
	String studentAddress;

	public Student() {} // 생성자가 두개이상이 됨 => 오버로딩이라고 함(이름은 같고 매개변수가 다른거)
	// println 도 매개변수만 다른 여러 메서드가 있음

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	/*public Student(int id, String name) { 이렇게 써도 됨 => 매개변수와 이름이 같으면 가까운거부터 인식
		studentId = id;
		studentName = name;
	}*/

	public void showStudentInfo() {
		System.out.println(studentId + "," + studentName + "," + studentAddress);
	}

	public String getStudentName() {
		return studentName;
	}
}
