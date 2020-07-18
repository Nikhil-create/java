import java.util.*;
public class DupUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Map<Integer,Integer> map=new HashMap<>();
		for(i=0;i<size;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],1);
			}else {
				map.put(arr[i],map.get(arr[i])+1);
			}
			
		}
		for(Integer j:map.keySet()) {
			if(map.get(j)>1) {
				System.out.print(j+" ");
			}
		}
		
		
		

	}

}
