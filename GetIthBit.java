import java.util.*;

public class GetIthBit {
    public static int getIthBit(int n,int ithBit) {
        int bitMask=1<<ithBit;
        if((n & bitMask)==0) {
            return 0;
        }
        else{
            return  1;
        }
       }
        
    

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=inp.nextInt();
         System.out.print("Enter the bit  : ");    
        int ithBit=inp.nextInt();
       System.out.println(getIthBit(num,ithBit)) ;

    }
}