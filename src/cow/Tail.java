package cow;

import java.awt.Color;

public class Tail {
	private int length, width;
	
	public Tail(int length, int width) {
		this.length = length;
		this.width = width;
	} 
	
	public void drawAt(int startX, int startY) {
		
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillOval(startX, startY, (int)(length), (int)(width));
	
	}

}
