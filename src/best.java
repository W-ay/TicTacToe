import java.util.Scanner;

public class best {
	public static void main(String args[]) {
		var chess = new game();
		chess.start();//初始化游戏
		var in = new Scanner(System.in);
		while(true) {
			int x = in.nextInt()- 1;
			int y = in.nextInt()- 1;
			if(chess.draw1(x, y) == true) {
				chess.draw();
			}
			if(chess.judgeWin()==true) {
				System.out.println("游戏结束！");
				System.out.println("恭喜:"+chess.returnChess()+"获得游戏胜利！");
				break;
			}
		}
	}
}

