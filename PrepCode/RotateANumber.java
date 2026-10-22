import java.util.Scanner; 

public class RotateANumber {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int k = s.nextInt();

        //take out no. of digits first
        int temp =num;
        int nod = 0;
        while(temp!=0){
            temp = temp/10;
            nod++;
        }

        k = k%nod;     //354 % nod(5)= 4;
            if(k<0){
                k = k+nod;   //-2 = (-2)+5 == +3
            }
        int div =1;
        int multi =1;
        for(int i=1;i<=nod;i++){
           if(i<=k){          //jab tak i chota rehta hai k se tab tak divisor mein 10 mutiply krte rahiye
            div = div*10;
           } else{           // uske baad multiplier mein multiply karte rahiye 10
            multi = multi*10;
           }
        }
           int q=num/div;
           int r=num%div;

            r = r*multi+q;
           System.out.println(r);
           s.close();
        }
        
        
     }

