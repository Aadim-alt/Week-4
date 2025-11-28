import java.util.Scanner;
public class Movie
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Aadim Cinema. (Press Enter to Continue)");
        scanner.nextLine();
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the movie of the language (N/H/E) N for nepali H for hindi E for english: ");
        String language = scanner.next().toUpperCase();
        System.out.print("Do you have a student ID (Y/N): ");
        String Id = scanner.next().toUpperCase();
        System.out.print("Is it a festival Today (Y/N): ");
        String fest = scanner.next().toUpperCase();
        double price = 0;
        if(age<12)
        {
            price = 150;
        }
        else if(age>12 && age<64)
        {
            price = 250;
        }
        else if(age>63)
        {
            price = 200;
        }
        else
        {
            System.out.print("Since you didn't enter a valid age you price is Rs.300.");
            price = 300;
        }
        if(Id.equals("Y"))
        {
            price = price - (20.0/100.0)*price;
        }
        if(fest.equals("Y"))
        {
            price = price - (15.0/100.0)*price;
        }
        if(language.equals("N"))
        {
        price = price;
        }
        else if(language.equals("H"))
        {
        price = price+50;
        }
        else if(language.equals("E"))
        {
        price = price + 100;
        }
        
        System.out.print("Your Price is: "+price);
        
    }
}
//i didn' use switch i forgot.