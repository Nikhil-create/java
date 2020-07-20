
public class Linkedlist {
	
	public class Node{
		int data;
		Node next;
			public Node(int data) {
				this.data=data;
				this.next=null;
			}
	}
	
	public Node head=null;
	
	public void InsBeg(int data) {
		Node temp=new Node(data);
		if(head==null) {
			head=temp;
		}else {
			temp.next=head;
			head=temp;
		}
	}
	
	public void DelBeg() {
		if(head==null) {
			System.out.println("LIST IS EMPTY");
		}else {
			Node temp=head;
			head=head.next;
			temp=null;
			
		}
	}
	
	public void InsLast(int data) {
		Node temp=new Node(data);
		if(head==null) {
			head=temp;
		}else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=temp;
			
		}
	}
	
	public void DelLast() {
		if(head==null) {
			System.out.println("LIST IS EMPTY");
		}else {
			Node slast=head;
			while(slast.next.next!=null) {
				slast=slast.next;
			}
			Node last=slast.next;
			slast.next=null;
			last=null;
		}
	}
	
    public void display() {
    	Node current=head;
    	if(head==null) {
    		System.out.println("LIST IS EMPTY");
    		return;
    	}else {
    		while(current!=null) {
    			System.out.print(current.data+" ");
    			current=current.next;
    		}
    	}
    	System.out.println();
    	
    }
	
	
	public static void main(String[] args) {
		
		Linkedlist ob=new Linkedlist();
		ob.InsBeg(25);
		ob.InsBeg(26);
		ob.InsBeg(27);
		
		ob.InsLast(28);
		ob.InsLast(30);
		
		ob.InsBeg(31);
		ob.InsLast(22);
		
		ob.display();
		
		ob.DelBeg();
		ob.DelLast();
		
		ob.display();

	}

}
