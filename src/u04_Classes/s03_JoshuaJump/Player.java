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
    private boolean hasJumpBeenUsed;
    private double jumpStartYPos;
    private boolean canJumpAgain;
    private double yFeet;

    public Player(double xPos, double yPos, double halfWidth, double halfHeight, Platform ground){
        this.xPos = xPos;
        this.yPos = yPos;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        this.width = halfWidth*2;
        this.height = halfHeight*2;
        this.accel = 1000;
        this.ground = ground;
        this.hasJumpBeenUsed = false;
        this.canJumpAgain = false;

    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(xPos, yPos, halfWidth, halfHeight);
    }

    public void calculate(double timeElapsed){
        this.yFeet = this.yPos-this.halfHeight;

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

        if(StdDraw.isKeyPressed(KeyEvent.VK_UP)){
            //if(this.yPos )
            if((this.yFeet-this.jumpStartYPos < 50)){
                yVel = 40;
            }else{
                yVel=0;
            }
            if(!hasJumpBeenUsed){
                jumpStartYPos = this.yFeet;
                hasJumpBeenUsed = true;
            }
        }else{
            yVel = 0;
            if(this.yFeet == this.ground.getYTop()){
                System.out.println("On ground");
            }
        }

        //How do we determine whether the jump has been used?
        //Have we pressed the up-key?
        //Presses of the up-key are invalid if Joshua is in the air
        //How do we tell when joshua can jump again?
        //When joshua hits the ground again

        yPos = yPos + yVel*timeElapsed - (accel)*Math.pow(timeElapsed, 2);

        System.out.println("yPos: "+yPos+", yVel:"+yVel);
        if(this.yPos-this.halfHeight < ground.getyPos()+ground.getHalfHeight()){
            this.yPos = ground.getyPos()+ground.getHalfHeight()+this.halfHeight; //places Joshua on top of ground exactly
            this.canJumpAgain = true;
        }



    }

}
