package u03_ArraysAndLoops;

public class s02_ForLoops {
    public static void main(String[] args){

        int[] arr = {657, 54, 865, 476, 65, 654, 978, 314, 563, 10};

        //Goal #1 - Use while-loop to cycle through an array and print out each element's value

        int whileIndex = 0;
        while(whileIndex < arr.length){
            System.out.println(arr[whileIndex]);
            whileIndex++;
        }

        //Goal #2 - Use a for-loop to cycle through an array and print out each element's value
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        int[] large = new int[1000];
        //Goal #3 - Use a for-loop to assign a new default value to an array with 1000 elements
        for(int i=0; i<large.length; i++){
            large[i] = 42;
        }

        //Goal #4 - Use a for-loop to cycle through an array and print out each element's value
        for(int i=0; i<large.length; i++){
            System.out.println(large[i]);
        }

        //Goal #5 - Use a for-loop to cycle through an int array. Double the value of every other number in the array.
        //Option 1
        for(int i=0; i<large.length; i++){
            if(i%2==0){
                large[i] = large[i]*2;
            }
        }
        //Option 2
        for(int i=0; i<large.length; i=i+2){
            large[i] = large[i]*2;
        }


    }
}
