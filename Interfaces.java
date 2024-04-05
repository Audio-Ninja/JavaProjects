import java.util.*;
public class Interfaces {
    public static void main(String[] args) {
        ArrayList<Weight> weights = new ArrayList<Weight>();
        weights.add(new Weight(15, "Kettlebell"));
        weights.add(new Weight(20, "Dumbbell"));
        weights.add(new Weight(40, "Plate"));
        weights.add(new Weight(5, "Dumbbell"));
        weights.add(new Weight(50, "Plate"));
        weights.add(new Weight(30, "Kettlebell"));

        Collections.sort(weights);
        for(Weight w:weights) {
            System.out.println("Weight " + w.type + ": " + w.pounds + " pounds.");
        }
    }
}