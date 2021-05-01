package Sign_of_the_Product_of_an_Array;

public class signFunc {

    /*public static int signFunc(int[] nums){
        int product = 1;
        for(int i = 0; i<nums.length; i++){
            product*=nums[i];
        }
        if(product>0){
            return 1;
        }else if(product<0){
            return -1;
        }else{
            return 0;
        }
    }*/
    //这种暴力揭发当数字多的时候会溢出， 导致错误
    public static int signFunc(int[] nums){
        int odd = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                return 0;
            }else{
                if(nums[i]<0){
                    odd+=1;
                }
            }
        }
        if(odd%2==0){
            return 1;
        }else{
            return -1;
        }
    }
    public static int signFunc2(int[] nums){
        int ans =1;
        for (int num: nums){
            if(num<0){
                ans = -ans;
            }else if(num == 0){
                ans = 0;
                break;
            }
        }
        return ans;
    }


}
