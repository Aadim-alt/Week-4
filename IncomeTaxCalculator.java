import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income Rs: ");
        double income = sc.nextDouble();

        double tax = 0;

        
        String bracket = "";
        if (income <= 500000)
            bracket = "A";
        else if (income <= 700000)
            bracket = "B";
        else if (income <= 1000000)
            bracket = "C";
        else if (income <= 2000000)
            bracket = "D";
        else if (income <= 5000000)
            bracket = "E";
        else
            bracket = "F";

        
        tax = switch (bracket) {
            case "A" -> 0.01 * income;
            case "B" -> 5000 + 0.10 * (income - 500000);
            case "C" -> 15000 + 0.20 * (income - 700000);
            case "D" -> 35000 + 0.30 * (income - 1000000);
            case "E" -> 335000 + 0.36 * (income - 2000000);
            case "F" -> 1135000 + 0.39 * (income - 5000000);
            default -> 0;
        };

        System.out.println("Your total income tax is: NPR " + tax);
    }
}

