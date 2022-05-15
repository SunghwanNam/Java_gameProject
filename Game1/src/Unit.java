
public class Unit {
	String name;
	int hp;
	int attack;
	int defense;

	Unit() {
		this.name = "로켓단";
		this.hp = 100;
		this.attack = 10;
		this.defense = 1;
	}

	public void underAttack(int power) {
		if (this.hp < 1) {
//			System.out.println("[ 이미 사망한 상태의 <" + this.name + ">을(를) 공격할 수 없습니다. ]");
			return;
		} else {
			int damage = (power - this.defense);
			System.out.println(this.name + "이(가) " + damage + "의 피해를 입었습니다.");
			this.hp = this.hp - damage;
			System.out.println(this.name + "의 현재 체력 : " + this.hp);
			if (this.hp < 1) {
				System.out.println("===" + this.name + "이(가) 사망했습니다.===");
			}
		}
	}

	public int getPower() {
		if (this.hp < 1) {
			System.out.println("사망하여 공격 불가!");
			return this.attack = 0;
		} else

			System.out.println("***" + this.name + "이(가) 공격합니다." + "***");
		System.out.println("<<일반 공격!!>>");
		return this.attack;
	}

	public boolean isLive() {
		if (this.hp <= 0) {
//			System.out.println(this.name + "이(가) 사망했습니다.");
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}