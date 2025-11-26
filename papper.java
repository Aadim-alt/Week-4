import java.util.Scanner;
public class papper
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String papper;
        System.out.print("Enter the Size of papper (A0 to A5): ");
        papper = scanner.nextLine();
        switch(papper){
        case("A0") -> System.out.println("The size of papper A0 is 841 x 1189 mm (33.1 x 46.8 inches)");
        case("A1") -> System.out.println("The size of papper A1 is 594 x 841 mm (23.4 x 33.1 inches)");
        case("A2") -> System.out.println("The size of papper A2 is 420 x 594 mm (16.5 x 23.4 inches)");
        case("A3") -> System.out.println("The size of papper A3 is 297 x 420 mm (11.7 x 16.5 inches)");
        case("A4") -> System.out.println("The size of papper A4 is : 210 x 297 mm (8.3 x 11.7 inches)");
        case("A5") -> System.out.println("The size of papper A5 is : 148 x 210 mm (5.8 x 8.3 inches)");
        default -> System.out.println("Enter a valid Size");
        }
    }
}