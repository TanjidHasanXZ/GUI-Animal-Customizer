package cow;

import java.awt.Color;

public class Eye {
	private int length, width;
	
	public Eye (int length, int width) {
		this.length = length;
		this.width = width;
	} 

	public void drawAt(int startX, int startY) {
		
		//for left eye
		
		Drawing.pen().setColor(Color.white);
		Drawing.pen().fillOval(startX, startY, length*2, width*2);
		
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillOval(startX, startY, (int)(length), (int)(width)); 
		
		
	}
	
}
