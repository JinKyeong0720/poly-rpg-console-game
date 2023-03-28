package Poly_Game;

public class StageTitle {

	private boolean update() {
		System.out.println("==== TEXT RPG ====");
		System.out.println("[ 시작 ]을 입력하면 게임이 실행됩니다.");
		String start = GameManager.scan.next();
		
		if(start.equals("시작"));
		GameManager.nextStage = "LOBBY";
		return false;
	}
	
	public void init() {
		
	}
}
