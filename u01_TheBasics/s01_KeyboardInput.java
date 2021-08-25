import java.util.Scanner;

public class s01_KeyboardInput {
    public static void main(String args[]){

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter an int: ");
        int storedInt = kb.nextInt();
        System.out.println("You entered the following int: " + storedInt);

        System.out.println("Enter a String: ");
        kb.nextLine(); //dummy
        String enteredString = kb.nextLine();
        System.out.println(enteredString);

        System.out.println("Enter an int: ");
        int storedInt2 = kb.nextInt();
        System.out.println("You entered the following int: " + storedInt2);
        int storedInt3 = kb.nextInt();
        System.out.println("You entered the following int: " + storedInt3);

        //If you switch from pulling in an int to pulling in a String,
        //  then you will need a dummy kb.nextLine()





    }
}
