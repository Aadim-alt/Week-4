import java.util.Scanner;
public class DivNested
{ public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a Num: ");
        num = scanner.nextInt();
        if(num %3 ==0){
        if (num%5 == 0){
        System.out.println(num + " is divisble by both 3 and 5.");
        }
        }
        else{
        System.out.println(num+ " is not divisible by 3 and 5.");
        }
}
}