package day6;

import java.util.Calendar;

public class Enum3 {

	public static void main(String[] args) {
		
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR); // int year=now.get(1); 와 같음
		int month=now.get(Calendar.MONTH)+1; // int year=now.get(2); 와 같음
		System.out.println(year+"년"+" "+month+"월");
	}

}
