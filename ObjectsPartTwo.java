//The purpose of this code is to create 3 objects and edit and print them using their methods.
public class ObjectsPartTwo {
    //Create some objects using the drink class in the Drink.java file.
    public static void main(String[] args) {
        //The first drink is Sprite made by the brand Coca-Cola. It is a typical can with 12 ounces.
        Drink sprite = new Drink(12, "Coca-Cola", "Sprite");
        //The second drink is an Orange flavored Fanta also made by the brand Coca-Cola. This one has 16 ounces.
        Drink orangeFanta = new Drink(16, "Coca-Cola", "Orange Fanta");
        //The third drink
        Drink canadaDry = new Drink(12, "Pepsi", "Canada Dry");
        sprite.print(); //Uses the print method to show the attributes of the drink.
        sprite.takeSip(4); //The takeSip method will reduce the sprite ounces by the parameter 4. It also prints how many ounces were removed.
        sprite.print();
        sprite.takeSip(8); //Takes 8 more ounces from the sprite. Since the drink is now empty, the method will print that it is empty.
        orangeFanta.print();
        orangeFanta.takeSip(6);
        System.out.println("It now has " + orangeFanta.getOunces() + " ounces."); //Uses the getOunces method to find the amount of ounces in the drink.
        canadaDry.print();
        canadaDry.takeSip(7);
        canadaDry.takeSip(8);
        canadaDry.print();
    }
}