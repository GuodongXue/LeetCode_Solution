package RunningSumof1dArray;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        //int result[] = runningSum.runningSum(nums);
        //System.out.println(Arrays.toString(result));
        int result[] = runningSum.runningSum2(nums);
        System.out.println(Arrays.toString(result));
    }
}
