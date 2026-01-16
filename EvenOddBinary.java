import java.util.Scanner;

public class EvenOddBinary {
    public static void checkEvenOdd(int n) {
        int bitMask=1;
        if((n & bitMask)==0 ) {
            System.out.println("Even number.");
        }
        else{
            System.out.print("odd number");
        }
        
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=inp.nextInt();
        checkEvenOdd(num);
    }
}
