public class LinkedList11 {

    public class Node{
        int data;
        Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
    }

    public Node head=null;

    public void insbeg(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else{

            temp.next=head;
            head=temp;
        }
        System.out.println(temp.data+" is inserted from beginning");
    }

    public void delbeg(){
        if(head==null){
            System.out.println("list is empty");
        }else{
            Node temp=head;
            System.out.println(temp.data+" is deleted from beginning");
            head=head.next;
            temp=null;
        }
    }

    public void inslast(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else{
            Node last=head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=temp;
            System.out.println(temp.data+" is inserted from last");
        }
    }

    public void dellast(){
        if(head==null){
            System.out.println("list is empty");
        }else{
            Node slast=head;
            while(slast.next.next!=null){
                slast=slast.next;
            }
            Node last=slast;
            Node ll=slast.next;
            slast.next=null;
            System.out.println(ll.data+" is deleted from last");
            last=null;
            ll=null;

        }
    }

    public void screen(){
        Node current=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }else{
            System.out.println("your list is: ");
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
    }

    public void addbet(int index,int data){
        Node temp=new Node(data);
        int i=0;
        if(head==null){
            head=temp;
        }else{
            Node bet=head;
            while(i!=index-1){
                bet=bet.next;
                i++;
            }
            temp.next=bet.next;
            bet.next=temp;
            System.out.println(temp.data+" is inserted in index "+index);
        }
    }

/*    public void delbet(int index){
        int i=0;
        if(head==null){
            System.out.println("list is empty");
        }else{
            Node bet=head;
            while(i!=index-1){
                bet=bet.next;
                i++;
            }
            Node temp=bet.next;
        }
    }
   */

    public void findloop(){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
System.out.println("Loop found");
            }
        }
        System.out.println("Loop not found");
    }

    void reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        head=node;
    }

    public static void main(String argv[]){
        LinkedList11 ob=new LinkedList11();
        ob.insbeg(1);
        ob.insbeg(2);
        ob.insbeg(3);
        ob.inslast(4);
        ob.inslast(5);

        ob.screen();

        ob.insbeg(6);
        ob.inslast(7);

        ob.screen();

        ob.dellast();
        ob.delbeg();

        ob.screen();


        ob.screen();

        ob.findloop();

ob.reverse(ob.head);
        ob.screen();


    }
}
