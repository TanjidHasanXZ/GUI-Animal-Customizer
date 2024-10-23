package cow;

import java.awt.Color;

public class Hoof {
	private int length, width;
	
	public Hoof (int length, int width) {
		this.length = length;
		this.width = width;
	} 

	public void drawAt(int startX, int startY) {

		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillRect(startX, startY, width, length);
	}
}
