import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class LeftRotation {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] nd = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nd[0]);

	        int d = Integer.parseInt(nd[1]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        scanner.close();
	        for(int i=0;i<a.length-1;i++){
	            int t=0, j=0;
	            t=a[0];
	            for( j=0;j<a.length-1;j++){
	                a[j]=a[j+1];
	            }
	            a[j]=t;
	        }

	        for(int i=0;i<a.length;i++){
	            System.out.print(a[i]+" ");
	        }

	}

}
