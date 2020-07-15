
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int i=0,j=0,t=0;
		for(i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<num;i++) {
			for(j=i+1;j<num;j++) {
				if(arr[i]>arr[j]) {
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}

