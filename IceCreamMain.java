
package s0316;

import java.util.Scanner;

public class IceCreamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("아이스크림 몇 개 구입할꺼야? :"); 
		int iceNum = sc.nextInt();

		IceCream[] iceArr = new IceCream[iceNum]; 

		for (int j = 0; j < iceNum; j++) {
			iceArr[j] = new IceCream(); 
		}
		
		iceArr[0].setMember(iceArr);
		iceArr[0].print(iceArr);
		iceArr[0].iceSum(iceArr);
		
	}
}