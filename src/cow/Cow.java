//Author: Tanjid Hasan Tonmoy, Md. Moniruzzaman
//SO2 Lab 2

package cow;

import java.awt.Point;

public class Cow implements LocatedRectangle {
	private Body cowBody; // composite
	private Head cowHead; // composite
	private int scale;
	private int x;
	private int y;
	
	public Body getBody() {
		return cowBody;
	}
	public Head getHead() {
		return cowHead;
	}

	public Cow(int x, int y, int scale) {
		int length = 155;
		int width = 135;
		this.scale = scale;
		this.x = x;
		this.y = y;
		int random = RandomNumber.between(0, 100);

        if (random % 2 == 0)
        	cowBody = new NormalBody(length / scale, width / scale,x,y);
        else
        	cowBody = new FatBody(length / scale, width / scale,x,y);
        

		double headSize = 1.82;
		double headSize2 = 1.42;
		cowHead = new Head(((int) (length / headSize)) / scale, (int) (width / headSize2) / scale,x,y);
	}

	public void drawAt(int x, int y) {
		cowBody.drawAt(x, y);
	
		cowHead.drawAt(x + (int) (cowHead.getWidth() / 3), y - (int) (cowHead.getLength() * 1.57));
	}

	@Override
	public Point address() {
		return new Point(x, y);
	}

	@Override
	public int width() {
		return 550 / scale;
	}

	@Override
	public int height() {
		return 700 / scale;
	}

	@Override
	public void draw() {
		this.drawAt(this.x, this.y);
	}

}
