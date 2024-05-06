import java.util.ArrayList;

public class Dealer extends Player {

    public Dealer(String name) {
        super(name);
    }

    void shuffle(ArrayList<Integer> numbers, ArrayList<String> face) {
        for(byte l = 0; l < 3; l++) {
            for(int i = 0; i< numbers.size(); i++) {
                int rand = (int)(Math.random() * numbers.size());
                int temp = numbers.get(i);
                numbers.set(i, numbers.get(rand));
                numbers.set(rand, temp);
                String tempString = face.get(i);
                face.set(i, face.get(rand));
                face.set(rand, tempString);
            }    
        }
        System.out.println(name + " shuffles the deck thorougly.");
    }

    void deal(ArrayList<Integer> numbers, ArrayList<String> face, Player player) {
        for(byte i = 0; i < 5; i++) {
            player.handValues.add(numbers.get(0));
            player.handSuits.add(face.get(0));
            numbers.remove(0);
            face.remove(0);
        }
    }
}
