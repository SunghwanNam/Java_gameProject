
public class RocketFamCobra extends Unit {
	int defence;
	int crazy;

	RocketFamCobra() {
		super();
		this.name = "공과금 밀린 코브라";
		this.hp = 100;
		this.attack = 10;
		this.defence = 3;
		this.crazy = 30;
	}

	@Override
	public int getPower() {
		System.out.println("***" + this.name+"이(가) 공격합니다." + "***");
		if (this.hp < 15) {
			System.out.println("<< 독 물어뜯기! >>");
			return this.attack + this.crazy;
		} else {
			System.out.println("<< 뼛가루로 만들어주지 미친듯이 물어뜯기 !>>");
			return this.attack;

		}
	}

	@Override
	public String toString() {
		return this.name;
	}
}
