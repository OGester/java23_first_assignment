import java.util.Scanner;

public class Looptest {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of invoices you want to pay.");

            try {
                // solution to size array found at
                //https://www.geeksforgeeks.org/how-to-take-array-input-from-user-in-java/

                int invoiceNumber = scan.nextInt();
                System.out.println("You have entered " + invoiceNumber + " invoices to pay");
                if ( invoiceNumber <= 0) {
                    System.out.println("Invalid input.");
                }

                double[] invoice = new double[(int) invoiceNumber];

                //System.out.println("Enter salary ");
                for (int i = 0; i < invoiceNumber; i++) {
                    System.out.println("Enter each invoice: ");
                    if (scan.hasNextDouble()) {
                        invoice[i] = scan.nextDouble();
                    }
                }
                System.out.println("Invoices processed:");
                double total = 0;
                double accountBalance = 1000;
                for (int i = 0; i < invoiceNumber; i++) {

                    double sumOfInvoices = invoice[i];
                    total = total + sumOfInvoices;
                    accountBalance = accountBalance - sumOfInvoices;
                    //System.out.println(sumOfInvoices);
                    //System.out.println(accountBalance);

                }
                System.out.println("\nthe invoice total is:\n" + total);
                System.out.println("Your account balance is now: \n" + accountBalance);

            } catch (Exception e) {
                System.out.println("Dooh! Please try again :)");
                scan.nextLine();
            }
            System.out.println("\nThank you for using Salary calculator.");
            break;
        }
    }
}
