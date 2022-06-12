package if_else;

import java.util.Scanner;
public class AlphaNumberCheck{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        char a=scan.next().charAt(0);
        scan.close();
        if((a>=97)&&(a<=122)){
            System.out.println("Lowercase");
        }
        else if((a>=65)&&(a<=90)){
            System.out.println("Uppercase");
        }
        else if((a>=48)&&(a<=57)){
            System.out.println("Numeric");
        }
        else{
            System.out.println("Other");
        }
    }
}