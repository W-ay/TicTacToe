
public class game {
	private int a = 3;//棋盘横向多大
	private int b = 3;//棋盘竖向多大
	private int number = 1;
//	game(int a, int b) {
//		this.a = a;
//		this.b = b;
//		}
	char [][]win = new char[a][b];
	
	public void csh() {
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
}
