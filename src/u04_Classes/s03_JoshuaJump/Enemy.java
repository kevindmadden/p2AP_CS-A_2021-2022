package u04_Classes.s03_JoshuaJump;

public class Enemy {

    private double xPos;
    private double yPos;
    private double xVel;
    private double size;

    public Enemy(Platform ground){
        yPos = ground.getYTop();
        size = 3;
        xVel = 30;
    }

    public void calculate(double timeElapsed){
        xPos = xPos +xVel*timeElapsed;

    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(xPos, yPos, size);
    }


}
