package u02_UsingObjects;

public class s02_TestDrawing {
    public static void main(String[] args) {

        //StdDraw.setXscale(0, 100);
        //StdDraw.setYscale(0, 100);
        StdDraw.setScale(0, 100);

        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(51,242, 58);
        StdDraw.point(50, 50);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);
    }
}
