import java.util.Random;

//Unit을 부모 클래스로 Water는 자식클래스로 상속받는다. 
public class Water extends Unit {
	Water() {
		super();
		this.name = "꼬북꼬북 꼬부기";
		this.hp = 100;
		this.attack = 10;
		this.defense = 5;
	}

	// 1~10까지의 랜덤넘버를 돌려 랜덤넘버가 5일때 또는 7일때 3배의 어택을 시킨다.
	@Override
	public int getPower() {
		System.out.println("***" + this.name + "이(가) 공격합니다." + "***");
		Random random = new Random();
		int randAttack = random.nextInt(10) + 1;
		if (randAttack == 5 || randAttack == 7) {
			System.out.println("<< 꼬북꼬북 꼬부기의 물대포! >>");
			return this.attack * 3;
		} else if (randAttack != 5 || randAttack != 7) {
			System.out.println("<< 꼬북꼬북 꼬부기의 몸통박치기! >>");
			return this.attack * 1;
		}
		return this.attack;
	}
}