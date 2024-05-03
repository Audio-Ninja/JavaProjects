//Created by Alma Stevens for CTE software development 1
//instructor: Mr Gross

import java.util.ArrayList;

public class CardProject {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<String> suits = new ArrayList<String>();

        for(int i = 2; i < 15; i++) {
            values.add(i);
            suits.add("Hearts");
        }
        for(int i = 2; i < 15; i++) {
            values.add(i);
            suits.add("Diamonds");
        }
        for(int i = 2; i < 15; i++) {
            values.add(i);
            suits.add("Clubs");
        }
        for(int i = 2; i < 15; i++) {
            values.add(i);
            suits.add("Spades");
        }
        
        Dealer dealer = new Dealer("The Dealer");
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");

        dealer.shuffle(values, suits);

        dealer.deal(values, suits, player1);
        dealer.deal(values, suits, player2);
        dealer.deal(values, suits, player3);
        dealer.deal(values, suits, dealer);

        player1.showHand();
        player2.showHand();
        player3.showHand();
        dealer.showHand();
    }
}