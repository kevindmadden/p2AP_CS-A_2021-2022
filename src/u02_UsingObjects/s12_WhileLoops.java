package u02_UsingObjects;

public class s12_WhileLoops {
    public static void main(String[] args){

        int i = 0;
        while(i < 10){
            i++;
            System.out.println(i);
        }

        int j = 0;
        while(j < 10){
            j++;
            System.out.println(j);
            if(j==5){
                break;
            }
        }


    }
}
