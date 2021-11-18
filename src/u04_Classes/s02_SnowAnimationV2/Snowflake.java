package u04_Classes.s02_SnowAnimationV2;

public class Snowflake {
    private double xPos;
    private double yPos;
    private double yVel;
    private static int totalSnowflakeCount = 0;

    public Snowflake(){
        xPos = Math.random()*100;
        yPos = Math.random()*100+100;
        yVel = 30;
    }

    public void calculate(double timeElapsed){
        yPos = yPos - yVel*timeElapsed;
        if(yPos < 0){
            yPos = 110;
            totalSnowflakeCount++;
            System.out.println(totalSnowflakeCount);
        }

    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(xPos, yPos, .5);
    }

}
