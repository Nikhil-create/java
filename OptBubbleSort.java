import java.util.*;
public class OptBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int i=0,j=0,temp=0;
		for(i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		boolean swap;
		for(i=0;i<num;i++) {
			swap=false;
			for(j=0;j<num-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap=true;
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			if(!swap) {
			   break;
			}
		}
		for(i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
