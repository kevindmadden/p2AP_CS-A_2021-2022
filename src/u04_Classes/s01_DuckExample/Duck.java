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
            this.numOfTimesHonked++;
            System.out.println(speechContent);
        }else{
            System.out.println("Dead ducks can't honk.");
        }

    }

    //getter/accessor method example
    public int getNumOfTimesHonked(){
        return numOfTimesHonked;
    }

    public void setNumOfTimesHonked(int num){
        numOfTimesHonked = num;
    }



    public void killedByCar(){
        isAlive = false;
        System.out.println("R.I.P.");
    }


    //In intellij: Right-click => generate
    //You can generate getters and setters and toString

    @Override
    public String toString() {
        return "Duck{" +
                "numOfTimesHonked=" + numOfTimesHonked +
                ", speechContent='" + speechContent + '\'' +
                ", isSwimming=" + isSwimming +
                ", isFlying=" + isFlying +
                ", isAlive=" + isAlive +
                '}';
    }

    public String getSpeechContent() {
        return speechContent;
    }

    public void setSpeechContent(String speechContent) {
        this.speechContent = speechContent;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
