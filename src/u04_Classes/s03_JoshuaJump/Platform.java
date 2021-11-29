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
