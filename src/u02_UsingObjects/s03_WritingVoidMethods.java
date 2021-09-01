package u02_UsingObjects;

public class s03_WritingVoidMethods {
    public static void main(String[] args){
        drawTriangle(0.2, 0.3);
        drawTriangle(.8, .6);

    }

    //
    public static void drawTriangle(double xShift, double yShift){
        StdDraw.line(0+xShift,0+yShift, 0.1+xShift, 0.2+yShift);
        StdDraw.line(0.1+xShift, 0.2+yShift, .2+xShift,0+yShift);
        StdDraw.line(.2+xShift,0+yShift, 0+xShift, 0+yShift);
    }

}
