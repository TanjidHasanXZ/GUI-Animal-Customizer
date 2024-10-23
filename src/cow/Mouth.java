package cow;

public class Mouth {

private int length, width;
	
	public Mouth(int length, int width) {
		this.length = length;
		this.width = width;
	} 
	
	public void drawAt(int startX, int startY) {
	 
		Drawing.pen().drawArc(startX, startY,length, width, -45, -90);
		
	}
}
		
	


