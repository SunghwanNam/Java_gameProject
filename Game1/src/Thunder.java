import java.util.Random;

public class Thunder extends Unit {
	Thunder() {
		super();
		this.name = "지옥의 피카츄";
	}

	@Override
	public int getPower() {
		System.out.println("***" + this.name+"이(가) 공격합니다." + "***");
		if (this.hp < 30) {
			System.out.println("<< 삐약삐약아아앜ㅋㅋ~~~ >>");
			return this.attack * 2 + this.hp + 10;
		}else if (this.hp<10) {
			System.out.println("<< 피카츄가 지옥펀치를 날립니다. >>");
			return this.attack * 4 + this.hp + 10;
		} 
		else {
		System.out.println("<< 삐까삐까~~ >>");
			return this.attack ;
		}
	}
}