import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class driver
{
    public static void main(String[] args) throws Exception
    {

        //Variables
        String[] Cmds = new String[3];
        String[] Zone;
        String[] Start;
        String CommandList;

        // Reading the commands
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int count=0;
        while ((line = br.readLine()) != null)
        {
            Cmds[count] = line;
            count++;

        }
        Zone = Cmds[0].split(" ");
        Start = Cmds[1].split(" ");
        CommandList = Cmds[2];


        RoverNavigationSystem roverNavigationSystem = new RoverNavigationSystem(Integer.parseInt(Zone[0]),Integer.parseInt(Zone[1]),Integer.parseInt(Start[0]),Integer.parseInt(Start[1]),Start[2].charAt(0));

        //Reading the commands
        for(int i=0;i<CommandList.length();i++)
        {
            roverNavigationSystem.navigate(CommandList.charAt(i));

        }

        //Printing the results
        System.out.println("A rover starting at: "+Cmds[1]+" in this zone: "+Cmds[0]);
        System.out.println("would land up at: "+roverNavigationSystem.printPostionAndOrientation()+" after these commands: "+CommandList);


    }
}
