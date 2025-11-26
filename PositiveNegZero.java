import java.util.Scanner;
public class PositiveNegZero
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a Num: ");
        num = scanner.nextInt();
        if(num ==0){
        System.out.printf("%d is 0\n",num);
        }
        else if(num>0)
        {
            System.out.printf("%d is Positive\n",num);
        }
        else{
        System.out.printf("%d is Negative.",num);
        }
    }
}