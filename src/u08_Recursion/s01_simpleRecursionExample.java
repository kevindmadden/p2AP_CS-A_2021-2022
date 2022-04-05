package u08_Recursion;

public class s01_simpleRecursionExample {

    public static void main(String[] args){
        printNumPlus1(2);
    }

    public static void printNumPlus1(int num){
        int value = num+1;
        System.out.println(value);
        if(value < 1000){
            printNumPlus1(value);
        }
    }

}
