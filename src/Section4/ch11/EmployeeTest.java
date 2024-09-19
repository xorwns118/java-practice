package Section4.ch11;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");

		//System.out.println(Employee.serialNum); // employeeLee.serialNum 에서 이미 프로그램이 로드 될 때 생성되어 있음
												  // 참조 변수에서 호출 할 필요 없이 클래스 이름를 직접 호출해서 불러오면 됨
												  // static 변수 == class 변수

		Employee employeeKim = new Employee();
		employeeLee.setEmployeeName("김유신");

		System.out.println(employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeId());
		System.out.println(Employee.getSerialNum());
	}
}
