package u03_ArraysAndLoops;

public class s08_continueStatements {
    public static void main(String[] args){
        for(int i= 0; i<100; i++){
            System.out.println(i);
        }

        System.out.println();

        for(int i= 0; i<100; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }

        for(int i= 0; i<100; i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }

    }


}
