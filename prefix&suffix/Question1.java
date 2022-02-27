import java.util.*;
import java.io.*;


//Solution 1
// List<Integer> result=new ArrayList<>();
// 			for(List<Long> query: queries){
// 				List<Integer> b=new ArrayList<>();
				
// 				while(true){
// 					for(int i=0;i<n;i++){
// 						b.add(arr[i]);
// 					}
// 					if(b.size()>=query.get(1)){
// 						break;
// 					}
					
// 				}
// 				int sum=0;
// 				for(Long j=query.get(0);j<=query.get(1);j++){
// 					long l=j;
// 					int s=(int)l - 1;
// 					sum+=b.get(s);
// 				}
					
// 				result.add(sum);

// 			}
			
// 			return result;

// 	}
public class Question1{
	public static List<Integer> sumInRange(int[] arr, int n, List<List<Long>> queries, int q){
		
			//Solution 2
			List<Integer> result=new ArrayList<>();
			int mod=(int) 1e9+7;
			for(List<Long> query: queries){
					
				int sum=0;
				for(Long j=query.get(0);j<=query.get(1);j++){
					long l=j;
					int s=(int)l - 1;
					sum+=arr[(s%n)]%mod;
				}
					
				result.add(sum);

			}
			
			return result;

	}

	public static void main(String[] args) throws IOException {		
		BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array.");
		int n=Integer.parseInt(rd.readLine());
		int[] arra=new int[n];


		System.out.println("Enter the value in an array.");
		String[] strd=rd.readLine().split(" ");        	
        	for(int i=0;i<n;i++){
        		arra[i]=Integer.parseInt(strd[i]);
        	   
			}
		System.out.println("Enter the no. of queries.");
		int q=Integer.parseInt(rd.readLine());
		List<List<Long>> qur= new ArrayList<>();
		for(int i=0;i<q;i++){
        		List<Long> list=new ArrayList<>();
        		System.out.println("Enter querylist "+(i+1)+" .");
				String[] strd1=rd.readLine().split(" ");        	
        		for(int j=0;j<2;j++){
        			
        			list.add(Long.parseLong(strd1[j]));
				}
					
				qur.add(list);
		}
			
		List<Integer> result=new ArrayList<>();
		result=sumInRange(arra,n,qur,q);
		System.out.println(result); 

	}
	
}