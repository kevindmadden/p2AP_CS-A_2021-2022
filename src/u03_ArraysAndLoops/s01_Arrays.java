package u03_ArraysAndLoops;

public class s01_Arrays {
    public static void main(String[] args){

        //Array Index #s:    0          1           2        3        4      5
        String[] animals = {"Cheetah", "Elephant", "Sloth", "Zebra", "Dog", "Puma"};
        System.out.println(animals[2]); //Prints out value of items at index 2 (sloth)
        System.out.println(animals.length); //prints out the number of items in our array (6 items)

        int[] countByFour = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
        System.out.println(countByFour.length); //prints out 10 because there are 10 items in countByFour

        //This creates a new array with 90 different items
        double[] nums = new double[90];
        // ^^ When you create an array like this, what happens is that it is filled up with the default value for teach item.
        System.out.println(nums[70]); //The default value for double is 0.0

        String[] words = new String[50];
        System.out.println(words[25]); //prints out null because null is the default value for Strings

        /* Default values for different data types:
            int => 0
            double => 0.0
            boolean => false
            String => null
         */

        //Overwriting an existing value
        System.out.println("Before..." + animals[4]);
        animals[4] = "Cat";
        System.out.println("After..." + animals[4]);


    }
}
