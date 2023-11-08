import java.util.Scanner;

class studentdata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first name of student:");
        String firstname = input.next();
        
        System.out.print("Enter last name of student:");
        String lastname = input.next();

        System.out.print("Enter roll no. of student:");
        String rollno = input.next();

        System.out.print("Enter name of class:");
        String classs = input.next();

        System.out.println("Hello, My name is "+firstname+" "+lastname+" , my roll number is "+rollno+" and I study in class "+classs);
        // System.out.println("My roll number is "+rollno);
        // System.out.println("And I study in class "+classs);


    }




}