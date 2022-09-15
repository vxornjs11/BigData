package con.javalec.base;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] number = new int[5];
//		Scanner scanner = new Scanner(System.in);
//		int total = 0;
//		double avg = 0.0;
//		
//		// 입력 받아오기.
//	
//		for(int i=0; i<number.length; i++) {
//			System.out.println(i+1 + "번의 숫자를 입력 하세요");
//			number[i] = scanner.nextInt();
//			total += number[i];
//			
//		}
//		avg = (double)total / number.length;
//		System.out.println("합계 : "+total + " 평균 : "+ avg);
		
		//	배열을 이용하여 james.Cathy.Kenny.Martin.Crystal의 키(신장를 입력받아
		// 평균값을 구하고 이들 중 가장 큰 학생의 이름과 키, 가작 작은 학생의 이름과 키를 구하라.
		
		String[] names = {"James","Cathy","Kenny","Martin","Crystal"};
		int [] height = new int [names.length];
		double avg = 0.0;
		int min= 100000;
		int minindex =0;
		int max= height[0];
		int maxindex = 0;
		int total =0;
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (i = 0; i<height.length; i++) {
			
			System.out.println (names[i] + "학생의 키를 입력하세요");
			height[i] = scanner.nextInt();
			total += height[i];
		if (max < height[i])  {
			max = height[i]; 
			maxindex = i;
			
		}if (min > height[i]) {
			min =  height[i];
			minindex = i;
		}
		
		}
		avg = (double)total / height.length;
		
		
		System.out.println("평균 키 :" + avg +" 최대 키 : " + max + "이고 이름은 "+ names[maxindex]  + "이다. 최소 키 : " + min+ " 이고 학생의 이름은 "+ names[minindex] + 
				"이다.");
		
		}

}

