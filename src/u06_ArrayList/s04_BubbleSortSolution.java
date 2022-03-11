package u06_ArrayList;

import java.util.ArrayList;

//https://visualgo.net/en/sorting?slide=1-1 - Bubble Sort Visualization
public class s04_BubbleSortSolution {

    public static void main(String[] args){
        //Array is generated initially completely out of order
        ArrayList<Integer> list = generateRandomIntegerArrayList();
        printArrayListWithIndexNums(list);

        //Your code goes below for using bubble sort in order to get data in order

        int endIndex = list.size();
        for(int j=0; j<list.size(); j++){
            for(int i=0; i<endIndex-1; i++){
                int numLeft = list.get(i);
                int numRight = list.get(i+1);
                if(numLeft > numRight){
                    list.set(i, numRight);
                    list.set(i+1, numLeft);
                }
            }
            endIndex--;
        }

        printArrayListWithIndexNums(list);


    }

    public static ArrayList<Integer> generateRandomIntegerArrayList(){
        //Constructs an array with the numbers 10 through 99 in order.
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<100; i++){
            list.add((int)(Math.random()*100));
        }
        return list;
    }

    public static void printArrayListWithIndexNums(ArrayList<Integer> list){
        System.out.println(list.toString());
        System.out.print("  ");
        for(int i=0; i<list.size(); i++){
            if(i<9){
                System.out.print(i+",  ");
            }else if(i<=98){
                System.out.print(i+", ");
            }else{
                System.out.print(i+",");
            }
        }
        System.out.println();
    }



}
