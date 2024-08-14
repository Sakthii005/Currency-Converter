import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter!");
        while (true) {
            System.out.println("1. Convert INR to USD");
            System.out.println("2. Convert USD to INR");
            System.out.println("3. Convert INR to EUR");
            System.out.println("4. Convert EUR to INR");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    convertINRToUSD();
                    break;
                case 2:
                    convertUSDToINR();
                    break;
                case 3:
                    convertINRToEUR();
                    break;
                case 4:
                    convertEURToINR();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    private static double inrToUsdRate=0.012; 
    private static double usdToInrRate=83.89; 
    private static double inrToEurRate=0.011; 
    private static double eurToInrRate=92.34; 
    private static void convertINRToUSD() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");
        double inr=sc.nextDouble();
        double usd=inr*inrToUsdRate;
        System.out.println(inr + " INR is equivalent to " + usd + " USD");
    }
    private static void convertUSDToINR() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        double usd=sc.nextDouble();
        double inr=usd*usdToInrRate;
        System.out.println(usd + " USD is equivalent to " + inr + " INR");
    }
    private static void convertINRToEUR() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");
        double inr=sc.nextDouble();
        double eur= inr*inrToEurRate;
        System.out.println(inr + " INR is equivalent to " + eur + " EUR");
    }
    private static void convertEURToINR() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in EUR: ");
        double eur=sc.nextDouble();
        double inr=eur*eurToInrRate;
        System.out.println(eur + " EUR is equivalent to " + inr + " INR");
    }
}
