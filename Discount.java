
import java.util.Scanner;
public class Discount
{
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter The category of product: 'a','b','c','d','e'");
    char A = scanner.next().charAt(0);
    System.out.print("Enter Price of the Product.");
    double mp = scanner.nextFloat();
    double sp;
    if(A == 'a')
    {
        sp = mp - (mp *60.0/100.0);
        System.out.print("Your Price is: "+sp);
    }
    else if(A == 'b')
    {
        sp = mp - (mp *40.0/100.0);
        System.out.print("Your Price is: "+sp);
    }
    else if(A == 'c')
    {
        sp = mp - (mp *20.0/100.0);
        System.out.print("Your Price is: "+sp);
    }
    else if(A == 'd')
    {
        sp = mp - (mp *10.0/100.0);
        System.out.print("Your Price is: "+sp);
    }
    else{System.out.println("Enter a valid Category.");}
    
    
    }
}