import java.util.Scanner;

public class SetIthBit {
    public static int setIthBit(int n,int ithBit) {
        int bitMask=1<<ithBit;
       return n|bitMask;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=inp.nextInt();
         System.out.print("Enter the bit  : ");    
        int ithBit=inp.nextInt();
       System.out.println(setIthBit(num,ithBit)) ;

    }
}
