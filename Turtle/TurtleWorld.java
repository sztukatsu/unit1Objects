import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle kaxx = new Turtle(turtleWorld);
        kaxx.setPenColor(Color.BLUE);
        kaxx.setPenWidth(10);
        kaxx.penDown();
        kaxx.forward(50);
    }
}
