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
            while(j<=(n-i+1)){
                System.out.print(j+" ");
                j++;

            }
            int star=i-1;
            while(star!=0){
                System.out.print("* "+"* ");
                star--;
            }
            
            j=n-i+1;
            while(j!=0){
                System.out.print(j+" ");
                j--;
            }
            System.out.println("");
            i++;
        }
    }
    
}
