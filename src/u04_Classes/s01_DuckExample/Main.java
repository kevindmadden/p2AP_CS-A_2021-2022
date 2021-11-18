package u04_Classes.s01_DuckExample;

public class Main {
    public static void main(String[] args){
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();

        duck1.honk();
        duck1.honk();
        duck1.honk();
        duck2.honk();
        System.out.println(duck1.getNumOfTimesHonked());
        System.out.println(duck2.getNumOfTimesHonked());
        duck1.killedByCar();
        duck1.honk();
        duck2.honk();

        System.out.println("Total num of honks (accessed from Main method): "+Duck.getTotalNumOfAllHonks());



        System.out.println(duck1.toString());


    }
}
