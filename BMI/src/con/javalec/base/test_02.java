package con.javalec.base;

import java.util.Scanner;

public class test_02 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] intNum = {0,1,2,3,4,5,6,7,8,9};
//		int i = 0;
//		int j = 0;
//		Scanner scanner = new Scanner(System.in);//
//		
//		for(i = 1; i<intNum.length; i++) {
//			
//			
//			System.out.print(intNum[4] + "x" + i + "=" + i*intNum[4]+"\t");
//			System.out.print(intNum[5] + "x" + i + "=" + i*intNum[5]+ "\t");
//			System.out.print(intNum[6] + "x" + i + "=" + i*intNum[6]+ "\t");
//			System.out.println(intNum[7] + "x" + i + "=" + i*intNum[7]+ "\t");
//		}
		
//		
//		//String.format()
//		int num = 8;
//		double dNum = 12.34567;
//		String str = "abcdefg";
//		System.out.println("AAA : "+String.format("%1d", num)); //d int(정수)
//		System.out.println("BBB : "+String.format("%5.2f", dNum)); //f double(실)
//		System.out.println("CCC : "+String.format("%10s", str));  //S string (문)
		
		int i = 0;
		int po = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Input your decimal no. :" + po);
		po = scanner.nextInt();
		
		for(i=1; i <= po; i++) {
			if(i>0) {
			}
		}
		System.out.println(po + "'s factorial value"+ " = " + po*(i+1));
		
	}

}
