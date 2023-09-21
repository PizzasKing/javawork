package abstracts.player;

public class PlayerMain {

	public static void main(String[] args) {
		//Player 인스턴스 생성
		Player player1 = new Player();
		player1.play(1);
		
		//중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player1.upgradeLevel(aLevel);
		player1.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player1.upgradeLevel(sLevel);
		player1.play(3);
	}

}
