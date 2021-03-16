package s0316;

import java.util.Scanner;

public class Calculator {

	Scanner sc = new Scanner(System.in);

	int getNum() {
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	void sum(int num1, int num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}

	void sub(int num1, int num2) {
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
	}

	void multi(int num1, int num2) {
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
	}

	void div(int num1, int num2) {
		System.out.println(num1 + "/" + num2 + "=" + (num1 / (double) num2));
	}

	void check(int num) {

		boolean search = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				search = false;
			}
		}
		if (search == true) {
			System.out.println(num + " 소수체크 :" + true);
		} else {
			System.out.println(num + " 소수체크 :" + false);
		}

	}
}