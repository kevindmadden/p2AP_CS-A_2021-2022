package u08_Recursion;

public class s01_simpleRecursionExample2 {

    public static void main(String[] args){
        //You don't get past the below line of code until you've finished running imAMethod()
        System.out.println(imAMethod());

        printNumPlus1(2);
    }

    public static void printNumPlus1(int num){
        int value = num+1;
        System.out.println(value);
        if(value < 5){ printNumPlus1(value); }
        System.out.println(value);
    }

    public static String imAMethod(){
        return "I'm a method.......";
    }

}
