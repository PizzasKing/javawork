package hiding.accounts;

public class AccountTest2 {

	public static void main(String[] args) {
		// 생성자를 통해서 계좌정보 입력
		Account account = new Account("111-222-3333", "홍길동", 10000);

		System.out.println(account.getAno());

		System.out.println(account.getOwner());

		System.out.println(account.getBalance());

	}

}