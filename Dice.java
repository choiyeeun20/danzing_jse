package com.jse.app;
import java.util.Scanner;
import java.util.Random;
// 시나리오 항상 기억하기
public class Dice {
	public static void main(String[] args) {
		ifdice();
		
	}
	static void switchDice() {
	System.out.println("주사위 홀짝 맞추기 게임");
	System.out.println("기대하는 값 홀/짝을 입력해 주세요.");
	Scanner scanner = new Scanner(System.in);
	String expect = scanner.next();
	System.out.println(String.format("사용자가 입력한 값: %s", expect));
	Random random = new Random();
	int dice = scanner.nextInt(4);
	System.out.println(String.format("컴퓨터가 생성한 값: %s", dice));
	String result= "";
	switch(dice) {
	case 1: case 3: case 5: result = "홀"; break;
	case 2: case 4: case 6: result = "짝"; break;
	System.out.println("컴퓨터의 결과 :짝");
	String result2 = "틀림";
	if(expect.equals(result)) {
		result2 = "맞음";
		}
	System.out.println(String.format("결과 : %s", result2));
	}

	
	
	
	
	static void ifdice() {
		System.out.println("***주사위 홀짝 맞추기 게임***");
		System.out.println("기대하는 값 홀/짝을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println("사용자 홀짝 예상값 :" +  expect);
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		System.out.println("컴퓨터가 생성한 값" + dice);
		String result ="";
		if(dice ==1) {
			result = "홀";
		}if(dice ==2) {
			result = "짝";
		}if(dice ==3) {
			result = "홀";
		}if(dice ==4) {
			result = "짝";		
		}if(dice ==5) {
			result = "홀";	
		}else {
			result = "짝";
		}
		System.out.println("컴퓨터 홀짝 결과:"+ result);
		if(expect.equals(result)) {//object type의 operation은 method로 처리한다.
			System.out.println("매칭 결과 : 맞음");
		}else {
		System.out.println("매칭결과 : 틀림");
		
	}
	
	}	
} //class end


