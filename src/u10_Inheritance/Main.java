package u10_Inheritance;

public class Main {
    public static void main(String[] args){
        Bird bird1 = new Bird();
        bird1.talk();
        Bird bird2 = new Bird("I'm unique bird!", true, true, true);
        bird2.talk();

        Duck duck1 = new Duck();
        duck1.talk();


    }
}
