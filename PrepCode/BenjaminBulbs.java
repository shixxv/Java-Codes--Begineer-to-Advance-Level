import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        
        int n = s.nextInt();

        //Saare perfectSqaures print karde

        for(int i=1; i*i<=n;i++){
            System.out.println(i*i);
        }
    }
}
