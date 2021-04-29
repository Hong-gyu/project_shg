package day4;

public class Continue {

	public static void main(String[] args) {
		/* Continue - 스킵, 특정 위치로 이동
		 * for 문에서 continue를 만나면 증감식으로 이동
		 * while 문에서는 continue를 만나면 조건식으로 이동
		 * 항상 if문과 같이 쓰임(continue 단독 활용 불가) if문과 같이 안쓰이면 continue 아래 코드를 지운거랑 같음
		 * */
		
		int i;
		for( i=1 ; i<=5 ; i+=1) {
			if(i==2) {    // 뭔가를 스킵하고싶을때 if를 넣고 그 값을 조건식으로 넣은 후 밑에 continue;
				continue;
			}
			System.out.println(i);
			// continue;
			// System.out.println("Hello"); 컨디뉴 때문에 여기까지 코드실행이 안됨
		}
		

	}

}
