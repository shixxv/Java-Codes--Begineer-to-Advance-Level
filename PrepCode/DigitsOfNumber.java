import java.util.Scanner;

public class DigitsOfNumber {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n= s.nextInt();

    int numberOfDigits =0;
    int temp = n;
    do{
        temp =temp/10;                                    //Quotient returns to temp
        numberOfDigits++;
    }while(temp !=0);
    int div = (int)java.lang.Math.pow(10,numberOfDigits-1);
    while(div!=0){
        int q = n/div;
        System.out.println(q);
        n=n%div;
        div=div/10;
    }
    s.close();
   }
    
}
