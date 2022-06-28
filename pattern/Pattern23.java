package pattern;

import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        scan.close();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print(j);
                j++;

            }
            int k=1;
            while(k<=i-1){
                System.out.print("**");
                k++;
            }
            int l=1;
            while(l<=n-i+1){
                System.out.print(n-i-l+2);
                l++;
            }
            System.out.println("");
            i++;
        }
    }    
}
