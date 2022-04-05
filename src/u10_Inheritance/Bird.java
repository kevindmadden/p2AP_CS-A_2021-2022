package u10_Inheritance;

public class Bird {

    protected String speechContent;
    private boolean isSwimming;
    private boolean isFlying;
    private boolean isAlive;

    public Bird(){
        this.speechContent = "I'm a bird";
        this.isSwimming = false;
        this.isFlying = true;
        this.isAlive = true;
    }

    public Bird(String speechContent, boolean isSwimming, boolean isAlive, boolean isFlying){
        this.speechContent = speechContent;
        this.isSwimming = isSwimming;
        this.isFlying = isFlying;
        this.isAlive = isAlive;
    }

    public void talk(){
        System.out.println(speechContent);
    }

    public String toString(){
        return speechContent+", "+isSwimming +", "+isFlying +", "+isAlive;
    }

}
