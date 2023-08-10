import java.util.Scanner;

public class ProjCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        String operator = scan.next();
        if (operator.equals("+")||operator.equals("-")||operator.equals("/")||operator.equalsIgnoreCase("x"))
        {
            int n2 = scan.nextInt();
            AdvanceCalc obj = new AdvanceCalc();
            if (operator.equals("+"))
            {
                System.out.println(obj.Add(n1, n2));
            }
            else if (operator.equals("-"))
            {
                System.out.println(obj.Sub(n1, n2));
            }
            else if (operator.equalsIgnoreCase("x"))
            {
                System.out.println(obj.Mul(n1, n2));
            }
            else
            {
                System.out.println(obj.Div(n1, n2));
            }
        }
        else {
            System.out.println("Type a valid operator");
        }
    }
}
