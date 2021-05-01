package RunningSumof1dArray;

public class runningSum {
    public static int[] runningSum(int[] nums){
        int[] temp  = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            int s = 0;
            for(int j = 0; j<=i; j++){
               s+=nums[j];
            }
            temp[i]= s;
        }
        return temp;
    }

    //因为新旧数组的大小相同， 所以也有可以不用重新定义数组的方式
    public static int[] runningSum2(int[] nums){
        int n = nums.length;
        for(int i =1; i<n; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
