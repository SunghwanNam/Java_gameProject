import java.util.Random;

//Unit을 상속받아 RocketMaryl이라는 자식 클래스를 생성한다.
public class RocketMaryl extends Unit {
	public RocketMaryl() {
		super();
		this.name = "마릴";
	}

	@Override
	public int getPower() {
		// Override를 통해 부모클래스의 getPower를 덮어쓴다.
		Random r = new Random();
		int check = r.nextInt(10);
		if (check == 0) {
			// 1/10의 확률로 2배의 공격력을 반환한다.
			System.out.printf("마릴이 %d만큼 공격합니다.", this.attack * 2);
			return this.attack * 2;
		} else {
			System.out.printf("마릴이 %d만큼 공격합니다.", this.attack);
			return this.attack;
		}
	}
}
