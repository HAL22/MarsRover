public class driver
{
    public static void main(String[] args)
    {
        String current_zone = "8 10";
        String starting = "1 2 E";
        String commands = "MMLMRMMRRMML";

        String[] zone = current_zone.split(" ");
        String[] start = starting.split(" ");

        RoverNavigationSystem roverNavigationSystem = new RoverNavigationSystem(Integer.parseInt(zone[0]),Integer.parseInt(zone[1]),Integer.parseInt(start[1]),Integer.parseInt(start[0]),start[2].charAt(0));


        for(int i=0;i<commands.length();i++)
        {
            roverNavigationSystem.navigate(commands.charAt(i));

            System.out.println("Command: "+commands.charAt(i)+" | result: "+roverNavigationSystem.printPostionAndOrientation());
        }

        //System.out.println(roverNavigationSystem.printPostionAndOrientation());
    }
}
