import java.util.*;
public class EvalPost {
    static int evalpost(String exp){
        Stack<Integer> stack=new Stack<>();
        int i=0;
        for(i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(Character.isDigit(c))
                stack.push(c - '0');

            else
            {
                int a=stack.pop();
                int b=stack.pop();

                switch(c)
                {
                    case '+':
                        stack.push(a+b);
                        break;

                    case '-':
                        stack.push(a-b);
                        break;

                    case '/':
                        stack.push(a/b);
                        break;

                    case '*':
                        stack.push(a*b);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] argv){
        String exp="231*+9-";
        System.out.println(evalpost(exp));
    }
}
