package Section4.ch12;

import java.util.Calendar;

public class SchoolTest {
	public static void main(String[] args) {
		School school1 = School.getInstance();
		School school2 = School.getInstance();

		System.out.println(school1==school2);

		Calendar calendar = Calendar.getInstance(); // java.util 의 싱글톤 패턴 예시 => 캘린터는 같은 시간을 공유한다면 모두 동일하기 때문
	}
}
