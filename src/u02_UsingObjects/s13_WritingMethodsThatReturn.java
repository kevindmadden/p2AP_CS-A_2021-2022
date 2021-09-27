package u02_UsingObjects;

public class s13_WritingMethodsThatReturn {
    public static void main(String[] args){
        int i = 0;
        while(i < 100){
            i++;
            int num = getRandomInt(100);
            System.out.println(num);

            boolean isRaining = isItRaining();
            System.out.println(isRaining);
        }

    }

    public static int getRandomInt(int max){
        int num = (int)(Math.random()*max);
        return num;
    }

    public static boolean isItRaining(){
        int num = getRandomInt(2);
        boolean isRaining;
        if(num==0){
            isRaining = true;
        }else{
            isRaining = false;
        }
        return isRaining;
    }
}
