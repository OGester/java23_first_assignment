import java.util.Scanner;

public class LoopsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of staff you want to pay.");
        //double accountBalance = 2000000;

        try {

            // solution to size array found at
            //https://www.geeksforgeeks.org/how-to-take-array-input-from-user-in-java/

            int staff = scan.nextInt();
            System.out.println("You have entered " + staff + " Employees to pay");
            if (staff <= 0){
                System.out.println("Invalid input");
            }
            double[] salary = new double[(int)staff];

            //System.out.println("Enter salary " + i + ": ");
            for (int i = 0; i < staff; i++) {
                double accountBalance = 2000000;
                System.out.println("Enter salary " + i + ": ");
                double salaryAmount = scan.nextDouble();
                salaryAmount *= 1.30;




              /*  if (scan.hasNextDouble()) {
                    salary[i] = scan.nextDouble();
                }
            }
            //System.out.println("the salaries are:");
            for (int i = 0; i < staff; i++) {
                salary[i] = salary[i] * 1.30;
                //System.out.println(salary[i]); */
                //System.out.println("salaries = " + salaryAmount);
            }


            System.out.println("\nThank you for using Salary calculator.");


        } catch (Exception e) {
            System.out.println(" Invalid");
        }

    }
}
