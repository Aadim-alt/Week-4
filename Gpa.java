import java.util.Scanner;
public class Gpa
{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your GPA: ");
    double GPA = scanner.nextDouble();
    if(GPA > 3.6)
    {
    System.out.println("A+");
    }
    else if(GPA > 3.2)
    {
    System.out.println("A");
    }
    else if(GPA > 2.8)
    {
    System.out.println("B+");
    }
    else if(GPA > 2.4)
    {
    System.out.println("B");
    }
    else if(GPA > 2.0)
    {
    System.out.println("C+");
    }
    else if(GPA > 1.6)
    {
    System.out.println("C");
    }
    else if(GPA > 1.2)
    {
    System.out.println("D");
    }
    else if(GPA > 0)
    {
    System.out.println("Fail");
    }
    else{System.out.println("Enter a valid GPA.");}
    }
}