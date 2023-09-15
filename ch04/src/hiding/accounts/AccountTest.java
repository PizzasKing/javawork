package hiding.accounts;

public class AccountTest {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		Account account = new Account();
		// 보통 멤버에 직접 접근 못하도록 제한을 둠
		// account.ano = "111-222-3333";
		// account.owner = "홍길동";
		// 멤버 매서드에 접근 가능
		account.setAno("111-222-3333");

		System.out.println(account.getAno());
		account.setOwner("홍길동");
		System.out.println(account.getOwner());
		account.setBalance(10000);
		System.out.println(account.getBalance());

	}

}