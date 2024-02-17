//Created by Alma Stevens for CTE software development 1
//instructor: Mr Gross

/*
This project will create a random list of 15 numbers and sort then in order from least to greatest using a method called bubble sort. It will then sort the list using the selection sort method then compare the results of both methods.
*/
public class SortMethods {
//This function prints a given array
static void printList(int[]arrayToPrint){
        for(byte i = 0; i < arrayToPrint.length; i++) {
        if(i == 0) System.out.print("[");
            System.out.print(arrayToPrint[i]);
            if(i == arrayToPrint.length - 1) {
            System.out.print("]");
            } else {
            System.out.print(", ");
            }
        }
        System.out.println("");
}
    //This function swaps a given list item with the one right after it
    static void swapItem(int[]array, int index, int index2) {
    int item;
        item = array[index];
    array[index] = array[index2];
        array[index2] = item;
    }
//This runs the main code
public static void main(String[] args) {
//Creates the lists and fills them with random values:
        int[] list = new int[15];
        int[] unSorted = new int[15];
        int[] selSort = new int[15];
        for(int i = 0; i < list.length; i++) {
        int temp = (int) (Math.random() * 51);
            list[i] = unSorted[i] = selSort[i] = temp;
        }
       
        boolean listSorted = false;
        byte numberOfSwaps;
        //sort the list using bubble sort
        int bubbleIterations = 0;
        while(listSorted == false) {
        numberOfSwaps = 0;
            for(byte i = 0; i < list.length - 1; i++) {
            bubbleIterations++;
            if(list[i] > list[i+1]) {
                swapItem(list,i,i+1);
                numberOfSwaps++;
                }
            }
            //the list is fully sorted if there were no swaps
            if(numberOfSwaps == 0) {
            listSorted = true;
            }
        }
        //sort the list using selection sort
        int selectionIterations = 0;
        byte start = 0;
        int smallestIndex = 0;
        for(byte i = 0; i < selSort.length - 1; i++) {
            int smallest = selSort[start];
            for(int x = start + 1; x < selSort.length; x++) {
            selectionIterations++;
            if(selSort[x] < smallest) {
                smallest = selSort[x];
                    smallestIndex = x;
                }
            }
            if(smallest != selSort[start]) {
                swapItem(selSort,start,smallestIndex);
            }
            selSort[start] = smallest;
            start++;
        }
        //print the unsorted list and the sorted lists from each method
        System.out.println("Unsorted List:");
        printList(unSorted);
        System.out.println("Bubble Sorted List:");
        printList(list);
        System.out.println("Selection Sorted List:");
        printList(selSort);
        System.out.println("");
        //finally, show how many iterations each method took to sort the list
        System.out.print("Bubble sort used " + bubbleIterations + " iterations and Selection sort used " + selectionIterations + " iterations");
}
}