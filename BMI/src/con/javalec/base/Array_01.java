package con.javalec.base;

public class Array_01 {

	public static void main(String[] args) {
		// 배열(Array)
		// 문자열 7개를 넣을 수 있는 배열 공간 만들기.
	
//		
//		String[] str = new String[7];
//		
//		str[0] = "일요일";
//		str[1] = "월요일";
//		str[2] = "화요일";
//		str[3] = "수요일";
//		str[4] = "목요일";
//		str[5] = "금요일";
//		str[6] = "토요일";
//	
//		for(int i = 0; i<str.length; i++) {
//			System.out.println(str[i]);
//			
//		}
//		System.out.println(str.length);
//		*/
		
//		배열의 초기 값을 넣고 작업하기
//		
//		int[] intNum = {1,5,8,12,200,1002};
//		int tot=0; 
//		double avg = 0.0;
////		
////		// 배열에 데이터 확인!!
////		for(int i=0; i<intNum.length; i++) {
////			System.out.println(intNum[i]);
////		}
//		-------------------------------------------------
//		// 배열의 평균 구하기
//		
////		for(int i=0; i<intNum.length; i++) {
////			sum += intNum[i];
////		}
////		avg = sum / intNum.length;
////		System.out.println(avg);
////		
////		
//		for(int i=0; i<intNum.length; i++) {
//			tot += intNum[i];
//		}
//		avg = (double)tot / intNum.length;
//	
//		System.out.println("평균:" + avg);
////		intNum[i]/intNum.length;
		
//		-------------------------------------------------
		
		//  배열에 해당하는 구구단 출력하라.
		
		
		int[] intNum = {5,3,9};
		int i = 0;
		int j = 0;
		for(i=1; i<=9; i++) {
			for(j=0; j<intNum.length; j++) {
//				if(j < intNum.length) {
					System.out.print(intNum[j] + "x" + i + "=" + intNum[j]*i +  "\t");
//				}
				
				
//				System.out.println(i + "x" + j + "=" + i*j +  "\t");
			}
			System.out.println();
		}
		
		
		
	}


	}


