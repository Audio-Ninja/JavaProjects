public class ObjectsPartTwo {
    public static void main(String[] args) {
        Drink sprite = new Drink(12, "Coca-Cola", "Sprite");
        Drink orangeFanta = new Drink(16, "Coca-Cola", "Orange Fanta");
        Drink canadaDry = new Drink(12, "Pepsi", "Canada Dry");
        sprite.print();
        sprite.takeSip(4);
        sprite.print();
        sprite.takeSip(8);
        orangeFanta.print();
        orangeFanta.takeSip(6);
        orangeFanta.print();
        canadaDry.print();
        canadaDry.takeSip(7);
        canadaDry.takeSip(5);
    }
}