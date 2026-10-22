import java.util.*;

public class InverseOfNumber {
   public static void main(String[] args) {
    //8 1 4 5 6 2 7 3-valid seq.
    //1 3 4 4 5 6 7 7-invalid seq.


        //INPUT
    //indx- 8 7 6 5 4 3 2 1
    //digit-8 1 4 5 6 2 7 3
        //OUTPUT       
    //indx- 8 7 6 5 4 3 2 1
    //digit-8 2 4 5 6 1 3 7
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int inverse = 0;
    int originalPlace=1;
    while(n!=0){
        int originalDigit=n%10;
        int invertedDigit=originalPlace;
        int invertedPlace=originalDigit;

        inverse = inverse+ invertedDigit* (int) java.lang.Math.pow(10,invertedPlace-1);
        n = n/10;
        originalPlace++;
    }
System.out.println(inverse);



    s.close();
   } 
}
