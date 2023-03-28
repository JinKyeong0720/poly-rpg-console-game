package Poly_Game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameManager {
	static Scanner scan = new Scanner(System.in);
	static String nextStage = "";
	String currentStage = "";
	Map<String, Stage> stageList = new HashMap<String, Stage>();
	
	GameManager(){
		stageList.put("TITLE", new StageTitle());
		stageList.put("BATTLE", new StageBattle());
		
		
	}
	
	boolean changeStage() {
		System.out.println("Current Stage : ");
		System.out.println("Next Stage : ");
		
		if(currentStage.equals(nextStage))
			return true;
		
		currentStage = nextStage;
		Stage stage = stageList.get(currentStage);

		boolean run = true;
		while(true) {

		}
		
		
		
	}
	
	
}
