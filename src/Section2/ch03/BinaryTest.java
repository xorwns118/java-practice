package Section2.ch03;

public class BinaryTest {
	public static void main(String[] args) {
		int num = 10;
		int bNum = 0B1010; // b는 소문자 대문자 상관없음 2진수
		int oNum =  012; // 8진수
		int xNum = 0XA; // 16진수

		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);

		int cNum = 0b01000001; // 65
		System.out.println((char)cNum);
	}
}
