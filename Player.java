import java.util.ArrayList;

public class Player {
    ArrayList<Integer> handValues = new ArrayList<Integer>();
    ArrayList<String> handSuits = new ArrayList<String>();
    String player;

    public Player (String player) {
        this.player = player;
    }

    public void showHand() {
        System.out.println(player + "'s hand is:");
        System.out.print("[");
        for(int i = 0; i < handValues.size(); i++) {
            String face;
            if(handValues.get(i) == 11) {
                face = "Jack";
            } else if(handValues.get(i) == 12) {
                face = "Queen";
            } else if(handValues.get(i) == 13) {
                face = "King";
            } else if(handValues.get(i) == 14) {
                face = "Ace";
            } else {
                face = Integer.toString(handValues.get(i));
            }
            System.out.print(face + " of " + handSuits.get(i));
            if(i != handValues.size() - 1) {
                System.out.print(", ");
            }    
        }
        System.out.println("]");
    }
}
