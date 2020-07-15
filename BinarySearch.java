import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the number you want to search");
		int search=sc.nextInt();
		System.out.println("Sorted Array: ");
		for(i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		int low=0;//0
		int high=num-1;//9
		int mid=(low+high)/2;
		while(low<=high) {
			if(arr[mid]<search) {
				low=mid+1;
			}else if(arr[mid]==search) {
				System.out.println(arr[mid]+" is found in index: "+mid);
				break;
			}else {
				high=mid-1;
			}
			mid=(low+high)/2;
			
		}
		
		if(low>high) {
			System.out.println("Not Found");
		}

	}

}
