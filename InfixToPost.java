import java.util.Stack;

public class InfixToPost {

    static int pre(char op){
        switch(op){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String post(String exp){
        int i=0;
        char c;
        String result=new String("");
        Stack<Character> stack=new Stack<>();
        for(i=0;i<exp.length();i++){
            c=exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result+=c;
            }else if(c=='('){
                stack.push(c);
            }else if(c==')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    result+=stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression";
                else
                    stack.pop();
            } else
            {
                while (!stack.isEmpty() && pre(c) <= pre(stack.peek())){
                    if(stack.peek() == '(')
                        return "Invalid Expression";
                    result += stack.pop();
                }
                stack.push(c);
            }

    }
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }
    public static void main(String argv[]){
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(post(exp));

    }
}
