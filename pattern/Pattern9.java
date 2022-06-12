package pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int i=1;
        while(i<n){
            int j=1;
            while(j<=i){
                System.out.print(i+j-1 +" ");
                j++;
            }
            System.out.println("");
            i++;
        }

    }
}
