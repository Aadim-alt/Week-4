
import java.util.Scanner;
public class DiscountSwitch
{
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter The category of product: 'A','B','C','D','E'");
    String A = scanner.next().toUpperCase();
    System.out.print("Enter Price of the Product.");
    double mp = scanner.nextFloat();
    double sp;
    switch(A){
    case ("A") -> {
     sp = mp - (mp *60.0/100.0);
        System.out.print("Your Price is: "+sp);
    }
    case ("B") -> {
     sp = mp - (mp *40.0/100.0);
        System.out.print("Your Price is: "+sp);
    }
    case ("C") -> {
     sp = mp - (mp *20.0/100.0);
        System.out.print("Your Price is: "+sp);
    }
    case ("D") -> {
     sp = mp - (mp *10.0/100.0);
        System.out.print("Your Price is: "+sp);
    }
    default -> System.out.println("Enter a valid Category.");
    }
}
}