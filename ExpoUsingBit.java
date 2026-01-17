import java.util.Scanner;

public class ExpoUsingBit {
   public static int calulateExpo(int num,int pow) {
   int ans=1;
   while(pow>0) {
    if((pow&1)!=0) {
        ans=ans*num;
    }
    num=num*num;
    pow=pow>>1;
   }
   return ans;
 }
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=inp.nextInt();
        System.out.print("Enter pow : ");
        int pow=inp.nextInt();
      System.out.println(num+" raised to power "+pow+ " is "+ calulateExpo(num,pow));
    }
}


