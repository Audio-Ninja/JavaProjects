public class Drink {
    int ounces; //The current number of ounces of the drink
    String brand; //The brand of the drink
    int calories; //How many calories the drink has
    public Drink(int ounces, String brand, int calories) {
        this.ounces = ounces;
        this.brand = brand;
        this.calories = calories;
    }
    //A method to see how many calories are in the drink.
    public int getCalories() {
        return calories;
    }
    //A method to take a sip of the drink, reducing its ounces.
    public void takeSip() {
        if(ounces > 0) {
            ounces--;
        }
    }
}
