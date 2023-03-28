package Poly_Game;

import java.util.ArrayList;

public class Inventory extends Shop{
	ArrayList<Item> itemlist = new ArrayList();
	
	public void inventoryMenu() {
		while(true) {
			System.out.println("[ 인벤토리 메뉴 ]");
			System.out.println("[1] 착용");
			System.out.println("[2] 판매");
			System.out.println("[3] 뒤로가기");
			
		}
	}
}
