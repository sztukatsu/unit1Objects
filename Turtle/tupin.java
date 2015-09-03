
import java.awt.Color;
import java.util.Random;


public class tupin
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        
    
            
        
      
        World oyster = new World();
        Turtle tupac = new Turtle(oyster);
        Turtle kaxx = new Turtle(oyster);
        kaxx.setPenColor(Color.DARK_GRAY);
        for (int i=1; i>0; i++){
            tupac.penDown();
            int r1 = generator.nextInt(10);
            if (r1%2 == 0){
                r1 = -(r1);
            }
            tupac.turn(r1);
            int r2 = generator.nextInt(10);
            tupac.forward(r2);
            tupac.penUp();
            int r3 = generator.nextInt(10);
            if (r3%2 == 0){
                r3 = -(r1);
            }
            tupac.turn(r3);
            int r4 = generator.nextInt(10);
            tupac.forward(r4);
            int r5 = generator.nextInt(7);
            if (r5 == 1){
                tupac.setPenColor(Color.CYAN);
            }
            if (r5 == 2){
                tupac.setPenColor(Color.PINK);
            }
            if (r5 == 3){
                tupac.setPenColor(Color.ORANGE);
            }
            if (r5 == 4){
                tupac.setPenColor(Color.GREEN);
            }
            if (r5 == 5){
                tupac.setPenColor(Color.RED);
            }
            if (r5 == 6){
                tupac.setPenColor(Color.YELLOW);
            }

            
             kaxx.penDown();
            int r6 = generator.nextInt(10);
            if (r6%2 == 0){
                r6 = -(r1);
            }
            kaxx.turn(r1);
            int r7 = generator.nextInt(10);
            kaxx.forward(r7);
            kaxx.penUp();
            int r8 = generator.nextInt(10);
            if (r8%2 == 0){
                r8 = -(r1);
            }
            kaxx.turn(r8);
            int r9 = generator.nextInt(10);
            kaxx.forward(r9);
        }
    }
}
