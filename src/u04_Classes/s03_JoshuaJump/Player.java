package u04_Classes.s03_JoshuaJump;

public class Player {
    private double xPos;
    private double yPos;
    private double halfWidth;
    private double halfHeight;
    private double width;
    private double height;

    public Player(double xPos, double yPos, double halfWidth, double halfHeight){
        this.xPos = xPos;
        this.yPos = yPos;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        this.width = halfWidth*2;
        this.height = halfHeight*2;
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(xPos, yPos, halfWidth, halfHeight);
    }

}
