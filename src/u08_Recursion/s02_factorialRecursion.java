package u08_Recursion;

public class s02_factorialRecursion {

    public static void main(String[] args){
        int val = factorial(5);
        System.out.println(val);
    }

    public static int factorial(int num){
        int val;
        if(num==0){
            val=1;
        }else{
            val = num*factorial(num-1);
        }
        return val;
    }



}
