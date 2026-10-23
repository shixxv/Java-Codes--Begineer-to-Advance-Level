import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
     
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int space=n/2;
        int star=1;
        int value=1;//play with row value
        for(int i=1;i<=n;i++){
          
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            int colValue=value;//plays with colum value
            for(int j=1;j<=star;j++){

                System.out.print(colValue+"\t");

                if(j<=star/2){
                colValue++;
                }
                else{
                colValue--;
                }
            } 
            
            if(i<=n/2){
                space--;
                star+=2;
                value++;
            } 
            else{
                space++;
                star-=2;
                value--;
            }
            System.out.println();
        }

        

    }
    
}
