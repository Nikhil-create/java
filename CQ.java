public class CQ {
    int arr[]=null;
    int capacity=3;

    int front=0;
    int rear=-1;
    int size=0;



    public CQ(){
        this.arr=new int[capacity];
    }

    public CQ(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
    }

    public void enq(int data){
        if(size==capacity){
            System.out.println("<overflow>");
        }
        rear+=1;
        if(rear==capacity){
            rear=0;
        }
        arr[rear]=data;
        size++;
        System.out.println("Inserted>"+data);
    }

    public void size(){
        System.out.println("Size>"+size);
    }

    public void deq(){
        if(size==0){
            System.out.println("<empty>");
        }
        System.out.println("Data>"+arr[front]);
        front+=1;
        size=size-1;
    }


    public static void main(String argv[]){
       CQ q=new CQ();
       q.enq(1);
       q.enq(2);
       q.enq(3);
       q.size();
       q.deq();
    }
}

