import java.io.*;
import java.util.*;
public class Question4{
	 public static int subArrayCount(ArrayList < Integer > arr, int k){
	 	int totalCount=0;
	 	for(int i=0;i<arr.size();i++){
	 		int sum=0;
	 		
	 		for(int j=i;j<arr.size();j++){
	 			sum+=arr.get(j);
	 			
	 			if(sum%k==0){
	 				totalCount+=1;
	 			}
	 			
	 			
	 			
	 		}
	 	}
	 	return totalCount;
	 }
	public static void main(String[] args) throws IOException{
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the Number to divide and size of the array");
		String[] input=rd.readLine().split(" ");
		int k=Integer.parseInt(input[0]),n=Integer.parseInt(input[1]);
		System.out.println("Please enter the values an array");
		String[] inputArray=rd.readLine().split(" ");
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++){
			arr.add(Integer.parseInt(inputArray[i]));
		}
		System.out.println(subArrayCount(arr, k));
	}
}