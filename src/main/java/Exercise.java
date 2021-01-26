public class Exercise {

    public String name;
    public int exercise_group;
    public int reps_or_duration;
    public boolean duration_based;
    public int[] equipment;

    public Exercise(String name, int exercise_group, boolean duration_based, int reps_or_duration){
        //TODO generate id to use as identifier instead of name
        this.name = name;
        this.exercise_group = exercise_group;
        this.reps_or_duration = reps_or_duration;
        this.duration_based = duration_based;
        this.equipment = new int[0];
    }

    public Exercise(String name, int exercise_group, boolean duration_based, int reps_or_duration, int[] equipment){
        //TODO generate id to use as identifier instead of name
        this.name = name;
        this.exercise_group = exercise_group;
        this.reps_or_duration = reps_or_duration;
        this.duration_based = duration_based;
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        if(duration_based){
            return reps_or_duration + " sec " + name;
        } else {
            return reps_or_duration + " x " + name;
        }
    }

    public String toStringTabata() {
        return name;
    }
}
