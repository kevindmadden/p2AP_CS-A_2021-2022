package u03_ArraysAndLoops;

public class s07_breakStatements {

    public static void main(String[] args){

        for(int i=0; i<10; i++){
            System.out.println(i);
            if(i==5){
                break;
            }
        }

        System.out.println("------");

        for(int i=0; i<10; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);
        }

    }

}
