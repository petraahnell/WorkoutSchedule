import java.util.ArrayList;

public class Main {

    /*TODO create app
    Big "GO" button on front screen
    Photo/video of exercise
    Forward and backward buttons
    Timer for duration based exercises
    Settings menu where you can set how many reps and sets (or tabata mode)
    (Every exercise should be available with or without timer)
    You can also remove and add exercise, and change nr of reps
    And set what equipment you have
    */

    public static void main(String[] args){
        SetGenerator sg = new SetGenerator();
        ArrayList<Exercise> exercises = sg.generateSet(10);
        for(Exercise e : exercises){
            System.out.println(e);
        }
    }
}
