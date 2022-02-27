import java.util.*;
import java.io.*;
public class Question3{
	//solution 1
	// int[] pro=new int[arr.length];
 //    		for(int i=0;i<arr.length;i++){
 //        		pro[i]=1;
        	   
	// 		}
 //    	for(int i=0;i<pro.length;i++){
 //    		for(int j=0;j<arr.length;j++){
 //    			if(i==j){
 //    				continue;
 //    			}
 //    			pro[i]=pro[i]*arr[j];
 //    		}	
 //    	}
 //    	return pro;
	public static int[] getProductArrayExceptSelf(int[] arr) {
    	//solution 2
    	int[] pro=new int[arr.length];
    	int pro1=1;
    	int pro0=0;
    	int flag=0;
    	int count=0;
    	for(int i=0;i<arr.length;i++){
    		
    			if(arr[i]==0) {
    				flag=1;
    				count++;
    				continue;
    			}
    			else{pro1=pro1*arr[i];}
    		
    		}	
    	for(int i=0;i<pro.length;i++){
    		
    			if(flag==1){
    				if(count>1){
    					pro[i]=pro0;
    				}
    				else{
	    				if(arr[i]==0){
	    					pro[i]=pro1;
	    				}
	    				else{
	    					pro[i]=pro0;
	    				}
    				}
    			}
    			else pro[i]=(pro1/arr[i]);
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