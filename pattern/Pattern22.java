package pattern;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        int i=1;
        while(i<=n){
            int space=n-i;
            while(space!=0){
                System.out.print(" ");
                space--;
            }
            int j=1;
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
            int start=i-1;
            while(start!=0)
            {
                System.out.print(start);
                start--;
            }

            System.out.println("");
            i++;
        }
    }
    
}
