public class StackPractice {

    int arr[];
    int c;
    int top=-1;


    public StackPractice(int size){
        arr =new int[size];
        c=size;
    }

    public void push(int data){
        if(isfull()){
            System.out.println("Stack Overflow");
            return;
        }else{
            arr[++top]=data;
            System.out.println(data+" is inserted");
        }
    }

    public void pop(){
        if(isempty()){
            System.out.println("Stack underflow");
            return;
        }else{
            System.out.println(arr[top]+" is poped");
            top--;
        }
    }

    public int peak(){

        System.out.println(arr[top]);
        return arr[top];
    }

    public boolean isfull(){
        return top==c;
    }

    public boolean isempty(){
        return top==-1;
    }

    public static void main(String argv[]){
        StackPractice ob=new StackPractice(100);
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);
        ob.peak();

        ob.pop();
        ob.peak();


    }
}
