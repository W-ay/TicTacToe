
public class game {
	
	private int a = 3;//���̺�����
	private int b = 3;//����������
	private int number = 1;//��¼��ǰ���ĸ�����
	char [][]win = new char[a][b];
	
	public void start() {
		for(int i = 0;i<a;i++) {//��ʼ����������
			for(int j = 0; j<b;j++) {
				win[i][j] = '#';
			}
		}
		this.draw();//�����ǰ����
	}
	public boolean draw1(int x,int y) {
		if(judgeRule(x,y) == true) {
			if(number%2 == 0) //O�ȣ�X��;numberΪ��������O,ż������X;
				win[x][y] = 'X';
			else 
				win[x][y] = 'O';
		number++;
		draw();
		}
		return false;
	}
	public void draw() {//�����ǰ����
		for(char[] a: win) { 
			System.out.println(a);
		}
	}
	public boolean judgeRule(int x,int y) {//�ж������Ƿ�Ϲ��
		
		if((x>=0&&x<a)&&(y>=0&&y<b)) //�ж��Ƿ�������������
		{
			if(win[x][y] == '#') { //�ж��Ƿ�˴���������
				return true;
			}
			else {
				System.out.println("�˴��������ӣ�����������");draw();
				return false;
			}
		}
		else {
			System.out.println("���ӳ���������");draw();
			return false;
		}
	}
	public char returnChess() {//���ص�ǰ���ĸ�����
		if(number%2==0)
			return 'O';
		else return 'X';
	}
	public boolean judgeWin() {//�ж��Ƿ��ʤ
		
		for(int i = 0;i<3;i++) {
			if(win[i][0]==win[i][1]&&win[i][1]==win[i][2]&&win[i][0]!='#')//������
				return true;
			else if(win[0][i]==win[1][i]&&win[1][i]==win[2][i]&&win[0][i]!='#')//�������
				return true;
		}
		if(win[0][0]==win[1][1]&&win[1][1]==win[2][2]&&win[0][0]!='#')//�ж�б��1�Ƿ�Ӯ��
			return true;
		else if(win[0][2]==win[1][1]&&win[1][1]==win[2][0]&&win[0][2]!='#')//���б��2
			return true;
		return false;
	}
	
}
