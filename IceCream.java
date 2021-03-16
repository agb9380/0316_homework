package s0316;

import java.util.Scanner;

public class IceCream {
	String name;
	int price;
	int sum=0;
	
	Scanner sc = new Scanner(System.in);

	void setName() {
		System.out.println("이름 입력: ");
		String s = sc.nextLine();
		name = s;
	}

	void setPrice() {
		System.out.println("가격 입력: ");
		int p = sc.nextInt();
		price = p;
	}

	void setMember(IceCream[] ice) {
		for (int i = 0; i < ice.length; i++) {
			System.out.println("***" +(i+1)+ "번째 아이스크림 구매정보 입력 ***");
			ice[i].setName();
			ice[i].setPrice();
		}
	}

	void print(IceCream[] ice) {
		System.out.println("번호  아이스크림명  아이스크림 가격");
		for (int i = 0; i < ice.length; i++) {
			System.out.println((i+1)+"    "+ice[i].name+"      "+ice[i].price);
		}
	}

	int getIce() {
		System.out.println("아이스크림을 몇 개 구입하시겠습니까? :");
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	/*IceCream[] iceArr(int iceNum) {
		IceCream[] icecreamNum = new IceCream[iceNum];
		for (int i = 0; i < iceNum; i++) {
			icecreamNum[i] = new IceCream();
		}
		return icecreamNum;
	}*/
	
	void iceSum(IceCream[] ice) {
		for(int i=0; i < ice.length; i++) {
			sum += ice[i].price ;
		}System.out.println("총계 :"+ sum);
	}
	
	

}
