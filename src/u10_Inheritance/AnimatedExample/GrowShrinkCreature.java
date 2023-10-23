package u10_Inheritance.AnimatedExample;

public class GrowShrinkCreature extends InescapableCreature {
    public GrowShrinkCreature(double xPos, double yPos, double xVel, double yVel, double radius){
        super(xPos, yPos, xVel, yVel, radius);
    }

    public void calculate(double timeElapsed){


        super.calculate(timeElapsed);
    }

    public void draw(){
        super.draw();
    }

}
