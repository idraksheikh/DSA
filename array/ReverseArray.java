package array;

import java.util.Scanner;

public class ReverseArray {
    static int[] reverseTheArray(int[] arra,int start,int end){
        
        
        while(start<end){
            int temp=arra[start];
            arra[start]=arra[end];
            arra[end]=temp;
            start++;
            end--;
        }
        return arra;
        
    }
    public static void main(String[] args) {
       
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        
        int[] revArr=reverseTheArray(arr,0,(n-1));
        for(int i=0;i<revArr.length;i++){
            System.out.print(revArr[i]+" ");
        }
        scan.close();
    }
}
