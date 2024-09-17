package Section2.ch05;

public class IntVariableTest {
	public static void main(String[] args) {
		byte bs = 127; // -128 ~ 127

		System.out.println(bs);

		long iVal = 12345678900L; // L 안붙이면 int 형의 범위를 넘어서기 때문에 오류남 (변수 선언할 때 자료형도 long 으로 바꿔줘야함)
		System.out.println(iVal);
	}
}
