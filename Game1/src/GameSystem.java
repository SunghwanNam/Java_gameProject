import java.util.Scanner;

public class GameSystem {
	int whosFisrt = -1;

	public void Gamesetting() {
		boolean check = true;
		Scanner scanner = new Scanner(System.in);
		while (check) {
			if (this.whosFisrt == 0 || this.whosFisrt == 1) {
				check = false;
				break;
			}
			System.out.println("선공을 정해주세요 숫자로 입력해요주세요");
			System.out.printf("포켓몬 팀 : %d    로켓단 팀 : %d", 0, 1);
			this.whosFisrt = scanner.nextInt();
		}
	}

}