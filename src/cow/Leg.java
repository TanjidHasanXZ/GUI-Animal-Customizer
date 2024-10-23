package cow;


public class Leg {
	private int length;
	private int width;
	private Hoof hoof;// composite

	public Leg(int length, int width) {
		this.length = length;
		this.width = width;
		hoof = new Hoof(length/5, width+width/9);
		
	}
	
	public int getlength() {
		return length;
	}
	
	public int getwidth() {
		return width;
	}
	
	public void drawAt(int startX, int startY){
		
		Drawing.pen().fillRect(startX, startY, width, length);
		hoof.drawAt(startX,startY+getlength());
	}

}
