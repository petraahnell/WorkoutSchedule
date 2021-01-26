import java.util.ArrayList;
import java.util.Random;

public class SetGenerator {

    // TODO add muscle group

    public  static int UNIQUE = 0;
    public  static int PUSH_UPS = 1;
    public  static int SIT_UPS = 2;
    public  static int PLANK = 4;
    public  static int BURPIES = 5;
    public  static int SQUATS = 6;
    public  static int LUNGES = 7;
    public  static int INCHWORM = 8;
    public  static int BOAT = 9;
    public static int GLUTE_BRIDGE = 10;
    public static int BACK_EXTENSION = 11;

    public static int NO_EQUIPMENT = 0;

    private ArrayList<Exercise> allExercises;
    private Random random;
    private static int maxTries = 1000;

    public SetGenerator(){
        random = new Random();
        allExercises = new ArrayList<Exercise>();
        allExercises.add(new Exercise("Scorpion push ups, each side", PUSH_UPS, false, 4));
        allExercises.add(new Exercise("Push ups with clap on knees", PUSH_UPS, false,6));
        allExercises.add(new Exercise("Push ups with arm stretch forward on up, on knees", PUSH_UPS, false,8));
        allExercises.add(new Exercise("Triceps push ups on knees", PUSH_UPS, false,8));
        allExercises.add(new Exercise("Scapula push ups on knees", PUSH_UPS, false,8));
        allExercises.add(new Exercise("Hands elevated push ups", PUSH_UPS, false,8));
        //allExercises.add(new Exercise("Side plank, each side", PLANK, true,20));
        allExercises.add(new Exercise("Side plank with contractions, each side", PLANK, true,20));
        allExercises.add(new Exercise("Plank with alternating lifted feet", PLANK, true,30));
        allExercises.add(new Exercise("Russian twists (both sides is one twist)", BOAT, false,30));
        allExercises.add(new Exercise("Sit up with long arms", SIT_UPS, false,10));
        allExercises.add(new Exercise("Knee to elbow crunches (both sides is one rep)", BOAT, false,30));
        allExercises.add(new Exercise("Glute bridge", GLUTE_BRIDGE, false,14));
        allExercises.add(new Exercise("Glute bridge one leg up, each side", GLUTE_BRIDGE, false,6));
        allExercises.add(new Exercise("Dead bug, each side", UNIQUE, false,6));
        allExercises.add(new Exercise("Forward lunge, each side", LUNGES, false,8));
        allExercises.add(new Exercise("Bench dips", UNIQUE, false,10));
        allExercises.add(new Exercise("Jump squats", SQUATS, false,10));
        allExercises.add(new Exercise("Squats with bounce", SQUATS, false,10));
        allExercises.add(new Exercise("Burpies with push up and jump", BURPIES, false,8));
        allExercises.add(new Exercise("Burpies with kick, alternate legs", BURPIES, false,12));
        allExercises.add(new Exercise("Fast inchworm with push ups", INCHWORM, false,6));
        allExercises.add(new Exercise("Inchworm with baby cobra to down dog", INCHWORM, false,6));
        allExercises.add(new Exercise("Inchworm with triceps push ups", INCHWORM, false,6));
        allExercises.add(new Exercise("Donkey kicks, each side", UNIQUE, false,10));
        allExercises.add(new Exercise("Bird dog, each side", UNIQUE, false,8));
        allExercises.add(new Exercise("Lying leg lower", UNIQUE, false,10));
        allExercises.add(new Exercise("Step up on bench, each side", UNIQUE, false,6));
        allExercises.add(new Exercise("Flutter kicks", UNIQUE, true,30));
        allExercises.add(new Exercise("Standing raise leg, each side", UNIQUE, false,6));
        allExercises.add(new Exercise("Biceps curl, each side", UNIQUE, false,8));
        allExercises.add(new Exercise("Triceps bend w weights, each side", UNIQUE, false,8));
        allExercises.add(new Exercise("Kettlebell thrust", UNIQUE, false,10));
        allExercises.add(new Exercise("Hangboard", UNIQUE, true,10));
        allExercises.add(new Exercise("Back extension (rygglyft), pass around 1 kg", BACK_EXTENSION, true,10));
        allExercises.add(new Exercise("Dead lifts", BACK_EXTENSION, true,10));
    }

    public ArrayList<Exercise> generateSet(int nrOfExercises){
        ArrayList<Exercise> exercises = new ArrayList<>();
        int tries = 0;
        while(exercises.size() < nrOfExercises && tries < maxTries){
            //TODO optimize randomizer
            int x = random.nextInt(allExercises.size());
            Exercise newExercise = allExercises.get(x);
            boolean add = true;
            for(Exercise e : exercises){
                if(e.name == newExercise.name || e.exercise_group == newExercise.exercise_group && e.exercise_group != UNIQUE){
                    add = false;
                }
            }
            if(add) {
                exercises.add(newExercise);
            }
            tries++;
        }
        return exercises;
    }
}
