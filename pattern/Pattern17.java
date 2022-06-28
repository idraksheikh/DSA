package pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        scan.close();
        int i=1,count=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(" "+(char)('A'+count-1)+" ");
                j++;
                count++;

            }
            System.out.println("");
            i++;
        }
    }    
}
