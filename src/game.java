
public class game {
	private int a = 3;//棋盘横向多大
	private int b = 3;//棋盘竖向多大
	private int number = 1;
//	game(int a, int b) {
//		this.a = a;
//		this.b = b;
//		}
	char [][]win = new char[a][b];
	
	public void csh() {//初始化
		for(int i = 0;i<a;i++) {
			for(int j = 0; j<b;j++) {
				win[i][j] = '#';
			}
		}
	}
	public void drawFirst() {
		for(char[] a: win) { //输出当前棋盘
			System.out.println(a);
		}
	}
	public boolean draw(int x,int y) {
		if(x<a && y<b ) //判断是否在棋盘内下棋
		{
			if(win[x][y] == '#') //判断是否此处已有棋子
			{
				if(number%2 == 0) //O先；X后
					win[x][y] = 'X';
				else 
					win[x][y] = '0';
				if(this.judge()==true)
					System.out.println(win[x][y]+"赢得了比赛");
				number++;
			}
			else {
				System.out.println("此处已有棋子，请重新下棋");
				return false;
			}
		}
		else {
			System.out.println("棋子超出了棋盘");
			return false;
		}
		for(char[] a: win) { //下完棋后输出当前棋盘
			System.out.println(a);
		}
		return true;
	}
	public boolean judge() {
		for(int i = 0;i<3;i++) {
			if(win[i][0]==win[i][1]&&win[i][1]==win[i][2])
				return true;
			else if(win[0][i]==win[1][i]&&win[1][i]==win[2][i])
				return true;
		}
		if(win[0][0]==win[1][1]&&win[1][1]==win[2][2])//判断斜向是否赢棋
			return true;
		else if(win[0][2]==win[1][1]&&win[1][1]==win[2][0])
			return true;
	//	System.out.println("判断程序未正确运行！");
		return false;
	}
}
