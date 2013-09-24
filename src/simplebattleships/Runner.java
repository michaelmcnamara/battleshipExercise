package simplebattleships;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Michael
 * Date: 23/09/13
 * Time: 23:59
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    static Grid grid;


    public static void main(String[] Args) throws IOException {
        String guess="1";
        Integer numericGuess = Integer.valueOf(guess);

        Boolean targetDestroyed = false;
        while(!targetDestroyed){
            Grid grid = new Grid();
            System.out.println("Captain!, where should we fire? available grid targets are: Grid 0 to Grid " + grid.getlength() + "\n");
            ;
 //            guess = System.in.toString();
            System.out.println("Yes Sir! Fire on Grid " + guess + "\n Firing on Grid " + guess + "\n BOOM! \n");
            targetDestroyed = grid.istargetdestroyed(numericGuess);
            numericGuess = numericGuess+1;
        }
        System.out.println("Captain! Lookout reports smoke! Sonar reports ship sunk We got him sir!\n");


//        System.out.println("grid contains: " + grid.toString());
    }


}
