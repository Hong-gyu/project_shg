package day1;

import java.util.Scanner;

public class SoloTest {

	public static void main(String[] args) {
		// 
		
	      int num1;
	      int num2;
	        
	      System.out.print("두 정수와 산술연산자를 입력하세요 : ");
	      Scanner scan = new Scanner(System.in);
	      num1=scan.nextInt();
	      char chr = scan.next().charAt(0);
	      num2=scan.nextInt();
	      
	      if(chr=='+') {
	    	  System.out.println(num1+" "+chr+" "+num2 + " = " + (num1+num2));   	  
	      } else if (chr=='-') {
	    	  System.out.println(num1+" "+chr+" "+num2 + " = " + (num1-num2));   	  
	      } else if (chr=='*') {
	    	  System.out.println(num1+" "+chr+" "+num2 + " = " + (num1*num2));   	  
	      } else if (chr=='/') {
	    	  System.out.println(num1+" "+chr+" "+num2 + " = " + (num1/num2));   	  
	      } else if (chr=='%') {
	    	  System.out.println(num1+" "+chr+" "+num2 + " = " + (num1%num2));   	  
	      }
		
		

	}

}
