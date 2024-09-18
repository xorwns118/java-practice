package Section4.ch08;

public class BirthDayTest {
	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		day.setYear(2023);
		day.setMonth(1);
		day.setDay(30);

		System.out.println(day.isValid());
	}
}
