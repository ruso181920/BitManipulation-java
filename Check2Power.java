import java.util.*;

public class Check2Power {
     public static void check2Power(int num) {
     if (num>1 &&   ( num&(num-1)) ==0) {
        System.out.println("it's  a exponent of 2");
        
     }
     else {
        System.out.println("no");
     }
 }
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=inp.nextInt();
       check2Power(num);
    }
}
