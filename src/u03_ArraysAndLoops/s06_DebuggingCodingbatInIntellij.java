package u03_ArraysAndLoops;

public class s06_DebuggingCodingbatInIntellij {
    public static void main(String[] args){
        int[] arr = {2, 1, 3, 5};
        modThree(arr);
    }


    public static boolean modThree(int[] nums) {
        if(nums.length <= 2){
            return false;
        }

        for(int i=0; i<nums.length-2; i++){
            int isEven1 = nums[i]%2;
            int isEven2 = nums[i+1]%2;
            int isEven3 = nums[i+2]%2;
            if(isEven1==0 && isEven2==0 && isEven3==0){
                return true;
            }
            if(isEven1==1 && isEven2==1 && isEven3==1){
                return true;
            }

        }


        return false;
    }




}
