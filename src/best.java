import java.util.Scanner;

public class best {
	public static void main(String args[]) {
		var chess = new game();//�������̴�С
		chess.csh();//��ʼ������
		chess.drawFirst();//�״λ���
		var in = new Scanner(System.in);
		for(int i = 0;i<9;i++) {//�������
		int x = in.nextInt()- 1;
		int y = in.nextInt()- 1;
		if((x>0&&x<4)&&(y>0&&y<4))//�ж������Ƿ���ȷ
			{
			if(chess.draw(x,y) != true)//���岻�͹�������������
				i--; 
			}
		else {
			System.out.println("�����λ�ò��ԣ�����������");
			i--;
		}
		}
	}
}

