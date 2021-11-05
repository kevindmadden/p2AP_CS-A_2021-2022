package u04_Classes.s01_DuckExample;

public class Duck {
    //instance variables/fields
    private int numOfTimesHonked;
    private String speechContent;
    private boolean isSwimming;
    private boolean isFlying;
    private boolean isAlive;

    public Duck(){
        numOfTimesHonked = 0;
        speechContent = "honk!";
        isSwimming = true;
        isFlying = false;
        isAlive = true;
    }

    public void honk(){
        if(isAlive){
            numOfTimesHonked++;
            System.out.println(speechContent);
        }else{
            System.out.println("Dead ducks can't honk.");
        }

    }

    //getter method example
    public int getNumOfTimesHonked(){
        return numOfTimesHonked;
    }

    public void killedByCar(){
        isAlive = false;
        System.out.println("R.I.P.");
    }



}
