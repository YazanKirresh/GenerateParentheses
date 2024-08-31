/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

 */

 import java.util.Stack;
 public class App {
     class Solution {
        static void PrintStack(Stack<Character> s){
            if (s.empty())
                return;
            char x = s.pop();
            s.pop();
            PrintStack(s);
            s.push(x);
        }
        public static Stack<Character> generateParenthesis(int n) {
            if (n <= 0) {
                System.out.println("Invalid input");
            }
            Stack<Character> stack = new Stack<>();
            stack.push('(');
            for (int i = 0 ; i < n/2-1; i++){
                stack.push('(');
            }
            for (int i = 0 ; i < n/2; i++){
                stack.push(')');
            }    
            PrintStack(stack) ;
            return stack;
        }
        public static void main(String[] args) throws Exception {
            int AmountOFParentheses=2;
            System.out.println(AmountOFParentheses);
            generateParenthesis(AmountOFParentheses);
        }
 }
}
 