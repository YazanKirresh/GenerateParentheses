/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

To resolve this we have to follow these steps:

 */

 import java.util.Stack;
 public class App {
     class Solution {
        static void PrintStack(Stack<Character> s){
            // If stack is empty 
            if (s.empty()) 
                return; 
               
            // Extract top of the stack 
            int x = s.peek();                
            // Pop the top element 
            s.pop();                
            // Print the current top 
            // of the stack i.e., x 
            System.out.print(x + " ");               
            // Proceed to print 
            // remaining stack 
            PrintStack(s);                
            // Push the element back
        }
        public static Stack<Character> generateParenthesis(int n) {
            if (n <= 0) {
                System.out.println("Invalid input");
            }
            Stack<Character> stack = new Stack<>();
            stack.push('(');
            for (int i = 0 ; i < n-1; i++){
                stack.push('(');
            }
            for (int i = 0 ; i < n; i++){
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
 