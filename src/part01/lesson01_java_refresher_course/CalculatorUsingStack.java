package part01.lesson01_java_refresher_course;

import java.util.Stack;

public class CalculatorUsingStack {
    public static int calculate(String s) {
        int len;
        if (s == null || (len = s.length()) == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) || i == len - 1) {
                if (sign == '-') {
                    stack.push(-num);
                }
                if (sign == '+') {
                    stack.push(num);
                }
                if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }

        int ans = 0;
        for (int i : stack) {
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Hello udacityNanodegree");
        System.out.println(calculate("1*8+5-13"));
        System.out.println(calculate("2+5*30-12"));
        System.out.println(calculate("-8*5-2"));
    }
}
