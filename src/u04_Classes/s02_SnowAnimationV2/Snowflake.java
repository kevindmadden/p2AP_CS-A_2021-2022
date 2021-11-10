package u04_Classes.s02_SnowAnimationV2;

public class Snowflake {
    private double xPos;
    private double yPos;
    private double yVel;

    public Snowflake(){
        xPos = Math.random()*100;
        yPos = Math.random()*100+100;
        yVel = 30;
    }

    public void calculate(double timeElapsed){
        yPos = yPos - yVel*timeElapsed;

    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(xPos, yPos, .5);
    }

}
