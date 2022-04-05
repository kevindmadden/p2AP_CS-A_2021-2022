package u10_Inheritance;

public class Duck extends Bird {
    private boolean inTheWay;

    public Duck(){
        super();
        inTheWay = true;
        this.speechContent = "I'm a duck";
    }



    public String toString(){
        return super.toString() + "I'm actually a duck";
    }


}
