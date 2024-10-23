package cow;

import java.awt.Color;

public class Head {
    private int headLength, headWidth;
    private Eye leftEye, rightEye; // composite
    private Ear leftEar, rightEar; // aggregate
    private Horn leftHorn, rightHorn; // aggregate
    private Nose cowNose, cowNose2; // composite
    private Mouth cowMouth; // composite
    private Color color;
    private int x;
	private int y;
	

    public void setColor(Color color) {
        this.color = color;
    }

    public Head(int length, int width,int x, int y) {
    	this.x = x;
		this.y = y;
        this.headLength = length;
        this.headWidth = width;
        int random = RandomNumber.between(0, 100);

        if (random % 2 == 0)
            leftHorn = new FatHorn((int) (length * 0.3), (int) (width));
        else
            leftHorn = new NormalHorn((int) (length * 0.3), (int) (width));

        leftEye = new Eye((int) (length * 0.15), (int) (width * 0.1001));
        rightEye = new Eye((int) (length * 0.15), (int) (width * 0.1001));
        leftEar = new Ear((int) (length), (int) (width * 0.5));
        rightEar = new Ear((int) (length), (int) (width * 0.5));
        rightHorn = new Horn((int) (length * 0.3), (int) (width));
        cowNose = new Nose((int) (length * 0.15), (int) (width * 0.1001));
        cowNose2 = new Nose((int) (length * 0.15), (int) (width * 0.1001));
        cowMouth = new Mouth((int) (length), (int) (width * 0.4));

        // Set default color to red
        this.color = Color.red;
    }

    public int getLength() {
        return headLength;
    }

    public int getWidth() {
        return headWidth;
    }
    public void draw() {
		drawAt(x,y);
		
	}

    public void drawAt(int startX, int startY) {
        Drawing.pen().setColor(color);
        leftEar.drawAt(startX - (int) (headWidth * 3.3), startY + (int) (headLength * 1.95));
        Drawing.pen().setColor(color);
        rightEar.drawAt(startX - (int) (headWidth * 2.25), startY + (int) (headLength * 1.95));
        Drawing.pen().setColor(color);
        leftHorn.drawAt(startX - (int) (headWidth * 2.8), startY + (int) (headLength * 1.25));
        Drawing.pen().setColor(color);
        rightHorn.drawAt(startX - (int) (headWidth * 2.2), startY + (int) (headLength * 1.25));

        // Head
        Drawing.pen().setColor(color);
        Drawing.pen().fillOval(startX - (int) (headWidth * 2.86), startY + (int) (headLength * 1.8),
                (int) (headLength * 1.2), headWidth + 10);
        Drawing.pen().fillOval(startX - (int) (headWidth * 2.96), startY + (int) (headLength * 2.5),
                headLength + headLength / 2, headWidth);

        leftEye.drawAt(startX - (int) (headWidth * 2.67), startY + (int) (headLength * 2.15));
        rightEye.drawAt(startX - (int) (headWidth * 2.27), startY + (int) (headLength * 2.15));

        cowNose.drawAt(startX - (int) (headWidth * 2.70), startY + (int) (headLength * 2.95));
        cowNose2.drawAt(startX - (int) (headWidth * 2.2), startY + (int) (headLength * 2.95));
        cowMouth.drawAt(startX - (int) (headWidth * 2.74), startY + (int) (headLength * 3));
    }
}
