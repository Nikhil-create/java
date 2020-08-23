import java.util.*;
public class SelectionSort {
    public static void main(String argv[]){
        Scanner sc=new Scanner(System.in);
        int i,j,t;
        int size=sc.nextInt();
        int[] arr=new int[size];

        for(i=0;i<size;i++)
            arr[i]=sc.nextInt();

        System.out.println("Given array: ");

        for(i=0;i<size;i++)
            System.out.print(arr[i]+" ");

        System.out.println("Sorted Array: ");

        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (j=i+1;j<size;j++)
                if (arr[j]<arr[min])
                    min=j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }
}
