package cow;

import java.awt.Color;

public class Nose {
	private int length, width;
	
	public Nose(int length, int width) {
		this.length = length;
		this.width = width;
	} 
	
	public void drawAt(int startX, int startY) {
		
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillOval(startX, startY, length*2, width*2);
	
	}

}
