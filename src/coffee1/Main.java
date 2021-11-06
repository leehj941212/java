package coffee1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		InsertCoin insertCoin = new InsertCoin();
		NumberCheck numberCheck = new NumberCheck();

		NowCoin nowCoin = new NowCoin(0);

		insertCoin.plus(nowCoin, 100);

		System.out.println(nowCoin.getCoin());

		String ifNumber = "22a";

		try {
			int number = Integer.parseInt(ifNumber);
		} catch (Exception e) {
			System.out.println("숫자ㅣ가 아닙니다");
		}

		if (!numberCheck.isNumber(ifNumber)) {
			System.out.println("숫자ㅣ가 아닙니다");
		}

	}

}
