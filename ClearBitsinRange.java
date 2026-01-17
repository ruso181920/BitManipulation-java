import java.util.Scanner;

public class ClearBitsinRange {
     public static int clearBitRange(int n,int i,int j) {
       int a=((~0)<<(j+1));
       int b=(1<<i)-1;
       int bitMask=a|b;
         return (n & bitMask);
       }
        
    

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=inp.nextInt();
         System.out.print("Enter the start range  : ");    
        int i=inp.nextInt();
         System.out.print("Enter the end range  : ");    
        int j=inp.nextInt();
       System.out.println(clearBitRange(num,i,j)) ;

    }
}
