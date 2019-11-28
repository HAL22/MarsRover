import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoverNavigationSystemTest {

    @Test
    public void changeOrientation() throws Exception  //Testing if the orientation is correctly change after R and L
    {
        RoverNavigationSystem roverNavigationSystem = new RoverNavigationSystem(10,8,2,3,'N');

        roverNavigationSystem.changeOrientation('R');

        assertEquals('E',roverNavigationSystem.getORIENTATION());  //1

        roverNavigationSystem.changeOrientation('L');

        assertEquals('N',roverNavigationSystem.getORIENTATION());  //2

        roverNavigationSystem.changeOrientation('L');

        assertEquals('W',roverNavigationSystem.getORIENTATION());  //3

        roverNavigationSystem.changeOrientation('L');

        assertEquals('S',roverNavigationSystem.getORIENTATION()); //4
    }

    @Test
    public void moveRover() throws Exception
    {
        RoverNavigationSystem roverNavigationSystem = new RoverNavigationSystem(10,8,2,3,'N');

        roverNavigationSystem.moveRover();

        assertEquals(4,roverNavigationSystem.getROVER_POS_Y()); //1

        roverNavigationSystem.changeOrientation('R');

        roverNavigationSystem.moveRover();

        assertEquals(3,roverNavigationSystem.getROVER_POS_X()); //2

        roverNavigationSystem.moveRover();

        assertEquals(4,roverNavigationSystem.getROVER_POS_X()); //3

        roverNavigationSystem.changeOrientation('R');

        roverNavigationSystem.moveRover();

        assertEquals(3,roverNavigationSystem.getROVER_POS_Y()); //4


    }

    @Test
    public void navigate() throws Exception
    {
        RoverNavigationSystem rover1 = new RoverNavigationSystem(8,10,1,2,'E');
        String cmd1 = "MMLMRMMRRMML";
        for(int i=0;i<cmd1.length();i++)
        {
            rover1.navigate(cmd1.charAt(i));
        }
        assertEquals("3 3 S",rover1.printPostionAndOrientation());


        RoverNavigationSystem rover2 = new RoverNavigationSystem(8,10,1,2,'E');
        String cmd2 = "MMLRMLLLMRM";
        for(int i=0;i<cmd2.length();i++)
        {
            rover2.navigate(cmd2.charAt(i));
        }
        assertEquals("1 3 W",rover2.printPostionAndOrientation());


        RoverNavigationSystem rover3 = new RoverNavigationSystem(8,10,1,2,'E');
        String cmd3 = "MMLRLLLLLLMMRRM";
        for(int i=0;i<cmd3.length();i++)
        {
            rover3.navigate(cmd3.charAt(i));
        }
        assertEquals("2 2 E",rover3.printPostionAndOrientation());













    }
}