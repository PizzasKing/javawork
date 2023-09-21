package nestedclass.interfaces;

public class ButtonTest {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		CallListener call = new CallListener();

		button.setListener(call);
		button.touch();
		
		
		button.setListener(new MessageListener());
		button.touch();
		
		
		//사진찍기 구현
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
				
			}
		});
		button.touch();
	}

}
