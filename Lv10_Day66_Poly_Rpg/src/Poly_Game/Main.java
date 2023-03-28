package Poly_Game;

/*
 * Poly RPG GAME 완성하기
 * 
 * [ 기능 ]
 * - 유저관리 : 회원가입, 탈퇴, 로그인, 로그아웃
 * - 스테이지 (+맵 추가)
 * - 파티 기능
 * - 전투 기능 (+몬스터 추가)
 * - 상점 추가
 * - 창고 관리
 * - 데이터 처리 (파일 또는 db)
 * 
 * 1. 본인 깃 저장소에 프로젝트명 : "poly-rpg-console-game" 으로 커밋하고 시작
 * 2. 접근제어자 유의
 * 3 Singletone Pattern 적용
 * 4. 상속, 추상화, 인터페이스 적용
 * 6. 완성 후 -> UML ClassDiagram 작성해보기
 * 7. StringBuffer 사용
 * 8. BufferedReader & BufferedWriter 사용
 */

public class Main {
	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		boolean run = true;
		
		while(true) {
			run = gameManager.changeStage();
			if(run == false)
				break;
		}
		System.out.println("Game Over");
	}
}
