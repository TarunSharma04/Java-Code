import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
// Integer Data Type

    System.out.print("Enter the integer value :");
    int integer = input.nextInt();
    System.out.println("\n The int value is : "+integer);


// Double Data Type

    System.out.print("Enter the double value :");
    double Double = input.nextDouble();
    System.out.println("\n The double value is : "+Double);


// String Data Type

    System.out.print("Enter the String value :");
    String string = input.next();
    System.out.println("\n The String value is : "+string);


 // Char Data Type

        System.out.print("Enter a Char Value: ");
        input.nextLine();
        char charValue = input.nextLine().charAt(0);
        
        System.out.println("The Char Value is : " + charValue);

// Boolean Data Type

        System.out.print("Enter a Boolean Value (true or false): ");
        
        boolean boolValue = input.nextBoolean();
         // Consume the newline character
        System.out.println("You entered a boolean: " + boolValue);




// Short Data Type


        System.out.print("Enter the Short Value :");
        short shortvalue = input.nextShort();
        System.out.println("\n The Short Value is :"+shortvalue);

// Byte Data Type

        System.out.println("Enter the Byte Value :");
        byte bytevalue = input.nextByte();
        System.out.println("\n The Byte Value is : ");


// Long Data Type

        System.out.print("Enter the Long Value :");
        long longvalue = input.nextLong();
        System.out.println("\n The Long Value is :");



    }
    
}
