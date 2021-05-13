package day13;

import day12.AutoCar;
import day12.StickCar;

public class CarTest {

	public static void main(String[] args) {
		AutoCar ac = new AutoCar("1종","기아");
		StickCar sc = new StickCar("2종","현대");
		ac.turnOn();
		ac.setGear('D');
		ac.setGear('2');
		ac.print();
		System.out.println("------------");
		sc.print();
		System.out.println("------------");
		/* 클래스간 타입 변환
		 *  - 자동으로 가능한 경우
		 *    -> 자식클래스의 객체를 부모클래스로 변환시키는 경우 자동으로 가능
		 *   1) 자식클래스 객체 1 = new 자식클래스();
		 *   2) 부모클래스 객체 2 = 객체1;
		 *  - 명시적(강제)으로 가능한 경우
		 *    -> 부모클래스의 객체를 자식클래스로 변환시키는 경우 명시적(강제)으로 해야하는데 항상 가능한 것은 아님.
		 *  - 부모 객체가 자식클래스로 만들어진 경우 자식클래스로 변환시키는 경우 가능
		 *  - 부모 객체가 부모클래스로 만들어진 경우 자식클래스로 변환시킬 수 없다
		 *   (정보가 부모보다 자식이 더 많기 때문에 많은쪽(자식)에서 적은쪽(부모)의 기능은 만들 수 있지만 적은쪽(부모)에서 많은 쪽(자식)의 기능을 만들수 없다)
		 *   */

		/* 차를 관리하는데 수동은 수동끼리 자동은 자동끼리 관리 */
		AutoCar [] acList = new AutoCar[5];
		StickCar [] scList = new StickCar[5];
		acList[0]=ac;
		scList[0]=sc;
		/* 차를 관리하는데 수동과 자동 상관없이 같이 관리 */
		Car [] cList = new Car[5];
		cList[0]=ac; // 자식클래스의 객체를 부모클래스의 객체에서 같이 관리
		cList[1]=sc;
		
		Car c = ac;
		c.print();
		System.out.println("------------");
 		Car c2 = new Car("1종", "기아"); // 안되는 경우
//		Car c2 = new AutoCar("1종", "기아"); // 되는 경우
		ac=(AutoCar) c2;
		
	}

}
