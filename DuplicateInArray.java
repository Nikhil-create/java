import java.util.*;

public class DuplicateInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<num;i++) {
			if(arr[Math.abs(arr[i])]>=0)
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i])+" ");
		}


	}

}
