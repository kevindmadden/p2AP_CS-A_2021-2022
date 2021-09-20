package u02_UsingObjects;

//Work through exercises here (skip the project):
// https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit2-Using-Objects/topic-2-7-string-methods.html

public class s11_ManipulatingStrings {

    public static void main(String[] args){
        String sentence = "This is a sentence.";
        //                 0123456789...
        char charInSentence = sentence.charAt(6);
        System.out.println(charInSentence); //prints out s

        System.out.println(sentence.length()); //prints out how many characters are in a String (don't forget about the character at index 0 when you are counting.

        //This would pull out the String "This is" from sentence
        String sentenceFragment1 = sentence.substring(0,7);
        System.out.println(sentenceFragment1);
        //You can use substring to pull out a single character at a time if you want to (however, it isn't very elegant...)
        String singleChar = sentence.substring(2,3);
        System.out.println(singleChar);

        //Substring has a another version where you just give it one parameter. What this does is pull in everything from the start index to the end of the string.
        System.out.println(sentence.substring(8));

        //
        int indexOfSentence = sentence.indexOf("sentence");
        System.out.println(indexOfSentence); //prints out index value 10

        String apple = "apple";
        String zebra = "zebra";
        System.out.println(apple.compareTo(zebra));
        System.out.println(zebra.compareTo(apple));
        System.out.println(apple.compareTo(apple));



    }
}
