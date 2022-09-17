import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int sq){
        return (int) (sq * sq);
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner integer = new Scanner(System.in);
        System.out.println("Type integer to be squared here:");
        int input = integer.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int result = square(input);
        // Put the result System.out code here.
        System.out.println(result);
    }
}
