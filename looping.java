import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter a number :");
        // int num = input.nextInt();

        System.out.print("Enter the number of students :");
        int cn = input.nextInt();


        
        // for (int i = num; i <= cn; i++) {
        //     System.out.println("Roll number " + i );
        // }
        
        int count = 1;
        while (count < cn) {
            System.out.println("Roll number  " + count);
            count++;
        }
        

         

    }
    
}
