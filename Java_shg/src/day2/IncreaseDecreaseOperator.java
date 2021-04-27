package day2;

public class IncreaseDecreaseOperator {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 10;
			System.out.println("  num1 = " +   num1 + ",   num2 = "   + num2);
			System.out.println("++num1 = " + ++num1 + ", num2++ = "   + num2++); // 증감연산자를 어디에 어떻게 넣었을때 변화가 될지 생각해야함
			System.out.println("  num1 = " +   num1 + ",   num2 = "   + num2);
			
			System.out.println(num1);	
			
			num1++;
			System.out.println(num1);
			
			++num1;
			System.out.println(num1);	
			// 이 때 num1 을 출력하면 얼마?
			// 
			
			num1 = 10;
			num2 = 10; 
			
			System.out.println("  num1 = " +   num1 + ",   num2 = "   + num2);
			
			
			num1++;  // 여기서 num1 은 11 ++num1; 와 같음
			System.out.println("++num1 = " +   num1 + ", num2++ = "   + num2); // 증감연산자를 어디에 어떻게 넣었을때 변화가 될지 생각해야함
			++num2;  // 여기서 num2 는 11 num2++; 와 같음
			
			
			System.out.println("  num1 = " +   num1 + ",   num2 = "   + num2);
			
			
			
		System.out.println("0");
		System.out.println(num1);
		System.out.println(num2);	
		System.out.println(++num1);
		System.out.println(++num2);	
		System.out.println(num1++);
		System.out.println(num2++);
		System.out.println(--num1);
		System.out.println(--num2);
		System.out.println(num1--);
		System.out.println(num2--);
		

	}

}
