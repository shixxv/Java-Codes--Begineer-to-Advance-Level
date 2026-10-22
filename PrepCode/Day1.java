import java.util.Scanner;

public class Day1{
    public static void main(String[] args) {
        //Print all prime numbers between a limit
        Scanner s = new Scanner(System.in);
        int low=s.nextInt();
        int high=s.nextInt();

        for(int n=low;n<=high;n++){
            int count  = 0;
            //try to divide n and increase the count
            for(int div =2; div*div<=n ;div++) //root n tak divide karke dekhte hai agar koi didvisor hota hai wo pehle hi hota..
            {
                if(n%div ==0){
                count++;
                break;       
                }
            }
           

            if(count==0){
                System.out.println(n);
            }
        }

        s.close();

    }
}