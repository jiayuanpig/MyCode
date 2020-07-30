package LeedCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Test {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {5, 6};
//        System.out.println(findMedianSortedArrays(num1, num2));

    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //二分法取中位数
        int len1 = nums1.length;
        int len2 = nums2.length;

        //将中位数两种情况转为一种情况
        /*
         * 一共 7个数: (7+1)/2=4 (7+2)/2=4
         * 一共6个数:  (6+1)/2=3 (6+2)/2=4
         * */
        int left = (len1 + len2 + 1) / 2;
        int right = (len1 + len2 + 2) / 2;

        return (getKth(nums1, 0, len1 - 1, nums2, 0, len2 - 1, left) + getKth(nums1, 0, len1 - 1, nums2, 0, len2 - 1, right)) * 0.5;
    }

    public int getKth(int[] num1, int start1, int end1, int[] num2, int start2, int end2, int k) {
        //特殊情况处理：当一方数组长度不够，可以直接返回对应的数
        //技巧：将num1变为最短的数组,保证只要数组为空，则num1必先空
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1 > len2) {
            return getKth(num2, start2, end2, num1, start1, end1, k);
        }
        if (len1 == 0) {
            return num2[start2 + k - 1];
        }

        //判出条件
        if (k == 1) {
            return Math.min(num1[start1], num2[start2]);
        }

        //业务处理(注意防止长度不够)
        int k1 = start1 + Math.min(len1, k / 2) - 1;//k1为比较数的位置
        int k2 = start2 + Math.min(len2, k / 2) - 1;
        if (num1[k1] < num2[k2]) {//剔除num1的部分
            return getKth(num1, k1 + 1, end1, num2, start2, end2, k - (k1 - start1 + 1));
        } else {
            return getKth(num1, start1, end1, num2, k2 + 1, end2, k - (k2 - start2 + 1));
        }

    }


}
