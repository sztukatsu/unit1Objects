
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Rectangle2
{
    public static void main(String[] args)
    {
        //Construct a frame and show it
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //Construct a rectangle and set the frame bounds
        frame.setBounds(0,0,1000,1000);
        Rectangle r1 = new Rectangle(0,0,100,500);
        JOptionPane.showMessageDialog(frame, "Click ok to continue");
        //move the rectangle and set the frame bounds again
        r1.setLocation(10,20);

    }
}