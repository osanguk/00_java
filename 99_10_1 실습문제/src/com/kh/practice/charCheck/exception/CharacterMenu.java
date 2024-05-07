package com.kh.practice.charCheck.exception;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하란 말이야 어서! 어서 입력하란 말이야!");
		String input = sc.nextLine();
		
		CharacterController controller = new CharacterController();
		try {
			int count = controller.countAlpha(input);
			System.out.println(" ' " + input + "   '  에 포함된 영문자 개수 :" + count);
		} catch (CharCheckException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}


