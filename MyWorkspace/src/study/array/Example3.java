package study.array;

public class Example3 {

    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }


    //爬楼梯：一共有n个台阶，每次只能爬一个或两个台阶，求一共有多少爬法

    static int climbStairs(int n) {
        //斐波那契数列(fibonacci):f(n) = f(n-1)+f(n-2)
        int num = 0;
        num = fib(n);
        return num;
    }

    //递归fib
    static int fib(int n) {
        if (n <= 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    //非递归fib
    static int fib2(int n) {
        int i = 1;
        int j = 2;
        if (n <= 2) {
            return n;
        } else {
            for (int k = 3; k <= n; k++) {
                int target = i + j;
                i = j;
                j = target;
            }
        }
        return j;
    }

}
