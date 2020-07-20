import java.util.*;
public class LLSumAvg {

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
			Node last =head;
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
			Node last;
			last=slast.next;
			last=null;
			slast.next=null;
		}
	}
	
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("LIST IS EMPTY");
			return;
		}else {
			System.out.println("-----------Entered data: ------------");
			while(current!=null) {
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
	}
	
	public void sumavg() {
		Node current=head;
		int sum=0,c=1,avg=0;
		if(head==null) {
			System.out.println("LIST IS EMPTY");
			return;
		}else {
			while(current!=null) {
				sum+=current.data;
				c++;
				current=current.next;
			}
			avg=sum/c;
			System.out.println("---------Sum: "+sum+" Average: "+avg+" ----------");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LLSumAvg ob=new LLSumAvg();
		String s="yes";
		while(s!="no") {
		System.out.println("Do you want to enter the data type yes/no: ");
		s=sc.nextLine();
		if(s.equals("yes")) {
		System.out.println("Enter the data(Integer)");
		int data=sc.nextInt();
		ob.InsBeg(data);
		}
		if(s.equals("no")) {
			ob.display();
			ob.sumavg();
		}
		
		}
		

	}

}
