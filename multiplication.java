public import java.util.Scanner;

public static void main(String[] args) { 
//Taking float input from user
Scanner input = new Scanner(System.in);

System.out.print("Enter the first Float Value :");
Float num1 = input.nextFloat();

System.out.print("Enter the second Float Value :");
Float num2 = input.nextFloat();

Float multiplication = num1*num2;

System.println("Float Multiplication : "+multiplication);

}