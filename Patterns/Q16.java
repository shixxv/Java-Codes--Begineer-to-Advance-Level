import java.util.*;
public class Q16 {
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

    int n = s.nextInt();
    int star=1;
    int space=2*n-3;
    
    for(int i=1;i<=n;i++){
        int val=1;  //har row 1 se chalu ho rhi hai isiliye maine val ko andr declare kiya
        for(int j=1;j<=star;j++){
            System.out.print(val+"\t");
            val++;
        }
        for(int j=1;j<=space;j++){
            System.out.print("\t");
        }
        if(i==n){
            star--;
            val--;
        }
        for(int j=1;j<=star;j++){
            val--;
            System.out.print(val+"\t");
        }
        star++;
        space-=2;
        System.out.println();
    }
    
   }  
}
