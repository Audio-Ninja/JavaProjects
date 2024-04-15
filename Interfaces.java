//Created by Alma Stevens for CTE software development 1
//instructor: Mr Gross
/*
this project creates a list of different exercise weights of different types and different amounts of pounds
using the Weight.java class in another file. The list is sorted in pounds, from lightest to heaviest.
 */
import java.util.*; //imports the java utilities package. This is necessary to sort the list.
public class Interfaces {
    public static void main(String[] args) {
        //Creates an ArrayList name weights using the Weight class.
        ArrayList<Weight> weights = new ArrayList<Weight>();
        //Creates 10 weights using the Weight class, and each one is assigned with different properties.
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

        Collections.sort(weights); //Sorts the list using a method from the java.util package.
        //Loops through the list in order and prints the properties of each item.
        for(Weight w:weights) {
            System.out.println("Weight " + w.type + ": " + w.pounds + " pounds.");
        }
    }
}