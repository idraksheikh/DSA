package pattern;
import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=1,count=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(" "+count+" ");
                j++;
                count++;
            }
            System.out.println("");
            i++;
        }
    }
}