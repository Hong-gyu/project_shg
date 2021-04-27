package day2;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 조건선택 연산자 예제
		// 조건식 : 결과가 참 또는 거짓으로 나오는 식(비교연산자나 논리연산자가 들어감)
		
		// (조건) ? 참 : 거짓
		int num = 5;
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "는 " + result);
		
		int num2 = 100;
		String result1 = (num2 >= 100) ? "100과 같다" : "100과 같지 않다";
		System.out.println(num2 + "는 "+ result1);
		
		// 연산자 종류를 보고 결과값이 어떤것이 나올지 예측을 할 수 있어야 함
		
	}

}
