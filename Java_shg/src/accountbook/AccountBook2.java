package accountbook;

/* 클래스명 : AccountBook2
 * 수입, 지출내역을 관리하기 위한 가계부 클래스 */

public class AccountBook2 {
	/* 가계부 프로그램 구현하려고 한다. 이 때 필요한 클래스를 만들어보세요.
	 * 클래스 : 설계도(가계부 프로그램을 관리하기 위한 클래스) 
	 * */
		
	// 1. 멤버변수 선언
	private Item [] arr; // 가계부 내역들을 저장할 수 있는 배열
	private int count; // 저장된 내역들 갯수
	private int total; // 내역에 기입된 금액의 총 양
	
	// 2. getter, setter 설정 (setter는 필요없음( 이유 : 밖에서 값을 넣지 않고 메소드를 통해 변경해야 하기 때문)
	public int getCount() {
		return count;
	}
	public int getTotal() {
		return total;
	}
	
	// 3. 생성자 입력
	public AccountBook2(int max) {
		if(max <= 10) {
			max = 10;
		}
		arr = new Item[max];
	}	
	public AccountBook2() {
		this(10);
	}
		
	// 4. 메소드 생성
	/* 기능 : 내역(Item)이 주어지면 주어진 내역을 가계부에 저장하는 메소드
	 * 매개변수 : 수입/지출 내역 -> Item item
	 * 리턴타입 : 없음 -> void 
	 * 메소드명 : insert */
	public void insert (Item item) {
		// 가계부가 꽉차면 내역을 추가하지 않음
		if(count < arr.length) {
			arr[count] = item;
			count++;
			// 총 금액 계산
			total = total + item.calCost();	
		} else {
			throw new RuntimeException("가계부 내역이 가득 찼습니다.");
		}
	}
	/* 기능 : 수정할 번지와 수정할 내역이 주어지면 가계부를 수정하는 메소드
	 * 매개변수 : 수정할 번지, 수정할 내역 -> int index, Item item;
	 * 리턴타입 : 없음 -> void 
	 * 메소드명 : update */
	public void update(int index, Item item) {
		if(index < count && index >= 0) {
			// 총 금액 계산
			total = total - arr[index].calCost();
			total = total + item.calCost();
			arr[index]=item;	
		} else {
			throw new ArrayIndexOutOfBoundsException("잘못된 번지로 접근하고 있습니다.");
		}
	}	
	/* 기능 : 삭제할 번지가 주어지면 해당 번지에 있는 내역을 삭제하는 메소드
	 * 매개변수 : 삭제할 번지 -> int index
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : delete */
	public void delete(int index) {
		if(index >= count || index < 0) {
			throw new ArrayIndexOutOfBoundsException("잘못된 번지로 접근하고 있습니다.");
		}
		total = total - arr[index].calCost();
		// 삭제된 공간을 제거하기 위해 앞으로 하나씩 당겨줌 
		for(int i = 0; i < arr.length-1; i++) {
				arr[i] = arr[i+1];
		}
		// 삭제한 후 내역 갯수를 줄여줌
		count--;		
	}
	/* 기능 : 내역 전체를 간략히 확인하는 메소드
	 * 매개변수 : 없음 (멤버변수 이용)
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : printItemListSimple */
	public void printItemListSimple() {
		System.out.println("내역번호 | 타입 |  날짜  |  금액  |  내용");
		for(int i = 0; i < count; i++) {
			System.out.print((i+1)+"	");
			System.out.print(arr[i].getType()+" ");
			System.out.print(arr[i].getDate()+" ");
			System.out.print(arr[i].getCost()+" ");
			System.out.println(arr[i].getContents());
		}
	}
	/* 기능 : 내역 전체를 자세히 확인하는 메소드
	 * 매개변수 : 없음 (멤버변수 이용)
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : printItemListDetail */
	public void printItemListDetail () {
		for(int i = 0; i<arr.length; i++) {
			System.out.println("-----내역"+(i+1)+"-----");
			printItem(i);
		}
	}
	/* 기능 : 번지가 주어지면 주어진 번지의 내역을 확인하는 메소드
	 * 매개변수 : 번지 -> int index
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : printItem */
	public void printItem(int index) {
		if(index < count && index >= 0) {
			System.out.println("타입 : "+arr[index].getType());
			System.out.println("날짜 : "+arr[index].getDate());
			System.out.println("자산 : "+arr[index].getPaymentType());
			System.out.println("분류 : "+arr[index].getCategory());
			System.out.println("금액 : "+arr[index].getCost());
			System.out.println("내용 : "+arr[index].getContents());
		}
	}
	
	public AccountBook2(Item[] arr, int count, int total) {
		this.arr = arr;
		this.count = count;
		this.total = total;
	}

	
}

