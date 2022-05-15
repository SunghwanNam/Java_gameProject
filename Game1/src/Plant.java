import java.util.Random;

public class Plant extends Unit {

	Plant() {
		super();
		this.name = "이상한 이상해씨";
		this.defense = 5;
	}

	@Override
	public int getPower() {
		System.out.println("***" + this.name+"이(가) 공격합니다." + "***");
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
