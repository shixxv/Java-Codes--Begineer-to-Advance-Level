import java.util.Scanner;


public class NoOfDigits {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            int digit=0;

            do{
                digit++;// ek bhi digit tog hoga humare number mein
                num=num/10;// it strips down the number by 10thss places and reassigns them in num
            }
            while(num !=0);//true until the num is =0
            System.out.println(digit);
        s.close();
    }
    
}
