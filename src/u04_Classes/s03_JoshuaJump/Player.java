package u04_Classes.s03_JoshuaJump;

import java.awt.event.KeyEvent;

public class Player {
    private double xPos;
    private double yPos;
    private double halfWidth;
    private double halfHeight;
    private double width;
    private double height;
    private double xVel;
    private double yVel;
    private double accel;
    private Platform ground;

    public Player(double xPos, double yPos, double halfWidth, double halfHeight, Platform ground){
        this.xPos = xPos;
        this.yPos = yPos;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        this.width = halfWidth*2;
        this.height = halfHeight*2;
        this.accel = 1000;
        this.ground = ground;
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(xPos, yPos, halfWidth, halfHeight);
    }

    public void calculate(double timeElapsed){
        if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT) && StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
            xVel = 0;
        }else if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
            xVel = -20;
        }else if(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
            xVel = 20;
        }else{
            xVel = 0;
        }
        xPos = xPos + xVel*timeElapsed;
        yPos = yPos + yVel*timeElapsed - (accel)*Math.pow(timeElapsed, 2);
        System.out.println(yPos);
        if(this.yPos-this.halfHeight < ground.getyPos()+ground.getHalfHeight()){
            this.yPos = ground.getyPos()+ground.getHalfHeight()+this.halfHeight;
        }



    }

}
