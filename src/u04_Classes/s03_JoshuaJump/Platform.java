package u04_Classes.s03_JoshuaJump;

public class Platform {
    private double xPos;
    private double yPos;
    private double halfWidth;
    private double halfHeight;
    private double width;
    private double height;

    public Platform(double xPos, double yPos, double halfWidth, double halfHeight){
        this.xPos = xPos;
        this.yPos = yPos;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        this.width = halfWidth*2;
        this.height = halfHeight*2;
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.filledRectangle(xPos, yPos, halfWidth, halfHeight);
    }

    //didSquish
    //creating a method that directly changes Joshua's location
    // - A parameter of this method, would be the player

    public void managePlayerPlatformCollision(Player player){
        //Setup two different hitboxes
        boolean didHitTopHitbox = Main.didRectRectColl(player.getxPos(), player.getyPos(), player.getHalfWidth(), player.getHalfHeight(), xPos, yPos+0.5*halfHeight, halfWidth, 0.5*halfHeight);

        if(didHitTopHitbox){
            player.setyPos(this.yPos+this.halfHeight+player.getHalfHeight());
        }

        //Top hitbox
        //center: (xPos ,yPos+0.5*halfHeight)
        //half height: 0.5*halfHeight
        //halfWidth: halfWidth

        //Bottom hitbox


    }

    //creating a method that returns a value indicating whether:
    // (1) Joshua didn't collide with platform
    // (2) If Joshua did collide with a platform, which direction did he come from?



    public double getYTop(){
        return yPos+halfHeight;
    }

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
}
