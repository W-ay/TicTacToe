
public class game {
	private int a = 3;//���̺�����
	private int b = 3;//����������
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
		for(char[] a: win) { //�����ǰ����
			System.out.println(a);
		}
	}
	public boolean draw(int x,int y) {
		if(x<a && y<b ) //�ж��Ƿ�������������
		{
			if(win[x][y] == '#') //�ж��Ƿ�˴���������
			{
				if(number%2 == 0) //O�ȣ�X��
					win[x][y] = 'X';
				else 
					win[x][y] = '0';
				number++;
			}
			else {
				System.out.println("�˴��������ӣ�����������");
				return false;
			}
		}
		else {
			System.out.println("���ӳ���������");
			return false;
		}
		for(char[] a: win) { //������������ǰ����
			System.out.println(a);
		}
		return true;
	}
}
