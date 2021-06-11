import java.util.Scanner;

public class best {
	public static void main(String args[]) {
		var chess = new game();//定义棋盘大小
		chess.csh();//初始化棋盘
		chess.drawFirst();//首次绘制
		var in = new Scanner(System.in);
		for(int i = 0;i<9;i++) {//下棋过程
		int x = in.nextInt()- 1;
		int y = in.nextInt()- 1;
		if((x>0&&x<4)&&(y>0&&y<4))//判断输入是否正确
			{
			if(chess.draw(x,y) != true)//下棋不和规则，则重新下棋
				i--; 
			}
		else {
			System.out.println("输入的位置不对，请重新输入");
			i--;
		}
		}
	}
}

