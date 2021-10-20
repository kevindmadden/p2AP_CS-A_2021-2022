package u03_ArraysAndLoops;
/*
    Good reference: https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit6-Arrays/topic-6-2-traversing-arrays.html
 */

public class s05_MoreOnForLoops {

    public static void main(String args[]){
        int[] arr1 = getRandomIntArr();
        printFrontToBack(arr1);
        System.out.println();
        printBackToFront(arr1);
        System.out.println();
        printEveryOther(arr1);
        System.out.println();
        printUntilNum(arr1, 3);
        System.out.println();
        printFrontToBack(doubleArr(arr1));
        System.out.println();


    }

    public static int[] getRandomIntArr(){
        int[] arr = new int[(int)(Math.random()*20+10)];
        for(int i=0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*5);
        }
        return arr;
    }


    //Printing out front to back
    public static void printFrontToBack(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }


    //Printing out Back to Front
    public static void printBackToFront(int[] arr){
        for(int i = arr.length-1; i > 0; i--){
            System.out.print(arr[i]+",");
        }
    }

    //Printing out every other element
    public static void printEveryOther(int[] arr){
        for(int i = 0; i < arr.length; i=i+2){
            System.out.print(arr[i]+",");
        }
    }

    //Break statements - Ending for-loops early
    //Write a method that prints out the array but stops if it encounters a specified value
    public static void printUntilNum(int[] arr, int stopNum){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
            if(arr[i]==stopNum){
                break;
            }
        }

    }

    //Returning a new array that doubles each number in the passed in array
    public static int[] doubleArr(int[] arr){
        for(int i=0; i < arr.length; i++){
            arr[i] = arr[i]*2;
        }
        return arr;
    }



}
