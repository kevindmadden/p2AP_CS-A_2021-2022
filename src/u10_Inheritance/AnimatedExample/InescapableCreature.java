package u10_Inheritance.AnimatedExample;

public class InescapableCreature extends Creature{

    public InescapableCreature(double xPos, double yPos, double xVel, double yVel, double radius){
        super(xPos, yPos, xVel, yVel, radius);
    }

    public void calculate(double timeElapsed){
        if(xPos<0 || xPos>100){
            xVel=xVel*-1;
        }
        if(yPos<0 || yPos>100){
            yVel=yVel*-1;
        }
        super.calculate(timeElapsed);
    }

    public void draw(){
        super.draw();
    }

}
