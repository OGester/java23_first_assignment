import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        // enables us to use scanner to pick up input from user.
        Scanner scan = new Scanner(System.in);

        //prints welcome message and three choices for user to pick from.
        System.out.println("Welcome! \nHow can i be of service?");
        while (true) {
            System.out.println("\n 1. Create pay check.\n 2. Create new invoice.\n 3. Pay one or more invoices.\n--->");

            try {
                //acount balance
                double acountBalance = 2000000;
                //scans for user input to start entered choice.
                int choice = scan.nextInt();

                switch (choice) {

                    case 1: /* Löne array */
                        System.out.println("Enter the number of staff you want to pay.");

                        try {
                            // solution to size array found at
                            //https://www.geeksforgeeks.org/how-to-take-array-input-from-user-in-java/

                            int staff = scan.nextInt();
                            System.out.println("You have entered " + staff + " Employees to pay");
                            if (staff <= 0) {
                                System.out.println("Invalid input.");
                            }

                            double[] salary = new double[(int) staff];

                            for (int i = 0; i < staff; i++) {
                                System.out.println("Enter salary: ");
                                if (scan.hasNextDouble()) {
                                    salary[i] = scan.nextDouble();
                                }
                            }
                            System.out.println("Salary amounts to pay out: ");
                            for (int i = 0; i < staff; i++) {

                                double netSalary = salary[i] * 0.70;
                                double tax = salary[i] - netSalary;
                                System.out.println("\nnet salary is = " + netSalary);
                                System.out.println("the tax is = " + tax);
                                System.out.println( );
                            }


                        } catch (Exception e) {
                            System.out.println("Dooh! Please try again :)");
                            scan.nextLine();
                            break;
                        }
                        System.out.println("\nThank you for using Salary calculator.");
                        break;

                    //If user choose 2, create invoice
                    case 2:
                        System.out.println("State amount to pay inc. Vat:\n--->");
                        double gross = scan.nextDouble();
                        double vat = gross * 0.25;
                        double net = gross - vat;
                        acountBalance += gross;

                        System.out.println("Invoice gross = " + gross);
                        System.out.println("Vat = " + vat);
                        System.out.println("Invoice net = " + net);
                        System.out.println("\nThank you for using Vat calculator.\nWelcome back.");
                        //sout endast använd för att testa att accountBalance ökade
                        //System.out.println(acountBalance);

                    case 3:
                        System.out.println("Enter the number of invoices you want to pay.");

                        try {

                            int numberOfInvoices = scan.nextInt();
                            System.out.println("You have entered " + numberOfInvoices + " invoices to pay");
                            if ( numberOfInvoices <= 0) {
                                System.out.println("Invalid input.");
                            }

                            double[] invoice = new double[(int) numberOfInvoices];

                            //System.out.println("Enter salary ");
                            for (int i = 0; i < numberOfInvoices; i++) {
                                System.out.println("Enter invoice: ");
                                if (scan.hasNextDouble()) {
                                    invoice[i] = scan.nextDouble();
                                }

                            }
                            System.out.println("Invoices processed:");
                            double total = 0;
                            double accountBalance = 1000;
                            for (int i = 0; i < numberOfInvoices; i++) {

                                double sumOfInvoices = invoice[i];
                                total = total + sumOfInvoices;
                                accountBalance = accountBalance - sumOfInvoices;

                            }
                            System.out.println("\nthe invoice total is:\n" + total);
                            System.out.println("Your account balance is now: \n" + accountBalance);
                            break;


                        } catch (Exception e) {
                            System.out.println("Dooh! Please try again :)");
                            scan.nextLine();
                        }

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (Exception e) {
                System.out.println("Invalid input please try again");
                scan.nextLine();
            }
        }
    }
}
