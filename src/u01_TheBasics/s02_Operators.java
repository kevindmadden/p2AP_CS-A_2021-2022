package u01_TheBasics;

public class s02_Operators {
    public static void main(String[] args) {

        //Mathematical Operators
        int addition = 8+2;
        int subtraction = 9-2;
        int multiplication = 3*5;
        int division = 8/2;

        System.out.println(addition); //print out value in addition variable
        System.out.println(8+2); //print out 10

        /*
            Integer Division
         */
        System.out.println();
        System.out.println("Integer Division");
        System.out.println(5/2); //5/2 => expect 2.5, but it cuts off the decimal
        int num1 = 5;
        int num2 = 2;
        System.out.println(num1/num2);
        //Conclusion, when you divide two int values in java,
        // java cuts off the decimal and does NOT round.
        double num3 = 5;
        double num4 = 2;
        System.out.println(num3/num4); //prints out 2.5 like we would expect
        System.out.println(num1/num4); // int/double => 2.5
        System.out.println(num3/num2); // double/int => 2.5
        //Conclusion: When you divide, you only get an int when both are int.
        //            If at least one of the numbers is a double, you get a double back.
        // int/int => int (cuts off the decimal, no rounding)
        // int/double => double
        // double/int => double
        // double/double => double

        /*
            Modulus Operator (%)
         */
        System.out.println(5%2); //result => 1 (because the remainder of 5/2 is 1)
        System.out.println(8%3); //result => 2 (because the remainder of 8/3 is 2)
        System.out.println(12%8); //result => 4 (because the remainder of 12/8 is 4)

        //String Operator (concatenation --- +)
        String words1 = "There are";
        String words2 = "birds.";
        System.out.println(words1+" "+words2);

        /*
            Compound Operators
            -Compound operators are shortcuts
         */

        int value1 = 4;
        value1 = value1*5; //result of this is 20 gets stored in value1
        int value1Shortcut = 4;
        value1*=5; //this is equivalent to: value1 = value1*5;

        //Shortcuts like this exist for all the operators. So all these exist:
        // +=, -=, *=, /=, %=

        //Final shortcuts (actually useful)
        int count = 1;
        count++; //this is equivalent to: count = count + 1;
        System.out.println(count); //prints out a 2
        count--; //this is equivalent to: count = count - 1;
        System.out.println(count); //prints out a 1

        /*
            Casting
         */

        System.out.println("If we don't cast, then 5/2 will be... ");
        int enteredAsInt1 = 5;
        int enteredAsInt2 = 2;
        System.out.println(enteredAsInt1/enteredAsInt2); //print out 2
        //This is how to cast and int to instead be a double
        System.out.println((double)enteredAsInt1/enteredAsInt2); //print out 2.5





    }

}
