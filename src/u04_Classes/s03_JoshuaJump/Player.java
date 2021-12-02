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
    private boolean hasUsedJump;
    private double jumpStartYPos;
    private boolean hasReachedMaxJumpHeight;
    private boolean shouldGravityBeginForcingJoshuaBackDown;
    private double maxJumpHeight;
    private boolean isOnPlatform;

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
        hasUsedJump = false;
        hasReachedMaxJumpHeight = false;
        shouldGravityBeginForcingJoshuaBackDown = false;
        maxJumpHeight = 50;
        jumpStartYPos = 0;

    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(xPos, yPos, halfWidth, halfHeight);
    }

    public void calculate(double timeElapsed){
        //this.yFeet = this.yPos-this.halfHeight;

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

        if(StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
            if ((this.yFeet - this.jumpStartYPos < maxJumpHeight)) {
                isOnPlatform = false;
                yVel = 40;
            } else {
                yVel = 0;
            }
        }

        /*if(StdDraw.isKeyPressed(KeyEvent.VK_UP)){
            //if(this.yPos )
            if((this.yFeet-this.jumpStartYPos < maxJumpHeight)){
                isOnPlatform = false;
                yVel = 40;
            }else{

                yVel=0;
            }
            if(!hasUsedJump){
                jumpStartYPos = this.yFeet;
            }
        }else{
            yVel = 0;
            if(this.yFeet == this.ground.getYTop()){
                System.out.println("On ground");
            }
        }*/


        if(this.yFeet == this.ground.getYTop()){
            isOnPlatform = true;
            hasUsedJump = false;
            hasReachedMaxJumpHeight = false;
            jumpStartYPos = this.ground.getYTop();

        }else{
            isOnPlatform = false;
            hasUsedJump = true;
            if(!hasReachedMaxJumpHeight){
                shouldGravityBeginForcingJoshuaBackDown = false;
            }

        }



        if((this.yFeet-this.jumpStartYPos < maxJumpHeight)){
            hasReachedMaxJumpHeight = false;
        }

        //When is it true that josh has reached his max jump height
        if((this.yFeet-this.jumpStartYPos >= maxJumpHeight)){
            hasReachedMaxJumpHeight = true;
        }
        if(!isOnPlatform && !StdDraw.isKeyPressed(KeyEvent.VK_UP)){
            hasReachedMaxJumpHeight = true;
        }







        //if(StdDraw.isKeyPressed(KeyEvent.VK_UP)){

        //}

        if(this.yPos-this.halfHeight < ground.getyPos()+ground.getHalfHeight()){
            this.yPos = ground.getyPos()+ground.getHalfHeight()+this.halfHeight; //places Joshua on top of ground exactly

        }

        //How do we determine whether the jump has been used?
        //Have we pressed the up-key?
        //Presses of the up-key are invalid if Joshua is in the air
        //How do we tell when joshua can jump again?
        //When joshua hits the ground again

        yPos = yPos + yVel*timeElapsed - (accel)*Math.pow(timeElapsed, 2);
        this.yFeet = this.yPos-this.halfHeight;
        System.out.println(ground.getYTop());
        if(this.yFeet < ground.getYTop()){
            yPos = ground.getYTop()+this.halfHeight;
            System.out.println("in here");
        }
        System.out.println("yPos after: "+yPos);




    }

}
