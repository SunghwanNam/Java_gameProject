public class Fire extends Unit {
	int defence;
	int hellfire;

	Fire() {
		super();
		this.name = "지옥불꽃 파이리";
		this.hp = 100;
		this.attack = 10;
		this.defence = 2;
		this.hellfire = 20;
	}

	@Override
	public int getPower() {
		System.out.println("***" + this.name + "이(가) 공격합니다." + "***");
		if (this.hp < 10) {
			System.out.println("<< 최후의 불꽃! >>");
			return this.attack + this.hellfire;
		} else {
			System.out.println("<< 싹 다 녹여주지  지옥불꽃 !>>");
			return this.attack;

		}
	}
}
