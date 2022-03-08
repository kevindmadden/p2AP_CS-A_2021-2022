package u06_ArrayList;

import java.util.ArrayList;

//https://visualgo.net/en/sorting?slide=1-1 - Bubble Sort Visualization
public class s03_BinarySearchTemplate {

    public static void main(String[] args){
        ArrayList<Integer> list = generateRandomIntegerArrayList();
        printArrayListWithIndexNums(list);

        


        //Example: Where does 84 appear in this list?
        /*
        [10, 10, 11, 11, 11, 12, 12, 13, 14, 15, 16, 16, 16, 16, 17, 18, 18, 19, 19, 20, 20, 20, 21, 22, 23, 24, 24, 24, 25, 26, 27, 27, 27, 27, 28, 29, 30, 31, 31, 31, 31, 32, 32, 33, 33, 34, 35, 35, 35, 35, 36, 36, 37, 38, 38, 39, 40, 40, 41, 41, 42, 42, 43, 44, 44, 45, 46, 47, 48, 48, 49, 49, 49, 49, 50, 50, 51, 51, 51, 52, 53, 54, 54, 55, 55, 56, 56, 56, 56, 56, 57, 57, 58, 58, 59, 59, 60, 61, 62, 63, 64, 64, 64, 64, 65, 66, 66, 67, 67, 68, 69, 69, 69, 70, 71, 72, 72, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 85, 86, 87, 87, 88, 89, 90, 90, 90, 90, 90, 91, 92, 93, 94, 95, 96, 97, 97, 97, 98, 98, 99]
          0,  1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,
        list.size()/2 => 154/2 => 77 => 77 is the middle index #
        then look at what number is at the middle index: list.get(77) => 51
        Is 84 > 51 or 84 == 51 or 84 < 51
        Since 84 is bigger than 51, then we know that the number 84 is somewhere on the right half

        We know that 84 is somewhere between index 77 and index 153
        ^^^Repeat above process^^^

        We find the middle index:
        (77+153)/2 => 115
        So essentially, we have this situation:
        77 .....left half.... 115 ......right half..... 153
        The number at index 115 is at list.get(115) => 72
        Is 84 > 72 or 84 == 72 or 84 < 72

        We know that 84 is somewhere between index 115 and 153.
        ^^^Repeat above process^^^

        So you are going to want to have variables for th left boundary and the right boundary.
        You repeat this process until you find a situation where the number you are looking for is the same as the middle number.

        72, 72, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 85, 86, 87, 87, 88, 89, 90, 90, 90, 90, 90, 91, 92, 93, 94, 95, 96, 97, 97, 97, 98, 98, 99]
        115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,

        72, 72, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 85, 86, 87,
        115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,





         */

    }

    public static ArrayList<Integer> generateRandomIntegerArrayList(){
        //Constructs an array with the numbers 10 through 99 in order.
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 10; i<100; i++){
            do{
                list.add(i);
            }while(Math.random()>0.6);
        }
        return list;
    }

    public static void printArrayListWithIndexNums(ArrayList<Integer> list){
        System.out.println(list.toString());
        System.out.print("  ");
        for(int i=0; i<list.size(); i++){
            if(i<9){
                System.out.print(i+",  ");
            }else if(i<=98){
                System.out.print(i+", ");
            }else{
                System.out.print(i+",");
            }
        }
        System.out.println();
    }



}
