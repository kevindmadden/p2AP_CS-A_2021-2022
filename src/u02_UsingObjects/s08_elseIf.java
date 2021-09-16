package u02_UsingObjects;

import java.util.Scanner;

public class s08_elseIf {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        double num = kb.nextDouble();

        if(num < 10){
            System.out.println("This num is less than 10!");
        }else if(num < 15){
            System.out.println("This num is less than 15!");
        }else if(num < 20){
            System.out.println("This num is less than 20!");
        }else{
            if(num<10){
                System.out.println("This num is less than 10!");
            }
            System.out.println("This num is not less than 10!");
        }

    }
}
