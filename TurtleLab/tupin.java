
import java.awt.Color;


public class tupin
{
    public static void main(String[] args)
    {
        World oyster = new World();
        Turtle tupac = new Turtle(oyster);
        tupac.setPenColor(Color.BLUE);
        tupac.setPenWidth(20);
        for (int i=1; i<21; i++){
            tupac.penDown();
            tupac.forward(5);
            tupac.right(15);
            tupac.forward(5);
            tupac.penUp();
        
        }
    }
}
