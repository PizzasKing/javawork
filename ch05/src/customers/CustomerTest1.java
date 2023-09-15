package customers;

public class CustomerTest1 {

	public static void main(String[] args) {
		// 일반 고객 1명, vip1명의 객체 생성
		Customer lee = new Customer();
		lee.setCustomerId(10000);
		lee.setCustomerName("홍길동");
		
		int price=10000;
		lee.calcPrice(price);
		System.out.println((lee.showCustomerInfo()));

		VIPCustomer woo = new VIPCustomer();
		woo.setCustomerId(1111);
		woo.setCustomerName("우영우");
		System.out.println(woo.showCustomerInfo());
	}

}
