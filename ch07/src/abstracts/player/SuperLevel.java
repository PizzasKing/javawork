package abstracts.player;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 jump 합니다");
	}

	@Override
	public void turn() {
		System.out.println("turn 합니다");
		System.out.println();
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 상급자 레벨입니다 ***");
	}

}
