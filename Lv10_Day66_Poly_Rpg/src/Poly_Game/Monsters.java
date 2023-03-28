package Poly_Game;

public class Monsters {
	private String name;
	private int attackPower;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
}

class Monsters_Dragon extends Monsters {
	public Monsters_Dragon() {
		super.setName("용");
		super.setAttackPower(100);
	}
}

class Monsters_Ghost extends Monsters {
	public Monsters_Ghost() {
		super.setName("유령");
		super.setAttackPower(50);
	}
}

class Monsters_Sans extends Monsters {
	public Monsters_Sans() {
		super.setName("스켈레톤");
		super.setAttackPower(250);
	}
}