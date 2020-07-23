package study.array;

import java.util.List;

public class Example5 {

    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int[] result = twoSum(arr,3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    //给定一个包含n个整数的数组nums和目标值target，判断nums中是否存在两个数，使其和为target；求出满足条件的结果

    static int[] twoSum(int[] nums,int target){
        //暴力遍历
        int[] result = new int[2];
        for (int i = 0;i < nums.length;i++){
            for (int j = i + 1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }





}
