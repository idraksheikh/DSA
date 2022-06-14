package array;

import java.util.Scanner;

public class RotateArray extends ReverseArray{
    static int[] rotateTheArray(int[] arra,int k){
        arra=reverseTheArray(arra, 0, (arra.length-1));
        arra=reverseTheArray(arra, 0, k-1);
        arra=reverseTheArray(arra, k, (arra.length-1));

        return arra;
        
    }
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
     
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int[] tempArr=new int[n];
        for(int i=0;i<n;i++){
            tempArr[i]=arr[i];
        }
        
        int k=scan.nextInt();
        scan.close();
        
        
        int[] rotArrClockwise=rotateTheArray(arr,(k%n));
        
        System.out.println("CLOCKWISE");
        for(int i=0;i<rotArrClockwise.length;i++){
            System.out.print(rotArrClockwise[i]+" ");
        }
        int[] rotArrAntiClockwise=rotateTheArray(tempArr,(n-(k%n)));
        System.out.println("\nANTICLOCKWISE");
        for(int i=0;i<rotArrAntiClockwise.length;i++){
            System.out.print(rotArrAntiClockwise[i]+" ");
        }
        
    }
}
