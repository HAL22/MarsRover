public class RoverNavigationSystem
{
    private int GRID_X;
    private int GRID_Y;

    private int ROVER_POS_X;
    private int ROVER_POS_Y;
    private char ORIENTATION;
    private boolean OUTOFBOUNDS;

    public RoverNavigationSystem(int gridy,int gridx,int roverx,int rovery, char orientation)
    {
        this.GRID_X = gridx;
        this.GRID_Y = gridy;

        this.ROVER_POS_X = roverx;
        this.ROVER_POS_Y = rovery;
        this.ORIENTATION = orientation;
        this.OUTOFBOUNDS = false;


    }

    public void navigate(char action)
    {
        if(action == 'M')
        {
            moveRover();
        }

        else
            {
                changeOrientation(action);
            }
    }

    public String printPostionAndOrientation()
    {
        return String.valueOf(ROVER_POS_Y)+" "+String.valueOf(ROVER_POS_X)+" "+String.valueOf(ORIENTATION);
    }




    public void moveRover()
    {
        if(ORIENTATION == 'N')
        {
            ROVER_POS_Y++;

        }

        else if(ORIENTATION == 'S')
        {
            ROVER_POS_Y--;


        }

        else if(ORIENTATION == 'E')
        {
            ROVER_POS_X++;


        }

        else if(ORIENTATION == 'W')
        {
            ROVER_POS_X--;


        }

        else
        {

        }

    }

    public void changeOrientation(char rotation)
    {
        if(rotation =='R')
        {
            if(ORIENTATION == 'N')
            {
                ORIENTATION = 'E';

            }

            else if(ORIENTATION == 'S')
            {
                ORIENTATION = 'W';

            }

            else if(ORIENTATION == 'E')
            {
                ORIENTATION = 'S';

            }

            else if(ORIENTATION == 'W')
            {
                ORIENTATION = 'N';

            }

            else
                {

                }


        }

        else if(rotation == 'L')
        {

            if(ORIENTATION == 'N')
            {
                ORIENTATION = 'W';

            }

            else if(ORIENTATION == 'S')
            {
                ORIENTATION = 'E';

            }

            else if(ORIENTATION == 'E')
            {
                ORIENTATION = 'N';

            }

            else if(ORIENTATION == 'W')
            {
                ORIENTATION = 'S';

            }

            else
            {

            }

        }

    }

    public int getGRID_X() {
        return GRID_X;
    }

    public void setGRID_X(int GRID_X) {
        this.GRID_X = GRID_X;
    }

    public int getGRID_Y() {
        return GRID_Y;
    }

    public void setGRID_Y(int GRID_Y) {
        this.GRID_Y = GRID_Y;
    }

    public int getROVER_POS_X() {
        return ROVER_POS_X;
    }

    public void setROVER_POS_X(int ROVER_POS_X) {
        this.ROVER_POS_X = ROVER_POS_X;
    }

    public int getROVER_POS_Y() {
        return ROVER_POS_Y;
    }

    public void setROVER_POS_Y(int ROVER_POS_Y) {
        this.ROVER_POS_Y = ROVER_POS_Y;
    }

    public char getORIENTATION() {
        return ORIENTATION;
    }

    public void setORIENTATION(char ORIENTATION) {
        this.ORIENTATION = ORIENTATION;
    }

    public boolean isOUTOFBOUNDS() {
        return OUTOFBOUNDS;
    }

    public void setOUTOFBOUNDS(boolean OUTOFBOUNDS) {
        this.OUTOFBOUNDS = OUTOFBOUNDS;
    }
}
