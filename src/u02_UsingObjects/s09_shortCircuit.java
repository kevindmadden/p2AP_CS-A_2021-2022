package u02_UsingObjects;

public class s09_shortCircuit {
    public static void main(String[] args){
        int num0 = 0;
        int num7 = 7;
        //System.out.println(num7/num0); //this throws an error

        /* This will also throw an error
        if(num0/num7==0 && num7/num0==0){

        }
         */

        //short-circuit
        if(num0/num7==0 || num7/num0==0){
            System.out.println("This would print out without errors!");
        }

        /*
        if(num7/num0==0 || num0/num7==0){
            System.out.println("This would throw an error!");
        }
         */


    }
}
