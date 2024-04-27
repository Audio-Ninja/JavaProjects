//Created by Alma Stevens for CTE software development 1
//instructor: Mr Gross

import java.util.ArrayList;

public class CardProject {
    static void shuffle(ArrayList<Integer> numbers, ArrayList<String> face) {
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
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<String> faces = new ArrayList<String>();

        for(int i = 2; i < 15; i++) {
            values.add(i);
            faces.add("Hearts");
        }
        for(int i = 2; i < 15; i++) {
            values.add(i);
            faces.add("Diamonds");
        }
        for(int i = 2; i < 15; i++) {
            values.add(i);
            faces.add("Clubs");
        }
        for(int i = 2; i < 15; i++) {
            values.add(i);
            faces.add("Spades");
        }
        
        shuffle(values, faces);

        for(int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i) + " of " + faces.get(i));
        }
    }
}