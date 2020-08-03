public class CLL {
    public class Node{
        int data;
        Node next;
            public Node(int data){
                this.data=data;
            }
    }

    public Node head=null;
    public Node tail=null;

    public void InsLast(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else{
            tail.next=temp;
        }
        tail=temp;
        tail.next=head;
    }

    public void InsBeg(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
            temp.next=head;
        }else{
            temp.next=head;
            head=temp;
            tail.next=head;
        }
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("list is empty");
        }
        else {
            do{
                //Prints each node by incrementing pointer.
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }

    }

    public void delBeg(){
        if(head==null){
            return;
        }else{
            if(head!=tail){
                head=head.next;
                tail.next=head;
            }else{
                head=null;
                tail=null;
            }
        }
    }

    public void delLast() {
        if (head == null) {
            return;
        } else {
            if (head != tail) {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = head;
            } else {
                head=null;
                tail=null;

            }
        }
    }
    
    public static void main(String argv[]){
        CLL ob=new CLL();
        ob.InsBeg(1);
        ob.InsBeg(2);
        ob.InsLast(3);
        ob.InsLast(4);
        ob.display();
        ob.delBeg();
        ob.display();
        ob.delLast();
        ob.display();

    }
}
