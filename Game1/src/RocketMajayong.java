import java.util.Random;

public class RocketMajayong extends Unit {
	RocketMajayong() {
		super();
		this.name = "로켓단 마자용";
		this.hp = 110;
		this.defense = 5;
	}

	@Override
	public int getPower() {
		System.out.println("***" + this.name+"이(가) 공격합니다." + "***");
		Random r = new Random();
		int critical = r.nextInt(3);
		if (critical == 1) {
			System.out.println("<<  마자~~~~~~~용!  >>");
			return this.attack * 3;
		} else {
			System.out.println("<<  마자용!!!!  >>");
			return this.attack;
		}
	}
}
