package pattern;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        scan.close();
        int i=1;
        while(i<=n){
            int k=1;
            while(k<=n-i){
                System.out.print(" ");
                k++;
            }
            int j=1;

            while(j<=i){
                System.out.print(j);
                j++;
            }
            int l=1;
            while(l<=i-1){
                System.out.print((i-l));
                l++;
            }
            System.out.println("");
            i++;
        }
    }    
}
