import java.util.*;
import java.io.*;
public class Question3{
	public static int[] getProductArrayExceptSelf(int[] arr) {
    	int[] pro=new int[arr.length];
    		for(int i=0;i<arr.length;i++){
        		pro[i]=1;
        	   
			}
    	for(int i=0;i<pro.length;i++){
    		for(int j=0;j<arr.length;j++){
    			if(i==j){
    				continue;
    			}
    			pro[i]=pro[i]*arr[j];
    		}	
    	}
    	return pro;
        
    }
	public static void main(String[] args) throws IOException {
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array.");
		int n=Integer.parseInt(rd.readLine());
		int[] arra=new int[n];


		System.out.println("Enter the value in an array.");
		String[] strd=rd.readLine().split(" ");        	
        	for(int i=0;i<n;i++){
        		arra[i]=Integer.parseInt(strd[i]);
        	   
			}

		int[] pro1=getProductArrayExceptSelf(arra);
		for(int i=0;i<n;i++){
        		System.out.print(pro1[i]+" ");
        	   
			}

	}
}