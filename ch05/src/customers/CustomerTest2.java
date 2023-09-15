package customers;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer lee = new Customer(1001, "이순신");
		
		int price = 10000;
		int cost = lee.calcPrice(price);
		
		System.out.println(lee.getCustomerName()+ "님이 지불한 비용은 "+cost+"원 입니다.");
		System.out.println(lee.showCustomerInfo());

	}

}
