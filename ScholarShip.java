import java.util.Scanner;


public class ScholarShip
{
     public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your GPA: ");
    double GPA = scanner.nextDouble();
    System.out.print("Enter Your Attendance Percentage: ");
    double Attendance = scanner.nextDouble();
    System.out.print("Enter Your Attitude Score: ");
    double Att = scanner.nextDouble();
    if(GPA >= 3.2)
    {
    if(Attendance > 80)
    {
    if (Att >5)
    {
        System.out.println("You are eligible for Scholarship.");
    }
    else{System.out.println("You are not eligible for Scholarship.");}
    }
    else{System.out.println("You are not eligible for Scholarship.");}
    }
    else{System.out.println("You are not eligible for Scholarship.");}
}  
}