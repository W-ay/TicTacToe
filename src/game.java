
public class game {
	private int a = 3;//���̺�����
	private int b = 3;//����������
	private int number = 1;
//	game(int a, int b) {
//		this.a = a;
//		this.b = b;
//		}
	char [][]win = new char[a][b];
	
	public void csh() {//��ʼ��
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
				if(this.judge()==true)
					System.out.println(win[x][y]+"Ӯ���˱���");
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
	public boolean judge() {
		for(int i = 0;i<3;i++) {
			if(win[i][0]==win[i][1]&&win[i][1]==win[i][2])
				return true;
			else if(win[0][i]==win[1][i]&&win[1][i]==win[2][i])
				return true;
		}
		if(win[0][0]==win[1][1]&&win[1][1]==win[2][2])//�ж�б���Ƿ�Ӯ��
			return true;
		else if(win[0][2]==win[1][1]&&win[1][1]==win[2][0])
			return true;
	//	System.out.println("�жϳ���δ��ȷ���У�");
		return false;
	}
}
