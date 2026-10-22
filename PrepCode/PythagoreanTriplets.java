import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        int max=a;

        if(b>=max){
            max=b;
        }
        else if(c>=max){
            max=c;
        }

        if(max==a){
            boolean flag = (b*b)+(c*c)==(a*a);
            System.out.println(flag);
        }
        else if(max==b){
             boolean flag = (a*a)+(c*c)==(b*b);
            System.out.println(flag);
        }
        else{
            boolean flag = (a*a)+(b*b)==(c*c);
            System.out.println(flag);
        }






        s.close();
    }
}
