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
    String oneDGrid[];
    Ship shipOne;

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

    @Override
    public String toString() {
        String grid = "";
        for(int i=0; i < (oneDGrid.length-1); i++){
            grid.concat(oneDGrid[i] + ", ");
        }
        grid.concat(oneDGrid[oneDGrid.length]);
        return grid;    //To change body of overridden methods use File | Settings | File Templates.
    }


}