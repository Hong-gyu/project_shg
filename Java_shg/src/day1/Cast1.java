package day1;

public class Cast1 {

	public static void main(String[] args) {
		
		// 타입변환

		byte num1 = 1;
		int num2 = num1; // 서로 타입이 다를때 타입 변환됨(인트보다 바이트가 작음)
		// 자동 타입변환(정수에서 실수로, 작은범위에서 큰 범위로 변환할때 자동으로 변환됨 따로 안 알려줘도 됨) vs 강제 타입변환(자동 타입변환이 안되는 경우, 강제로 변환시켜야 함)
		// 자동 타입변환에는 데이터 손실이 없음
		double dnum1 = num2; // 인트는 정수 더블은 실수 (실수가 더 큼)
		int num3 = (int)1.23;
		// 변수나 값 앞에 (변수타임)을 써줘야한다
		System.out.println(num3);
		
		
		
		
	}

}
