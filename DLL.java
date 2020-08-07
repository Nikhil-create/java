public class DLL {
    public class Node{
        int data;
        Node next;
        Node prev;
            public Node(int data){
                this.data=data;
            }
    }

    public Node head;

    public void push(int data){
        Node temp=new Node(data);
        temp.next=head;
        temp.prev=null;

        if(head!=null){
            head.prev=temp;
        }

        head=temp;
    }

    public void append(int data){
        Node temp=new Node(data);
        Node last=head;
        temp.next=null;
        if(head==null){
            temp.prev=null;
            head=temp;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }

        last.next=temp;
        temp.prev=last;
    }

    public void delBeg(){
        Node del=head;
        if(head==null ||del==null){
            return;
        }

        if(head==del){
            head=del.next;
        }

        if(del.next!=null){
            del.next.prev=del.prev;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        return;
    }

    public void display(){
        Node current=head;
        Node last=head;
        System.out.println("List");
        while(current!=null){
            System.out.println(current.data);
            last=current;
            current=current.next;

        }
        System.out.println("");
        System.out.println("Reversed List");
        while(last!=null){
            System.out.println(last.data);
            last=last.prev;
        }

    }


    public static void main(String argv[]){
            DLL ob=new DLL();
            ob.append(3);
            ob.push(2);
            ob.push(5);
            ob.push(11);
            ob.push(9);
            ob.display();
            ob.delBeg();
            ob.display();
    }
}
