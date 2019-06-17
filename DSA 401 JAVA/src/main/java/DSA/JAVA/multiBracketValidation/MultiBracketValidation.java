package DSA.JAVA.multiBracketValidation;

import DSA.JAVA.stacksandqueues.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        char current;
        Stack leftBracket = new Stack();
        for(int i = 0; i < input.length(); i++){
            current = input.charAt(i);
            if(current == '(' || current == '{' || current == '['){
                leftBracket.push(current);
            } else if( current == ')'){
                if(leftBracket.peek() == null || (char) leftBracket.pop() != '('){
                    return false;
                }
            } else if( current == '}'){
                if(leftBracket.peek() == null || (char) leftBracket.pop() != '{'){
                    return false;
                }
            } else if( current == ']'){
                if(leftBracket.peek() == null || (char) leftBracket.pop() != '['){
                    return false;
                }
            }
        }
        return leftBracket.peek() == null ? true : false;
    }


}
