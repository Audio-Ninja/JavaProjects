import java.util.*;
public class Interfaces {
    public static void main(String[] args) {
        ArrayList<Weight> weights = new ArrayList<Weight>();
        weights.add(new Weight(15, "Kettlebell"));
        weights.add(new Weight(25, "Dumbbell"));
        weights.add(new Weight(45, "Plate"));
        weights.add(new Weight(5, "Dumbbell"));
        weights.add(new Weight(60, "Plate"));
        weights.add(new Weight(30, "Kettlebell"));
        weights.add(new Weight(12, "Medicine Ball"));
        weights.add(new Weight(50, "Dumbbell"));
        weights.add(new Weight(150, "Plate"));
        weights.add(new Weight(20, "Medicine Ball"));

        Collections.sort(weights);
        for(Weight w:weights) {
            System.out.println("Weight " + w.type + ": " + w.pounds + " pounds.");
        }
    }
}