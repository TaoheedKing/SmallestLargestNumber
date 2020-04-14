import java.util.Scanner;

public class SmallLargeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Scanner class

        System.out.print("Input the 1st number: "); //Ask for first input
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: "); //Ask for second input
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: "); //Ask for third input
        int num3 = in.nextInt();

        /**
         * First we evaluate if num1 is greater than num2. If num1 is greater, we evaluate if num1 is greater than num3.
         * if that's true, it prints the largest and lowest number.
         */
        if (num1 > num2) {
            if (num1 > num3)
                if (num2 > num3){
                    System.out.println("The largest number is: " + num1);
                    System.out.println("The smallest number is: " + num3);
                } else {
                    System.out.println("The largest number is: " + num1);
                    System.out.println("The smallest number is: " + num2);
                }
        } else if (num2 > num3){ //Evaluate if num2 is also greater than num3
            System.out.println("The largest number is: " + num2);
            if (num1 > num3){ //Evaluate if num1 is greater than num3
                System.out.println("The smallest number is: " + num3);
                } else {
                System.out.println("The smallest number is: " + num1);
                }
        } else { //if num1 is not greater than num2, and if num2 is not greater than num3, it prints the results.
            System.out.println("The largest number is: " + num3);
            if (num2 > num1){
                System.out.println("The smallest number is: " + num1);
            } else {
                System.out.println("The smallest number is: " + num2);
            }
        }
    }
}
