package study.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        int[] arr = {-1, -1, -4, 5, 2, 7, 4};
        System.out.println(threeSum1(arr));
        System.out.println(threeSum2(arr));
    }

    //给定一个包含n个整数的数组nums，判断nums中是否存在三个数，使其和为0；求出所有满足条件且不重复的三元组

    static List<List<Integer>> threeSum1(int[] nums) {
        //左右下标往中间推进（排序 + 双指针）
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        //1、排序
        sort(nums);
        //2、指针 k i j
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) break;//当nums[k]>0时，其余数字都大于0，不可能满足条件
            if (k > 0 && nums[k] == nums[k - 1]) continue;//两数相等情况完全一样，就不用再考虑
            for (int i = k + 1, j = nums.length - 1; i < j; ) {
                int result = nums[k] + nums[i] + nums[j];
                if (result == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    list.add(k);
                    results.add(list);
                    i++;
                    j--;
                    while (i < j && nums[j] == nums[j + 1]) j--;//排除重复情况
                    while (i < j && nums[i] == nums[i - 1]) i++;//排除重复情况
                } else if (result > 0) {
                    j--;
                    while (i < j && nums[j] == nums[j + 1]) j--;//排除重复情况
                } else {
                    i++;
                    while (i < j && nums[i] == nums[i - 1]) i++;//排除重复情况
                }
            }
        }

        return results;
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static List<List<Integer>> threeSum2(int[] nums) {
        //暴力求解(未排除重复情况)
        //转化： a + b = -c
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] + nums[k] == -nums[i]) {
                        List<Integer> result = new ArrayList<>();
                        result.add(j);
                        result.add(k);
                        result.add(i);
                        results.add(result);
                    }
                }
            }
        }

        return results;
    }

}
