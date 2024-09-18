package Section4.ch03;

public class FunctionTest {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;

		int total = addNum(n1, n2);

		System.out.println(total);

		total = addNum(30, 50);
		System.out.println(total);

		sayHello("Hello");

		int sum = calcSum();

		System.out.println(sum);
	}

	public static int addNum(int num1, int num2) {
		return num1 + num2;
	}

	public static void sayHello(String str) {
		System.out.println(str);
	}

	public static int calcSum() {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}

		return sum;
	}
}
