package study.array;

public class Example2 {

    public static void main(String[] args) {
        int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7, 4, 5};
        System.out.println(maxArea1(a));
        System.out.println(maxArea2(a));
    }


    //给定n个非负整数ai，分别代表坐标（i，ai）,在坐标轴上画（i，0）到（i，ai）的柱子，求给定序列可以容纳的最多的水
    //提示：一维数组的坐标变换

    //两边的柱子分别往中间收敛
    static int maxArea1(int[] a) {
        int max = 0;
        for (int i = 0, j = a.length - 1; i < j;) {
            int minHeigh = a[i] < a[j] ? a[i++] : a[j--];
            max = Math.max(max, (j - i + 1) * minHeigh);
        }
        return max;
    }

    //枚举所有情况
    static int maxArea2(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int area = (j - i) * Math.min(a[i], a[j]);
                if (max < area) {
                    max = area;
                }
            }
        }
        return max;
    }


}
