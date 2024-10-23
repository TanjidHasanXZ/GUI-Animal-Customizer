package cow;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class Buttons extends JPanel {
    private JButton aButton, aButton1, aButton2, aButton4, aButton5, aButton6, aButton7, aButton8, 
    aButton9, rBcolor, rBSize, rBcolorHead,aButton10,aButton11,aButton12;

    public Buttons() {
        Dimension screenSize = getToolkit().getScreenSize();
        this.setPreferredSize(new Dimension(screenSize.width / 2, screenSize.height));
        setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setText("   Click to change body color:");
        label.setPreferredSize(new Dimension(this.getPreferredSize().width, label.getPreferredSize().height));
        add(label);

        aButton = createButton("Green", new Dimension(100, 60), Color.GREEN, Color.GREEN);
        this.add(aButton);

        aButton1 = createButton("Pink", new Dimension(100, 60), Color.PINK, Color.PINK);
        this.add(aButton1);

        aButton2 = createButton("Yellow", new Dimension(100, 60), Color.YELLOW, Color.YELLOW);
        this.add(aButton2);

        rBcolor = createButton("Random", new Dimension(100, 60), Color.WHITE, Color.BLACK);
        this.add(rBcolor);

        // Head Color Buttons
        JLabel label2 = new JLabel();
        label2.setText("   Click to change head color:");
        label2.setPreferredSize(new Dimension(this.getPreferredSize().width, label2.getPreferredSize().height));
        add(label2);

        aButton7 = createButton("Yellow", new Dimension(100, 60), Color.YELLOW, Color.YELLOW);
        this.add(aButton7);

        aButton8 = createButton("Gray", new Dimension(100, 60), Color.GRAY, Color.GRAY);
        this.add(aButton8);

        aButton9 = createButton("Pink", new Dimension(100, 60), Color.PINK, Color.PINK);
        this.add(aButton9);

        rBcolorHead = createButton("Random", new Dimension(100, 60), Color.WHITE, Color.BLACK);
        this.add(rBcolorHead);

        // Cow Size Buttons
        JLabel label1 = new JLabel();
        label1.setText("   Click to change cow size:");
        label1.setPreferredSize(new Dimension(this.getPreferredSize().width, label1.getPreferredSize().height));
        add(label1);

        aButton4 = createButton("Small", new Dimension(100, 60), null, null);
        this.add(aButton4);

        aButton5 = createButton("Medium", new Dimension(100, 60), null, null);
        this.add(aButton5);

        aButton6 = createButton("Large", new Dimension(100, 60), null, null);
        this.add(aButton6);

        rBSize = createButton("Random", new Dimension(100, 60), null, null);
        this.add(rBSize);
        
        //State buttons
        JLabel label3 = new JLabel();
        label3.setText("   Click to see to some scary cows:");
        label3.setPreferredSize(new Dimension(this.getPreferredSize().width, label3.getPreferredSize().height));
        add(label3);

        aButton10 = createButton("Just Head", new Dimension(100, 60), null,null);
        this.add(aButton10);

        aButton11 = createButton("Headless Cow Ghost", new Dimension(200, 60), null, null);
        this.add(aButton11);

        aButton12 = createButton("Full Cow", new Dimension(100, 60), null, null);
        this.add(aButton12);

        setBackground(Color.white); // Set the background color of the button panel to white
    }

    // Helper method to create a button
    private JButton createButton(String text, Dimension dimension, Color background, Color foreground) {
        JButton button = new JButton(text);
        button.setPreferredSize(dimension);
        if (background != null) {
            button.setBackground(background);
        }
        if (foreground != null) {
            button.setForeground(foreground);
        }
        return button;
    }

    public JButton getButton() {
        return aButton;
    }

    public JButton getButton1() {
        return aButton1;
    }

    public JButton getButton2() {
        return aButton2;
    }

    public JButton getSizeSbutton() {
        return aButton4;
    }

    public JButton getSizeMbutton() {
        return aButton5;
    }

    public JButton getSsizeLbutton() {
        return aButton6;
    }

    public JButton getButton7() {
        return aButton7;
    }

    public JButton getButton8() {
        return aButton8;
    }

    public JButton getButton9() {
        return aButton9;
    }

    public JButton getRsizebutton() {
        return rBcolor;
    }

    public JButton getRcolorbutton() {
        return rBSize;
    }

    public JButton getRcolorbuttonHead() {
        return rBcolorHead;
    }
    public JButton getButton10() {
        return aButton10;
    }
    public JButton getButton11() {
        return aButton11;
    }
    public JButton getButton12() {
        return aButton12;
    }

}
