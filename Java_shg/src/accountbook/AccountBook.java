package accountbook;

public class AccountBook {

	public static void main(String[] args) {
		/* 가계부 프로그램 구현하려고 한다. 이 때 필요한 클래스를 만들어보세요.
		 * 클래스 : 설계도
		 * 구분(게시글 번호 처럼 배열로 해서 작성순서 저장) 
		 * 날짜(registerDate)
		 * 입출금분류(입금, 출금)(int or string)
		 * 입금분류(월급, 용돈, 이자, 기타수익, ...)(string)
		 * 입금액(int)
		 * 입금처(회사명, 사람이름, ... )(string)
		 * 입금내용(5월 월급, 금요일 점심값, 이자, ...)(string)
		 * 입금방법(현금, 계좌이체)(int or string)
		 * 출금분류(관리비, 통신비, 교통비, 보험, 식비, ... )(string)
		 * 출금액(int)
		 * 출금처(한국아파트, SK텔레콤, 한국택시, 한국보험, 김밥천국, ... )(string)
		 * 출금내용(5월 관리비 지출, 점심값 지출, ... )(string) 
		 * 출금방법(현금결제, 계좌이체, 카드결제)(int or string)
		 * */
		
		/* 객체 지향 -> 사용자가 편리하게 이용할 수 있도록
		 * 구분 : 자동 생성
		 * 입출금 분류
		 * */
		
		/* 기능
		 *  1. 가계부 입력 ( 입출금 분류 - 날짜 - 분류 - 금액 - 처 - 내용 - 방법 순으로 입력)
		 *  2. 잔액 확인 ( 총 입금액 - 총 출금액)
		 *  3. 작성 내용 확인 ( 게시글 번호 조회 - 게시글 했던거 참조)
		 *  4. 작성 내용 상세 확인 ( 게시글 상세 조회 - 게시글 했던거 참조)
		 *  3. 프로그램 종료*/

	}

}

class AccountBook1 {
	// 멤버변수 선언
	private int boardNum;
	private String Type;
	private int registerDate;
	private String inputType;
	private int inputMoney;
	private String inputWhere;
	private String inputContents;
	private String inputMethod;
	private String outputType;
	private int outputMoney;
	private String outputWhere;
	private String outputContents;
	private String outputMethod;

	// 메소드 구현
	public void print () {
		System.out.println("번호 : " + boardNum);
		System.out.println("날짜 : " + registerDate);
		System.out.println("구분 : " + Type);
		System.out.println("입금구분 : " + inputType);
		System.out.println("입금액 : " + inputMoney);
		System.out.println("입금처 : " + inputWhere);
		System.out.println("입금내용 : " + inputContents);
		System.out.println("입금방법 : " + inputMethod);
		System.out.println("입금구분 : " + outputType);
		System.out.println("입금액 : " + outputMoney);
		System.out.println("입금처 : " + outputWhere);
		System.out.println("입금내용 : " + outputContents);
		System.out.println("입금방법 : " + outputMethod);
	}
//	private int boardNum;
//	private int registerDate;
//	private String Type;
//	private String inputType;
//	private int inputMoney;
//	private String inputWhere;
//	private String inputContents;
//	private String inputmethod;
//	private String outputType;
//	private int outputMoney;
//	private String outputWhere;
//	private String outputContents;
//	private String outputmethod;
	
	// getter, setter 생성
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(int registerDate) {
		this.registerDate = registerDate;
	}
	public String getInputType() {
		return inputType;
	}
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}
	public int getInputMoney() {
		return inputMoney;
	}
	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}
	public String getInputWhere() {
		return inputWhere;
	}
	public void setInputWhere(String inputWhere) {
		this.inputWhere = inputWhere;
	}
	public String getInputContents() {
		return inputContents;
	}
	public void setInputContents(String inputContents) {
		this.inputContents = inputContents;
	}
	public String getInputMethod() {
		return inputMethod;
	}
	public void setInputMethod(String inputMethod) {
		this.inputMethod = inputMethod;
	}
	public String getOutputType() {
		return outputType;
	}
	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}
	public int getOutputMoney() {
		return outputMoney;
	}
	public void setOutputMoney(int outputMoney) {
		this.outputMoney = outputMoney;
	}
	public String getOutputWhere() {
		return outputWhere;
	}
	public void setOutputWhere(String outputWhere) {
		this.outputWhere = outputWhere;
	}
	public String getOutputContents() {
		return outputContents;
	}
	public void setOutputContents(String outputContents) {
		this.outputContents = outputContents;
	}
	public String getOutputMethod() {
		return outputMethod;
	}
	public void setOutputMethod(String outputMethod) {
		this.outputMethod = outputMethod;
	}

	// 생성자
	public AccountBook1(int boardNum, String type, int registerDate, String inputType, int inputMoney,
			String inputWhere, String inputContents, String inputMethod, String outputType, int outputMoney,
			String outputWhere, String outputContents, String outputMethod) {
		this.boardNum = boardNum;
		Type = type;
		this.registerDate = registerDate;
		this.inputType = inputType;
		this.inputMoney = inputMoney;
		this.inputWhere = inputWhere;
		this.inputContents = inputContents;
		this.inputMethod = inputMethod;
		this.outputType = outputType;
		this.outputMoney = outputMoney;
		this.outputWhere = outputWhere;
		this.outputContents = outputContents;
		this.outputMethod = outputMethod;
	}
	

	
	
	
}

