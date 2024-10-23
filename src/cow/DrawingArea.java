
/**
 * Provides a panel which can be used for drawing.
 * 
 * @author Björn Gottfried
 * @version 1.0
 */

package cow;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;
    private Scene myScene;
	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		Drawing.set(pen);
		
		
		if(myScene == null) {
			myScene = new Scene();
			myScene.draw();
		} else {
			myScene.draw();
		}
	
//		
	}
	public void changeSize(int n) {
		myScene.setN(n);
		myScene.draw();
	}
	
	public void changeColorCowBody(Color c) {
		myScene.changeColorBody(c);
	}
	public void changeColorCowHead(Color c) {
		myScene.changeColorHead(c);
	}
	
}



