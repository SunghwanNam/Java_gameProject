import java.util.Random;

//Unit을 부모 클래스로 Plant는 자식클래스로 상속받는다. 
public class Plant extends Unit {

	Plant() {
		super();
		this.name = "이상한 이상해씨";
		this.defense = 5;
	}

//이상해씨는 getPower라는 메소드에서 0~9까지의 랜덤넘버를 돌리고 만약 1일때 4배의 공격을 할 수 있게 한다.
	@Override
	public int getPower() {
		System.out.println("***" + this.name + "이(가) 공격합니다." + "***");
		Random r = new Random();
		int critical = r.nextInt(10);
		if (critical == 1) {
			System.out.println("<<  이상해씨의 치명타 공격!  >>");
			return this.attack * 4;
		} else {
			System.out.println("<<  이상해씨 공격!  >>");
			return this.attack;
		}

	}
}
