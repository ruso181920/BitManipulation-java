import java.util.Scanner;

public class UpdateIthBit {
     public static int clearIthBit(int n,int ithBit) {
        int bitMask=~(1<<ithBit);
         return (n & bitMask);
       }
        public static int setIthBit(int n,int ithBit) {
        int bitMask=1<<ithBit;
       return n|bitMask;
    }
     public static int updateIthBit(int n,int ithBit,int newBit) {
   // method -1
        //     if(newBit==0) {
    //         return clearIthBit(n, ithBit);
    //     }
    //    else{
    //     return setIthBit(n, ithBit);
    //    }

    // method -2
    n=clearIthBit(n, ithBit);
    int BitMask=newBit<<ithBit;
    return n|BitMask;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=inp.nextInt();
         System.out.print("Enter the bit  : ");    
        int ithBit=inp.nextInt();
       System.out.print("Enter the new bit  : ");    
        int newBit=inp.nextInt();
       System.out.println(updateIthBit(num,ithBit,newBit)) ;

    }
}
