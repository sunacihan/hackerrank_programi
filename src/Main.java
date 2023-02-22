import java.util.*;

public class Main {
    public static void main(String[] args) {
        //girilen sayıların hangi veri türlerinde olabileceğini bulan program
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers to enter:");
        int a = input.nextInt();

        for (int i = 0; i < a; i++) {
            try {
                System.out.print("Enter the number:");
                long x = input.nextLong();
                System.out.println(x + " can be stored in the following data types.");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(input.next() + " is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.");
            }
        }
    }

}

