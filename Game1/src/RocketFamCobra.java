
//Unit을 상속받아 RocketFamCobra이라는 자식 클래스를 생성한다.
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
		// Override를 통해 부모클래스의 getPower를 덮어쓴다.
		System.out.println("***" + this.name + "이(가) 공격합니다." + "***");
		if (this.hp < 15) {
			// 해당 객체의 hp가 15보다 작을 경우 this.crazy의 값을 더해 반환한다.
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
