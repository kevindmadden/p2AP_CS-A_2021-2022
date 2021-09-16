package u02_UsingObjects;

public class s10_equals {
    public static void main(String[] args){
        //primitive variables: int, double, boolean, char
        //  use == to compare

        int num1 = 89;
        int num2 = 89;
        if(num1==num2){
            System.out.println("Use a =='s for comparing primitive data types");
        }

        //objects: String (main thing we've used)
        String word1 = "hi";
        String word2 = "hi";
        if(word1.equals(word2)){
            System.out.println("Use .equals to compare objects like String, Color, etc.");
        }

    }
}
