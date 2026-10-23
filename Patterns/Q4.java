import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int space=0;
        int star=n;

        for(int i=1;i<=n;i++){
           // System.err.println(space+","+star);
           for(int j=1;j<=space;j++){
                System.out.print("\t");
           }
           for(int j=1;j<=star;j++){
                System.out.print("*\t");
           }
            space++;
            star--;
            System.out.println();
        }
    }
}
