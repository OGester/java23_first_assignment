import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        // enables us to use scanner to pick up input from user.
        Scanner scan = new Scanner(System.in);

        //prints welcome message and three choices for user to pick from.
        System.out.println("Welcome! \nHow can i be of service?");
        System.out.println("\n 1. Create pay check.\n 2. Create new invoice.\n 3. Pay one or more invoices.\n--->");

        try {
            //acount balance
            double acountBalance = 2000000;
            //scans for user input to start entered choice.
            int choice = scan.nextInt();

            switch (choice) {

                case 1: /* Löne array */
                    break;
                //If user choose 2, create invoice
                case 2:
                    System.out.println("State amount to pay inc. Vat:\n--->");
                    double gross = scan.nextDouble();
                    double vat = gross * 0.25;
                    double net = gross - vat;
                    //double saldo = acountBalance + gross;
                    acountBalance = acountBalance + gross;

                    System.out.println(gross);
                    System.out.println(vat);
                    System.out.println(net);
                    System.out.println(acountBalance);

                    /*System.out.println("Would you like to do anything else?\nYes - No");
                    scan.nextLine();
                    String answer2 = scan.nextLine();
                    if (answer2.equals("yes")) {
                        System.out.println("\n 1. Create pay check.\n 2. Create new invoice.\n 3. Pay one or more invoices.");

                    } else if (answer2.equals("no")) {
                        System.out.println("Thanks for using our services");
                        System.exit(0);
                    } else {
                        System.out.println("Good bye, have a nice day!");
                        System.exit(0);
                    }

                    break;
*/
                case 3:
                    /* System.out.println(acountBalance + 20);*/
                    break;

                default:
                    System.out.println("Invalid choice!");


            }


        } catch (Exception e) {
            System.out.println("Invalid input please try again");
        }
    }
}
