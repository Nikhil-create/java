import java.util.*;
public class InsertionSort {
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

        for(i=1;i<size;i++){
            t=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>t) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j + 1] = t;

        }
    }
}
