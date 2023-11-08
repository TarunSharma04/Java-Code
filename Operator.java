import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the first number :");
        int num1 = input.nextInt();

        System.out.print("Enter the second number :");
        int num2 = input.nextInt();

        

//Airthematic Operator

        System.out.println("\n<--------- Airthematic Operation ---------> ");
        System.out.println("\nSum of "+num1 + " and "+ num2+ " is : "+ (num1 + num2));
        System.out.println("\nModulus of "+num1 + " and "+ num2+ " is : "+ (num1 % num2));
        System.out.println("\nSubtraction of "+num1 + " and "+ num2+ " is : "+ (num1 - num2));
        System.out.println("\nDivision of "+num1 + " and "+ num2+ " is : "+ (num1 / num2));
        System.out.println("\nMultiplication of "+num1 + " and "+ num2+ " is : "+ (num1 * num2));



// Relational or comparision Operator

        System.out.println("\n<--------- Comparision or Relational Operator --------->");
        System.out.println("\nIs "+num1 + " equal to "+ num2+":"+ (num1==num2));
        System.out.println("\nIs "+num1 + " not equal to "+ num2+":"+ (num1!=num2));
        System.out.println("\nIs "+num1 + " greater than "+ num2+":"+ (num1>num2));
        System.out.println("\nIs "+num1 + " less than "+ num2+":"+ (num1<num2));
        System.out.println("\nIs "+num1 + " Greater than or equal "+ num2+":"+ (num1>=num2));
        System.out.println("\nIs "+num1 + " less than or equal "+ num2+":"+ (num1<=num2));



//Logical Operator

        System.out.println("\n <--------- Logical Operator--------->");
        System.out.println("\nIs "+num1 + " Greater than or equal "+ num2+":"+ ((num1>num2)||(num1==num2)));
        System.out.println("\nIs "+num1 + " Greater than and equal "+ num2+":"+ ((num1>num2)&&(num1==num2)));
       
        System.out.println("\nIs "+num1 + " less than or equal "+ num2+" :"+ ((num1<num2)||(num1==num2)));
        System.out.println("\nIs "+num1 + " less than and equal "+ num2+" :"+ ((num1<num2)&&(num1==num2)));

        System.out.println("\n "+num1 + " is not greater than "+ num2+" :"+ !(num1>num2));
        System.out.println("\n "+num1 + " is not less than "+ num2+" :"+ !(num1<num2));



// // Assignment Operator
//         System.out.println("\nAssigned Value to num1 :"+ (num1=num1));
//         System.out.println("\nAssigned Value to num2 :"+ (num1=num2));

//Increment Operator55

        // System.out.print("Enter the number you want to increament in num1 :");
        // int num3 = input.nextInt();
        
        // System.out.print("Enter the number you want to increament in num2 :");
        // int num4 = input.nextInt();

        // System.out.println("\n Final result of "+ num1+ " after increament of "+num3+ "is :" + num1++);
        // System.out.println(" increament by 1"+(num1++));




//Bitwise Operator


        System.out.println("\n <--------- Bitwise Operator--------->");
        System.out.println("\n Bitwise AND of "+num1+ " and "+num2+ " is :"+ (num1&num2));
        System.out.println("\n Bitwise OR of "+num1+ " and "+num2+ " is :"+ (num1|num2));
        System.out.println("\n Bitwise XOR of "+num1+ " and "+num2+ " is :"+ (num1^num2));
        System.out.println("\n Bitwise NOT of "+num1+" is : "+(~num1));
        System.out.println("\n Bitwise NOT of "+num2+" is : "+(~num2));




// Shift Operator
        System.out.print("Enter the Shifting number :");
        int num3 = input.nextInt();

        System.out.println("\n <--------- Shift Operator--------->");
        System.out.println("\n Right Shifting the "+num1+ "by 2 :"+(num1>>num3));
        System.out.println("\n Right Shifting the "+num2+ ":"+(num2>>num3));
        System.out.println("\n Left Shifting the "+num1+ ":"+(num1<<num3));
        System.out.println("\n Left Shifting the "+num2+ ":"+(num2<<num3));
        System.out.println("\n Unsigned Right Shifting the "+num1+ ":"+(num1>>>num3));
        System.out.println("\n Unsigned Right Shifting the "+num2+ ":"+(num2>>>num3));










































}













    }

   