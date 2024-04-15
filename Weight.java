public class Weight implements Comparable<Weight> { //The class implements Comparable, allowing it to be sorted.
    int pounds; //How heavy the exercise weight is in pounds.
    String type; //The type of the weight, eg. dumbbell, plate.

    Weight(int pounds, String type) { //Weight constructor.
        this.pounds = pounds;
        this.type = type;
    }

    //A method to compare the weight to other weights when sorting the list.
    public int compareTo(Weight w) {
        if(pounds == w.pounds) {
            return 0; //If the pounds are the same, return 0
        } else if(pounds < w.pounds) {
            return -1; //If it is lighter than the weight being compared, return -1
        } else {
            return 1; //If it is heavier than the weight being compared, return 1
        }
    }
}