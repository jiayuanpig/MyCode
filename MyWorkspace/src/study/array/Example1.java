package study.array;


public class Example1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 0, 2, 0, 5};
        long timeStart = System.currentTimeMillis();
        moveZeros1(arr);
        printArr(arr);

        int[] arr2 = {1, 3, 0, 0, 1, 0, 7, 5, 0, 2, 0, 5};
        moveZeros1(arr2);
        printArr(arr2);

    }

    //给定一个数组nums，编写一个函数，将所有的0移动到数组末尾，其他元素顺序保证相对不变
    //（要求：必须在原数组基础上操作，不能拷贝额外数组）
    static void moveZeros1(int[] nums) {
        //思路：记录下一个非零元素应在的位置，将非零元素移到对应位置
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index != i) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
    }

    static void moveZeros2(int[] nums) {
        //思路：将非零元素拷贝到另一个数组
        int[] newArr = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArr[index++] = nums[i];
            }
        }
        nums = newArr;
    }


    static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }


}
