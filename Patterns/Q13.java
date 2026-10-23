import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        for(int i=0;i<=n;i++){
            int icj=1;
            for(int j=0;j<=i;j++){
               //System.out.print("*\t");
               System.out.print(icj+"\t"); 
                int icjPlus1= icj*(i-j)/(j+1);
                icj=icjPlus1;
            }
            System.out.println();
        }
    }
}
