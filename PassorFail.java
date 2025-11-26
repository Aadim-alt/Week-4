import java.util.Scanner;
public class PassorFail
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double marks;
        System.out.print("Enter Your Marks: ");
        marks = scanner.nextDouble();
        String isPass = (marks>=35)? "You Passed" : "You Failes";
        System.out.println(isPass);
    }
}