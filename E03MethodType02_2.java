package ex05mathod;

import java.util.Scanner;

public class E03MethodType02_2 {

	static String getHakjum() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수:");
		int kor = scanner.nextInt();
		System.out.print("영어점수:");
		int eng = scanner.nextInt();
		System.out.print("수학점수:");
		int math = scanner.nextInt();
		
		//평균값 구하기
		double avg = (kor+eng+math)/3.0;
		//학점을 저장하기 위한 변수 생성
		String hakjum = "";
		
		//평균값의 구간을 정하기 위해 10으로 나눈 몫을 사용
		int result = (int)avg / 10;
		switch(result) {
		case 10: case 9:
			hakjum = "A학점";break;
		case 8:
			hakjum = "B학점";break;
		case 7:
			hakjum = "C학점";break;
		case 6:
			hakjum = "D학점";break;
		default:
			hakjum = "F학점";
		}
		
		//위에서 결정된 학점을 반환 (★항상 호출한 지점으로 반환된다.)
		return hakjum;
	}
	public static void main(String[] args) {
		System.out.println("너의 학점은 "+getHakjum()+"이야~!");
		String h= getHakjum();
		System.out.printf("당신의 학점은 %s 입니다.",h);
	}
}