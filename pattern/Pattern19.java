package pattern;

import java.util.Scanner;

public class Pattern19 {
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
                System.out.print("*");
                j++;

            }
            System.out.println("");
            i++;
        }
    }    
}
