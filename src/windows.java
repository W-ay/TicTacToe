
public class windows {
	private int length;
	private int width;
	windows(int length,int width){//���泤����
		this.length = length;
		this.width = width;
	}
	public void draw() {
		drawHead();
		for(int i = 0;i<length-2;i++)
			drawMiddle();
		drawHead();
		
	}
	private void drawHead() {//���ƶ��������
		for(int i = 0; i<width ; i++)
			System.out.print("#");
		System.out.print('\n');
	}
	private void drawMiddle() {//�����м�
		System.out.print('#');
		for(int i = 0;i<width -2 ;i++) {
			System.out.print(' ');
		}
		System.out.println('#');
	}
}
