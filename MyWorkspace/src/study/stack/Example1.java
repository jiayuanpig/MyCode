package study.stack;

import java.util.*;

class Example1 {

    //给定一个只包括‘(’,‘)’,‘[’,‘]’,‘{’,‘}’各类括号的字符串，判断字符串是否有效

    public static void main(String[] args) {
        String testStr = "{}()[]";
        System.out.println(isValid(testStr));

        String testStr2 = "{}({)[]";
        System.out.println(isValid(testStr2));

        String testStr3 = "{}()[]]";
        System.out.println(isValid(testStr3));
    }


    static boolean isValid(String str) {
        //使用栈来存储左括号，当遇到匹配的右括号时，将左括号弹出，当最后栈为空，说明字符串有效

        //存储匹配模式
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        //字符串为空返回true
        if (str == null || str.length() == 0) return true;

        LinkedList<Character> stack = new LinkedList<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                stack.add(c);
            } else if (stack.isEmpty() || map.get(stack.removeLast()) != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }


}
