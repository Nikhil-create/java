import java.util.*;
public class WithoutBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int i=0,j=0,t=0;
		for(i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
