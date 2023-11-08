import java.util.Scanner;

public class PrimitiveDataTypeSize {
public static void main(String[] args)
 {
    
    System.out.println("Size of primitive data types in bytes:");

System.out.println("byte: " + Byte.BYTES);
 System.out.println("short: " + Short.BYTES); 
 
 System.out.println("int: " + Integer.BYTES); 
 System.out.println("long: " + Long.BYTES); 
 
 System.out.println("float: " + Float.BYTES); 
 System.out.println("double: " + Double.BYTES); 
 System.out.println("char: " + Character.BYTES);

// Boolean data type is not defined by BYTES System.out.println("boolean: " + (Byte.SIZE / 8));

}
}
