package simplebattleships;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 23/09/13
 * Time: 22:53
 * To change this template use File | Settings | File Templates.
 */
public class Grid {
    private String oneDGrid[];
    private Ship shipOne;

    Grid(){
           this.oneDGrid = new String[7];
           shipOne = new Ship();
           clearGrid();
           populateGrid(shipOne);
    }

    private void clearGrid() {
        for(int i=0; i< oneDGrid.length; i++){
            oneDGrid[i] = "";
        }
    }

    private void populateGrid(Ship ship) {
        int random = 3;
        //check ship will fit
        for(int i=random; i < oneDGrid.length; i++){
            oneDGrid[i] = ship.shipName;
        }

    }

    public int getlength() {
        return oneDGrid.length;
    }

    public boolean istargetdestroyed(int guess) {
        String result = oneDGrid[guess];
        if (result == ""){
           System.out.println("Sir, lookout reports a miss. \n");
           return false;}
       else {
            System.out.println("Sir, lookout reports a hit! \n");
            oneDGrid[guess] = "";
            return anyMoreTargets();
            }

       }

    private boolean anyMoreTargets() {
        for(int i=0; i<oneDGrid.length; i++){
            if(oneDGrid[i] != "")
                return true;
        }
        return false;  //To change body of created methods use File | Settings | File Templates.
    }


    @Override
    public String toString() {
        String grid1 = oneDGrid[0];
        String grid2 = oneDGrid[1];
        String grid3 = oneDGrid[2];
        String grid4 = oneDGrid[3];
        String grid5 = oneDGrid[4];
        String grid6 = oneDGrid[5];
        String grid7 = oneDGrid[6];

//        String grid =(grid1 + "," + grid1 + "," + grid2 + "," + grid3 + "," + grid4 + "," + grid5 + "," + grid6 + "," + grid7 );

        String grid = "Grid 0 = " + oneDGrid[0];
        for(int i=1; i < (oneDGrid.length-1); i++){
            grid = grid.concat(", Grid "+ i + ": " + oneDGrid[i]);
        }
        return grid;
    }


//    public String fireAtGuess(String guess) {
//        int index = guess.
//        return null;  //To change body of created methods use File | Settings | File Templates.
//    }


}