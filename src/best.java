import java.util.Scanner;

public class best {
	public static void main(String args[]) {
		var chess = new game();
		chess.start();//��ʼ����Ϸ
		var in = new Scanner(System.in);
		while(true) {
			int x = in.nextInt()- 1;
			int y = in.nextInt()- 1;
			if(chess.draw1(x, y) == true) {
				chess.draw();
			}
			if(chess.judgeWin()==true) {
				System.out.println("��Ϸ������");
				System.out.println("��ϲ:"+chess.returnChess()+"�����Ϸʤ����");
				break;
			}
		}
	}
}

