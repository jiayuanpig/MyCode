package study.stack;

import java.util.LinkedList;

public class Example2 {

    //设计一个支持push，pop，top操作的栈，并能实现常数级检索最小元素。

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(-2);
        minStack.push(3);

        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }



    private static class MinStack{
        //实现相关功能，保证先入后出
        //思路：两个栈，一个保证先入后出，一个保证找到最小元素
        private LinkedList<Integer> stack = new LinkedList();
        private LinkedList<Integer> minStack = new LinkedList<>();
        private int min;

        MinStack(){

        }

        void push(int x){
            stack.push(x);
            if (minStack.isEmpty()){
                min = x;
            }else{
                min = Math.min(x,min);
            }
            minStack.push(min);
        }
        void pop(){
            stack.pop();
            minStack.pop();
            min = minStack.getFirst();
        }
        int top(){
            return stack.getFirst();
        }

        int getMin(){
            return min;
        }
    }




}
