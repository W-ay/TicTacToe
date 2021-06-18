
public class game {
	
	private int a = 3;//棋盘横向多大
	private int b = 3;//棋盘竖向多大
	private int number = 1;//记录当前是哪个棋子
	char [][]win = new char[a][b];
	
	public void start() {
		for(int i = 0;i<a;i++) {//初始化棋盘数组
			for(int j = 0; j<b;j++) {
				win[i][j] = '#';
			}
		}
		this.draw();//输出当前棋盘
	}
	public boolean draw1(int x,int y) {
		if(judgeRule(x,y) == true) {
			if(number%2 == 0) //O先；X后;number为奇数则是O,偶数则是X;
				win[x][y] = 'X';
			else 
				win[x][y] = 'O';
		number++;
		draw();
		}
		return false;
	}
	public void draw() {//输出当前棋盘
		for(char[] a: win) { 
			System.out.println(a);
		}
	}
	public boolean judgeRule(int x,int y) {//判断下棋是否合规矩
		
		if((x>=0&&x<a)&&(y>=0&&y<b)) //判断是否在棋盘内下棋
		{
			if(win[x][y] == '#') { //判断是否此处已有棋子
				return true;
			}
			else {
				System.out.println("此处已有棋子，请重新下棋");draw();
				return false;
			}
		}
		else {
			System.out.println("棋子超出了棋盘");draw();
			return false;
		}
	}
	public char returnChess() {//返回当前是哪个棋子
		if(number%2==0)
			return 'O';
		else return 'X';
	}
	public boolean judgeWin() {//判断是否获胜
		
		for(int i = 0;i<3;i++) {
			if(win[i][0]==win[i][1]&&win[i][1]==win[i][2]&&win[i][0]!='#')//检查横向
				return true;
			else if(win[0][i]==win[1][i]&&win[1][i]==win[2][i]&&win[0][i]!='#')//检查竖向
				return true;
		}
		if(win[0][0]==win[1][1]&&win[1][1]==win[2][2]&&win[0][0]!='#')//判断斜向1是否赢棋
			return true;
		else if(win[0][2]==win[1][1]&&win[1][1]==win[2][0]&&win[0][2]!='#')//检查斜向2
			return true;
		return false;
	}
	
}
