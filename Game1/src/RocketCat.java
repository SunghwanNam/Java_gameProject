import java.util.Random;

//Unit을 상속받아 RocketCat이라는 자식 클래스를 생성한다.
public class RocketCat extends Unit {
	RocketCat() {
		super();
		this.name = "인생 끝자락에 선 나옹이";
		this.hp = 100;
		this.attack = 12;
		this.defense = 4;
	}

	@Override
	public int getPower() {
		// Override를 통해 부모클래스의 getPower를 덮어쓴다.
		System.out.println("***" + this.name + "이(가) 공격합니다." + "***");
		Random random = new Random();
		int randAttack = random.nextInt(10) + 1;
		if (randAttack == 3) {
			// 1/10의 확률로 공격력의 4배값을 반환한다.
			System.out.println("<< 인생 끝자락에 선 나옹이의 할퀴기!  >>");
			return this.attack * 4;
		} else if (randAttack != 3) {
			System.out.println("<<  인생 끝자락에 선 나옹이의 몸통박치기!  >>");
		}
		return this.attack;

	}
}