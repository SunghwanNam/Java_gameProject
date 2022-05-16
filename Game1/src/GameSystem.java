import java.util.Scanner;

public class GameSystem {
	
	//whosFirst의 값이 0과1이므로 혹시모를 오류를 대비하여 초기값을 -1로 정하였다.
	int whosFisrt = -1;

	public void Gamesetting() {
		boolean check = true;
		Scanner scanner = new Scanner(System.in);
		//스캐너로 받은 값이 0또는 1일때 check값을 0또는 1로 주어서 루프 탈출을 할 수 있게 하였다. 아니면 반복이 된다. 
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