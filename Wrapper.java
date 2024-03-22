/*
This project creates objects, edits them using their modifiers, and prints information about them using their attributes. 
The objects are created with the Drink class and its two extensions: the Soda and Milk classes. 
*/
public class Wrapper {
    public static void main(String args[]) {
        //Create some classes from the Drink, Soda, and Milk class files.
        Drink water = new Drink(16, "water");
        Soda rootBeer = new Soda(12, "A&W", "Root Beer", 43);
        Milk chocMilk = new Milk(8, "Chocolate Milk", 3.5);
        Milk twoPercent = new Milk(10, "2% Milk", 2.0);
        //Use the methods inside the classes to print and change the objects.
        water.print(); //Prints information about the water using the method print()
        water.takeSip(3); //The takeSip method will reduce the sprite ounces by the parameter 4. It also prints how many ounces were removed.
        water.print();
        rootBeer.print();
        rootBeer.takeSip(12);
        rootBeer.refill(); //Sets the number of ounces in the drink to its original value.
        rootBeer.print();
        chocMilk.print();
        chocMilk.skim(); //Skims the milk, which removes the fat from it.
        System.out.println("It now has a fat percentage of " + chocMilk.getFatPercentage()); //Prints the fatPercentage using the getFatPercentage() method.
        twoPercent.print();
        twoPercent.takeSip(5);
        twoPercent.print();
    }
}
