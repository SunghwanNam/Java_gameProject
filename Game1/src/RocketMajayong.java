import java.util.Random;

//Unit을 상속받아 RocketMajayong이라는 자식 클래스를 생성한다.
public class RocketMajayong extends Unit {
	RocketMajayong() {
		super();
		this.name = "로켓단 마자용";
		this.hp = 110;
		this.defense = 5;
	}

	@Override
	public int getPower() {
		//Override를 통해 부모클래스의 getPower를 덮어쓴다.
		System.out.println("***" + this.name + "이(가) 공격합니다." + "***");
		Random r = new Random();
		int critical = r.nextInt(3);
		// 1/3의 확률로 3배의 공격력을 반환한다. 
		if (critical == 1) {
			System.out.println("<<  마자~~~~~~~용!  >>");
			return this.attack * 3;
		} else {
			System.out.println("<<  마자용!!!!  >>");
			return this.attack;
		}
	}
}
