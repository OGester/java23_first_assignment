import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Välkommen! \nVilken tjänst vill du använda?\n");
        System.out.println("1. Betala ut lön. \n2. Skapa faktura. \n3. Betala en eller flera fakturor.");

        double konto = 20000000;


        int choice = scan.nextInt();

        if (choice == 1) {
            //Lägg in löne array
        }

        if (choice == 2) {
            System.out.println("Vänligen ange brutto summa av faktura.");
            // scannern fångar upp bruttosumman av fakturan som anges.
            double faktura = scan.nextDouble();
            //kallar på funktionen calculateMoms för att räkna ut momsen.
            double moms = calculateMoms(faktura);
            //kallar på funktionen calculateNetto för att räkna ut nettobeloppet.
            double netto = calculateNetto(faktura, moms);
            //kallar på funktionen calculateSaldo för att räkna ut kontosaldo efter inlagd faktura.
            double saldo = calculateSaldo(konto, faktura);

            //skriver ut Brutto, moms och netto i terminalen.
            System.out.println("Fakturans brutto summa är: " + faktura + " kr");
            System.out.println("Momsen är: " + moms + " kr");
            System.out.println("Fakturans netto summa är: " + netto + " kr");


        }

    }
    //Funktionen räknar ut moms genom parametern faktura som användaren anger
    //gångras den med 0.25 och returnerar svaret som double moms
    public static double calculateMoms (double faktura){
        double moms = faktura * 0.25;
        return moms;
    }
    //Räknar ut Faktura netto genom att subtrahera parametern moms ifrån parametern faktura
    //och returnerar double netto
    public static double calculateNetto (double faktura, double moms){
        double netto = faktura - moms;
        return netto;
    }
    public static double calculateSaldo (double konto, double faktura){
        double saldo = konto + faktura;
        return saldo;
    }
}