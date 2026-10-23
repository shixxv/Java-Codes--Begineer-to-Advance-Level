import java.util.Scanner;
public class Table {
 public static void main(String[] args) {
 
    Scanner s = new Scanner(System.in);

    int x=s.nextInt();
    for(int i=0;i<=10;i++){

        int val=x*i;
        System.out.println(x+"*"+i+"="+val);
    }

    }
}
