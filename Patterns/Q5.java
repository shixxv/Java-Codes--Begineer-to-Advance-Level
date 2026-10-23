import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //ASSUMPTON IS THAT THE N IS ALWAYS ODD;
        int n = s.nextInt();
        int space=n/2;
        int star=1;

        for(int i=1;i<=n;i++){
            //System.out.println(space+","+star);
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }

            if(i<=n/2){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
            System.out.println();
        }
       
    }
}
