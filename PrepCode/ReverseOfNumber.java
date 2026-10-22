import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num =s.nextInt();
        
        while(num!=0){
            int remainder=num%10;
            num = num/10;
            System.out.println(remainder);
        }

        s.close();
    }
}
