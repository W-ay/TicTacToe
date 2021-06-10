
public class windows {
	private int length;
	private int width;
	windows(int length,int width){//界面长宽定义
		this.length = length;
		this.width = width;
	}
	public void draw() {
		drawHead();
		for(int i = 0;i<length-2;i++)
			drawMiddle();
		drawHead();
		
	}
	private void drawHead() {//绘制顶行与底行
		for(int i = 0; i<width ; i++)
			System.out.print("#");
		System.out.print('\n');
	}
	private void drawMiddle() {//绘制中间
		System.out.print('#');
		for(int i = 0;i<width -2 ;i++) {
			System.out.print(' ');
		}
		System.out.println('#');
	}
}
