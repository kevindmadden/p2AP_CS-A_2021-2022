package u02_UsingObjects;

public class s03_WritingVoidMethods {
    public static void main(String[] args){
        drawTriangle(0.2, 0.3, 1.2);
        drawTriangle(.8, .6, 0.7);

    }

    //
    public static void drawTriangle(double xShift, double yShift, double scale){
        StdDraw.line(0*scale+xShift,0*scale+yShift, 0.1*scale+xShift, 0.2*scale+yShift);
        StdDraw.line(0.1*scale+xShift, 0.2*scale+yShift, .2*scale+xShift,0*scale+yShift);
        StdDraw.line(.2*scale+xShift,0*scale+yShift, 0*scale+xShift, 0*scale+yShift);
    }

}
