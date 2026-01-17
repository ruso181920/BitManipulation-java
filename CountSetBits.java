import java.util.Scanner;

public class CountSetBits {
      public static int CountSetBit(int n) {
         int count=0;
         while(n>0) {
          if((n&1)!=0) {
            count++;
          }
         n= n>>1;
         }
         return count;
       }
          public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=inp.nextInt();
        System.out.println("The number of set bit is :"+CountSetBit(num));
}
}