//--------------------------------------------------------------//
//                 CS 2400 - Stacks Example                     //
//--------------------------------------------------------------//
//package cpp.alex;

//import built-in javascript stack utility
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        //this can easily be changed to grab the tokens from the command line arguments if wanted...
        //String[] errorTokens = new String[] { "2", "1", "+", "3", "*", "50" };

        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        System.out.println("The calculated output is [" + evaluateRPN(tokens) + "]");
    }

    //--------------------------------------------------------------//
    //    evaluateRPN() *Look here, this function does the work*    //
    //--------------------------------------------------------------//
    public static int evaluateRPN(String[] tokens)
    {
        int calculatedValue = 0;
        String validOperators = "+-*/";

        //create an empty stack for the RPN calculator
        Stack<String> stack = new Stack<String>();

        //iterate through the RPN operands
        for (String t : tokens)
        {
            if (!validOperators.contains(t))
            {
                //add code here...
            }
            else
            {
                int a = Integer.valueOf(//add code here);
                int b = Integer.valueOf(//add code here);
                switch (t) {
                    case "+":
                        //add code here
                        break;
                    case "-":
                        //add code here
                        break;
                    case "*":
                        //add code here
                        break;
                    case "/":
                        //add code here
                        break;
                }
            }
        }

        calculatedValue = Integer.valueOf(//add code here. Hint: should only be 1 item on stack);
        return calculatedValue;
    }
}
