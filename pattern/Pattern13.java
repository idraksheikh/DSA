package pattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        scan.close();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(" "+(char)('A'+i+j-2)+" ");
                j++;

            }
            System.out.println("");
            i++;
        }
    }    
}
