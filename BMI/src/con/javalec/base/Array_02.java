package con.javalec.base;

import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int i = 0;
		int[] intNum = {number};
		int tot = 0;
		int avg;

		for (i = 0; i <= number; i++) {
			if (i < 5) {

				System.out.println("점수를 입력 하세요");
				number = scanner.nextInt();
				for (i = 0; i < intNum.length; i++) {
					tot += number;
			}
				System.out.println("합계는"+tot);
			}

		}

	}

}
