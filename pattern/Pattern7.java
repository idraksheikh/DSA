package pattern;
import java.util.Scanner;
public class Pattern7{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=1;
        int count=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(" "+count+" ");
                j++;
                count++;
            }
            System.out.println("");
            i++;
        }
    }
}