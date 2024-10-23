package cow;

import java.awt.Color;

public class Body {
    private int length;
    private int width;

    private Leg leg1, leg2, leg3, leg4; // aggregate
    private Tail tail; // aggregate
    private Color color;
    private int x,y;

    public void setColor(Color color) {
        this.color = color;
    }

    public Body(int length, int width,int x, int y) {
    	this.x = x;
		this.y = y;
    	this.length = length;
        this.width = width;

        leg1 = new Leg(length, width / 3);
        leg2 = new Leg(length, width / 3);
        leg3 = new Leg(length, width / 3);
        leg4 = new Leg(length, width / 3);

        tail = new Tail((int) (length * 0.08), (int) (width * 1.4));

        // Set default color to red
        this.color = Color.red;
    }
    public void draw() {
		drawAt(x,y);
		
	}

    public void drawAt(int startX, int startY) {
        Drawing.pen().setColor(color);
        leg1.drawAt(startX, startY + leg1.getlength());
        Drawing.pen().setColor(color);
        leg2.drawAt(startX + width - width / 3, startY + leg1.getlength());
        Drawing.pen().setColor(color);
        leg3.drawAt(startX - width / 2, startY + leg1.getlength());
        Drawing.pen().setColor(color);
        leg4.drawAt(startX + (int) (width * 1.28), startY + leg1.getlength());
        tail.drawAt(startX + (int) (width * 1.83), startY + length / 2);

        // body
        Drawing.pen().setColor(color);
        Drawing.pen().fillOval(startX - (int) (width * 1.08), startY, width * 3, length + (int) (length * 0.35));
    }
}
