package s0316;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();

		System.out.println("첫 번째 정수 입력: ");
		int num1 = c.getNum();

		System.out.println("두 번째 정수 입력: ");
		int num2 = c.getNum();

		c.sum(num1, num2);
		c.sub(num1, num2);
		c.multi(num1, num2);
		c.div(num1, num2);

		c.check(num1);
		System.out.println();
		c.check(num2);
		System.out.println();
	}
}