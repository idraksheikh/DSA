package pattern;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        scan.close();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(" "+(char)('A'+i-1)+" ");
                j++;

            }
            System.out.println("");
            i++;
        }
    }    
}
