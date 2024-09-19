package Section4.ch11;

public class Employee {

	private static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;

	public Employee() {
		employeeId = serialNum++; // 앞에 있으면 증가하고 assign, 뒤에 있으면 assign 하고 증가
	}

	public static int getSerialNum() { // static 메서드는 인스턴스의 생성과 상관없이 클래스 이름으로 바로 호출해서 사용할 수 있음
		int i = 0;
		// employeeName = "Lee"; // 인스턴스 변수가 생성되지 않을 수 있음 => 생성되지 않은 상태에서 어떤 값을 넣으면 오류 남
								 // static 메서드 안에서는 인스턴스 변수 사용 불가함
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
