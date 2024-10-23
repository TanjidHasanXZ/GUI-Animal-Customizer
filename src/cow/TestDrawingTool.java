package cow;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestDrawingTool extends JFrame implements ActionListener  {
    private DrawingArea drawing;
    private Buttons button;

    public TestDrawingTool(String title) {
        super(title);

        // Get screen size
        Dimension screenSize = getToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);

        // Set layout to BorderLayout
        this.setLayout(new BorderLayout());

        // Initialize the drawing area and buttons panel
        drawing = new DrawingArea();
        button = new Buttons();

        // Create a panel to hold the buttons and set it to the top
        JPanel buttonPanelContainer = new JPanel();
        buttonPanelContainer.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(button);
        buttonPanel.setBackground(Color.lightGray);  // Set the background color if needed
        buttonPanelContainer.add(buttonPanel, BorderLayout.CENTER);

        // Set the preferred size for the button panel to be one-third of the frame height
        buttonPanelContainer.setPreferredSize(new Dimension(screenSize.width, screenSize.height / 3));

        // Add the button panel to the top (NORTH)
        add(buttonPanelContainer, BorderLayout.NORTH);

        // Add the drawing area to the center
        add(drawing, BorderLayout.CENTER);

        // Set visibility
        setVisible(true);

        // Register the TestDrawingTool instance as the ActionListener for the button
        button.getButton().addActionListener(this);
        button.getButton1().addActionListener(this);
        button.getButton2().addActionListener(this);
        button.getButton7().addActionListener(this);
        button.getButton8().addActionListener(this);
        button.getButton9().addActionListener(this);
        button.getRsizebutton().addActionListener(this);
        button.getSizeSbutton().addActionListener(this);
        button.getSizeMbutton().addActionListener(this);
        button.getSsizeLbutton().addActionListener(this);
        button.getRcolorbutton().addActionListener(this);
        button.getRcolorbuttonHead().addActionListener(this);
        button.getButton10().addActionListener(this);
        button.getButton11().addActionListener(this);
        button.getButton12().addActionListener(this);
    }

    public static void main(String[] args) {
        new TestDrawingTool("Draw a Cow");
    }

    private void tidyUpDrawingArea() {
        drawing.removeAll();
        drawing.revalidate();
        drawing.repaint();		
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button.getButton()) {
            System.out.println("Green is pressed");
            tidyUpDrawingArea();
            drawing.changeColorCowBody(Color.green);
        } else if(e.getSource() == button.getButton1()){
            System.out.println("Pink is pressed");
            tidyUpDrawingArea();
            drawing.changeColorCowBody(Color.pink);
        } else if(e.getSource() == button.getButton2()){
            System.out.println("Yellow is pressed");
            tidyUpDrawingArea();
            drawing.changeColorCowBody(Color.yellow);
        } else if(e.getSource() == button.getButton7()){
            System.out.println("Yellow is pressed");
            tidyUpDrawingArea();
            drawing.changeColorCowHead(Color.yellow);
        } else if(e.getSource() == button.getButton8()){
            System.out.println("Gray is pressed");
            tidyUpDrawingArea();
            drawing.changeColorCowHead(Color.gray);
        } else if(e.getSource() == button.getButton9()){
            System.out.println("Pink is pressed");
            tidyUpDrawingArea();
            drawing.changeColorCowHead(Color.pink);
        } else if(e.getSource() == button.getRcolorbuttonHead()){
            System.out.println("R is pressed");
            tidyUpDrawingArea();
            drawing.changeColorCowHead(new Color((RandomNumber.between(0, 255)), RandomNumber.between(16, 195), RandomNumber.between(0, 45)));
        } else if(e.getSource() == button.getRsizebutton()){
            System.out.println("R is pressed");
            tidyUpDrawingArea();
            drawing.changeColorCowBody(new Color((RandomNumber.between(0, 255)), RandomNumber.between(16, 195), RandomNumber.between(0, 45)));
        } else if(e.getSource() == button.getSizeSbutton()){
            System.out.println("S is pressed");
            tidyUpDrawingArea();
            drawing.changeSize(4);
        } else if(e.getSource() == button.getSizeMbutton()){
            System.out.println("M is pressed");
            tidyUpDrawingArea();
            drawing.changeSize(3);
        } else if(e.getSource() == button.getSsizeLbutton()){
            System.out.println("L is pressed");
            tidyUpDrawingArea();
            drawing.changeSize(2);
        } else if(e.getSource() == button.getRcolorbutton()){
            System.out.println("RandomS is pressed");
            tidyUpDrawingArea();
            drawing.changeSize(RandomNumber.between(2,4));
        } else if (e.getSource() == button.getButton10()) {
		Scene.setGraphicState(Scene.getGraphicState().drawHead());
		tidyUpDrawingArea();
		
		
	   } else if (e.getSource() == button.getButton11()) {
		Scene.setGraphicState(Scene.getGraphicState().drawghost());
		tidyUpDrawingArea();
		
		
	   } else if (e.getSource() == button.getButton12()) {
		Scene.setGraphicState(Scene.getGraphicState().drawCow());
		tidyUpDrawingArea();	
		}
    }
}
