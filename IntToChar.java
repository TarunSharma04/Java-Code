import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the number you want to convert :");
        int num = input.nextInt();   // ASCII value of 'A'


        char ch = (char) num;
        short s = (short) num;
        double d = (double) num;
        float f = (float) num;
        long l = (long) num;
        



        System.out.println("\n The int value is : ");
        System.out.println("The Value of "+num + " in Char is :" +ch);
        System.out.println("The Value of "+num + " in short is :" +s);
        System.out.println("The Value of "+num + " in double is :" +d);
        System.out.println("The Value of "+num + " in float is :" +f);
        System.out.println("The Value of "+num + " in long is :" +l); 
        System.out.println("Short Range is from " +Short.MIN_VALUE + " to " + Short.MAX_VALUE);

    }
    
}
