package pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print((char)('A'+n-(i-j)-1));
                j++;
            }
            System.out.println("");
            i++;

        }
    }
}
