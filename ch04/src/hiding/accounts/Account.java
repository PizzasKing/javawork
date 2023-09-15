package hiding.accounts;

// 은행 통장 계좌 자료형 생성
// 정보 은닉 및 캡슐화 - private 사용
public class Account {
	private String ano; // 계좌 번호
	private String owner; // 계좌주
	private int balance; // 잔고
	
	// 기본 생성자
	public Account() {}
	
	// 매개변수 있는 생성자
	public Account(String a, String own, int bal) {
		this.ano = a;
		this.owner = own;
		this.balance = bal;
	}
	
	// get(), set() 매서드 생성
	// 방법: set+필드이름() - 필드 첫글자는 대문자
	public void setAno(String a) { // 매개변수로 계좌번호 전달
		ano = a;
	}
	public String getAno() {
		return ano;
	}
	public void setOwner(String own) {
		owner = own;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(int bal) {
		balance = bal;
	}
	public int getBalance() {
		return balance;
	}
}
