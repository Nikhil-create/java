import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int i=0,present=0;
		for(i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number you want to search");
		int search=sc.nextInt();
		for(i=0;i<num;i++) {
			if(arr[i]==search) {
				present++;
				System.out.println(search+" is present in index:"+i);
			}
		}
		if(present==0) {
			System.out.println("Not Found");
		}
	}

}
