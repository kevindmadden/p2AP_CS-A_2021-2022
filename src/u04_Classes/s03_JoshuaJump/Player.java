package u04_Classes.s03_JoshuaJump;

import java.awt.event.KeyEvent;

public class Player {
    private static final double JUMP_SPEED = 160;
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
    //private Platform platform1;
    private Platform[] platforms;
    private boolean hasUsedJump;
    private double jumpStartYPos;
    private boolean hasReachedMaxJumpHeight;
    private boolean shouldGravityBeginForcingJoshuaBackDown;
    private double maxJumpHeight;
    private boolean isOnPlatform;

    private double yFeet;

    public Player(double xPos, double yPos, double halfWidth, double halfHeight, Platform ground, Platform[] platforms){
        this.xPos = xPos;
        this.yPos = yPos;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        this.width = halfWidth*2;
        this.height = halfHeight*2;
        this.accel = 4000;
        this.ground = ground;
        //this.platform1 = platform1;
        this.platforms = platforms;
        hasUsedJump = false;
        hasReachedMaxJumpHeight = false;
        shouldGravityBeginForcingJoshuaBackDown = false;
        maxJumpHeight = 30;
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
            xVel = -80;
        }else if(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
            xVel = 80;
        }else{
            xVel = 0;
        }
        xPos = xPos + xVel*timeElapsed;


        if(this.yFeet <= this.ground.getYTop()){
            isOnPlatform = true;
            hasUsedJump = false;
            hasReachedMaxJumpHeight = false;
            jumpStartYPos = this.ground.getYTop();
        }

        for(Platform platform : platforms){
            if(this.yFeet <= platform.getYTop()){
                isOnPlatform = true;
                hasUsedJump = false;
                hasReachedMaxJumpHeight = false;
                jumpStartYPos = platform.getYTop();
            }
        }
        /*
        if(this.yFeet <= this.platform1.getYTop()){
            isOnPlatform = true;
            hasUsedJump = false;
            hasReachedMaxJumpHeight = false;
            jumpStartYPos = this.platform1.getYTop();
        }*/






        if(StdDraw.isKeyPressed(KeyEvent.VK_UP) && !hasReachedMaxJumpHeight){
            yVel = JUMP_SPEED;
        }

        if(!StdDraw.isKeyPressed(KeyEvent.VK_UP) && yVel==JUMP_SPEED){
            hasReachedMaxJumpHeight = true;
            yVel = 0;
        }

        if(this.yFeet-this.jumpStartYPos > maxJumpHeight){
            hasReachedMaxJumpHeight = true;
        }

        if(hasReachedMaxJumpHeight){
            yVel = 0;
        }




        yPos = yPos + yVel*timeElapsed - (accel)*Math.pow(timeElapsed, 2);
        this.yFeet = this.yPos-this.halfHeight;

        /*
        if(this.yFeet < platform1.getYTop() && (this.xPos+this.halfWidth)>platform1.getxPos()-platform1.getHalfWidth() && (this.xPos-this.halfWidth)<platform1.getxPos()+platform1.getHalfWidth()){
            yPos = platform1.getYTop()+this.halfHeight;
        }*/

        if(this.yFeet < ground.getYTop()){
            yPos = ground.getYTop()+this.halfHeight;
        }
    }

    //public didRectCollide

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public double getHalfWidth() {
        return halfWidth;
    }

    public double getHalfHeight() {
        return halfHeight;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    public void setHalfWidth(double halfWidth) {
        this.halfWidth = halfWidth;
    }

    public void setHalfHeight(double halfHeight) {
        this.halfHeight = halfHeight;
    }

    @Override
    public String toString() {
        return "Player{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                ", halfWidth=" + halfWidth +
                ", halfHeight=" + halfHeight +
                ", width=" + width +
                ", height=" + height +
                ", xVel=" + xVel +
                ", yVel=" + yVel +
                ", accel=" + accel +
                ", ground=" + ground +
                ", hasUsedJump=" + hasUsedJump +
                ", jumpStartYPos=" + jumpStartYPos +
                ", hasReachedMaxJumpHeight=" + hasReachedMaxJumpHeight +
                ", shouldGravityBeginForcingJoshuaBackDown=" + shouldGravityBeginForcingJoshuaBackDown +
                ", maxJumpHeight=" + maxJumpHeight +
                ", isOnPlatform=" + isOnPlatform +
                ", yFeet=" + yFeet +
                '}';
    }
}
