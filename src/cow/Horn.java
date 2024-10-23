package cow;

public class Horn {
	private int length, width;
	
	public Horn (int length, int width) {
		this.length = length;
		this.width = width;
	} 

	public void drawAt(int startX, int startY) {

		Drawing.pen().fillOval(startX, startY, (int)(length), (int)(width)); 
	}
	
}
