public class Drink {
    int ounces; //The current number of ounces of the drink
    String brand; //The brand of the drink
    String type; //The type of soda under that brand.
    public Drink( int ounces, String brand, String type) {
        this.ounces = ounces;
        this.brand = brand;
        this.type = type;
    }
    //A method to see how many calories are in the drink.
    public int getOunces() {
        return ounces;
    }
    //A method to take a sip of the drink, reducing its ounces.
    public void takeSip(int amount) {
        if(ounces > 0) {
            ounces-= amount;
            if(ounces < 0) {
                amount += ounces;
            }
            System.out.println(amount + " ounces was sipped from the " + type);
        }
        if(ounces <= 0) {
            System.out.println("The drink " + type + " is now empty");
        }
    }
    public void print() {
        System.out.println("The Drink " + type + " of the brand " + brand + " currenty contains " + ounces + " ounces");
    }
}