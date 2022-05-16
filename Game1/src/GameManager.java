import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameManager {
	public void playGame() {
		Unit[] team0 = { new Fire(), new Plant(), new Thunder(), new Water() };
		Unit[] team1 = { new RocketMajayong(), new RocketFamCobra(), new RocketCat(), new RocketMaryl() };

		Scanner scanner = new Scanner(System.in);
		GameSystem gs = new GameSystem();
		Random random = new Random();
		
		//게임을 시작할때에 선공후공을 선택하기 위한 코드가 GameManager에 너무 몰려 셋팅값은 GameSystem이라는 클래스를 만들어 객체로 만들었다.
		gs.Gamesetting();
		for (int i = 0; i < 999999; i++) {
			System.out.println("턴 진행을 하려면 enter를 누르세요.");
			scanner.nextLine();
			int team0Index = 0;
			int team1Index = 0;
			for (int j = 0; j < 999; j++) {
				team0Index = random.nextInt(team0.length);
				if (team0[team0Index].hp < 1) {
					continue;
				} else {
					break;
				}
			}
			for (int j = 0; j < 999; j++) {
				team1Index = random.nextInt(team1.length);
				if (team1[team1Index].hp < 1) {
					continue;
				} else {
					break;
				}
			}
//			int team0Index = random.nextInt(team0.length);
//			int team1Index = random.nextInt(team1.length);
			if (team0[team0Index].hp > 0 || team1[team1Index].hp > 0) {
				team0[team0Index].underAttack(team1[team1Index].getPower());
				team1[team1Index].underAttack(team0[team0Index].getPower());
			} else {
				continue;
			}
//team0IsAlive의 초기값이 false이기 때문에 isLive의 객체가 true이면 원래의 값이 true로 나오게 된다. 둘다 false일때에 false값으로 떨어지게 된다. 
			boolean team0IsAlive = false;
			for (int j = 0; j < team0.length; j++) {
				team0IsAlive = team0IsAlive || team0[j].isLive();
			}

			
			boolean team1IsAlive = false;
			for (int k = 0; k < team0.length; k++) {
				team1IsAlive = team1IsAlive || team1[k].isLive();
			}
			// 아래는 팀 생존상태 확인 True = 생존 / False = 전멸 
//			System.out.print(team0IsAlive);
//			System.out.println(" / " + team1IsAlive);

			if (team0IsAlive == false) {
				System.out.println("팀 트레이너스가 전멸 하였습니다.");
				System.out.println("로켓단 승리. 게임종료");

				break;
			} else if (team1IsAlive == false) {
				System.out.println("로켓단이 전멸 하였습니다.");
				System.out.println("팀 트레이너스 승리. 게임종료");
				break;
			} else if(team0IsAlive == false && team1IsAlive == false) {
				System.out.println("무승부 입니다. 게임종료");
				// 동시에 모두 전멸하는 경우가 발생함을 확인. 동시에 전멸할 경우 무승부 판정.
			}

		}
	}
}
