package u02_UsingObjects;

public class s15_CodingBatMethodExplained {
    public static void main(String args[]){
        String word1 = helloName("Bob");
        System.out.println(word1);

        String word2 = helloName("Alice");
        System.out.println(word2);

        String word3 = helloName("Hello");
        System.out.println(word3);

        String word4 = helloName("ice cream");
        System.out.println(word4);

    }

    public static String helloName(String name) {
        String message = "Hello " + name + "";
        return message;
    }

}
