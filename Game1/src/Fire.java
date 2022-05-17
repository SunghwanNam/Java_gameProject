
//Unit을 부모 클래스로 Fire는 자식클래스로 상속받는다. 
public class Fire extends Unit {
	int hellfire;

	Fire() {
		super();
		this.name = "지옥불꽃 파이리";
		this.hp = 100;
		this.attack = 10;
		this.defense = 2;
		this.hellfire = 20;
	}

//파이리는 hp가 10보다 작을때 Fire 클래스에 hellfire라는 프로퍼티를 만들어 20의 공격을 추가 시킨다. 
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
