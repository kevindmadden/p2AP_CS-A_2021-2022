package u06_ArrayList;

import java.util.ArrayList;

public class Differences {

    public static void main(String[] args){

        //Task #1: Create an array that has 8 elements that are all random integers.
        //Normal Arrays:
        int[] oldWay = new int[8];
        for(int i=0; i<oldWay.length; i++){
            oldWay[i] = (int)(Math.random()*10);
        }

        //ArrayList:
        ArrayList<Integer> newWay = new ArrayList<Integer>();
        for(int i=0; i<8; i++){
            newWay.add((int)(Math.random()*10));
        }

        //Task #2: Overwrite the element at index 5 with the value 10000.
        //Normal Arrays: (oldWay[5] is acting as a variable here and it assigns whatever value is on the right to the variable.
        oldWay[5] = 10000;

        //ArrayList: newWay.get(5) - Returning a reference to the value (NOT acting like a variable
        //newWay.get(5) = 10000; Don't do it this way!!
        newWay.set(5, 10000);




    }
}
