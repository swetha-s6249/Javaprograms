import java.util.*;
class intDivison{
    public static void main(String s[])
{
        try
        {    int a,b,result;
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter numbers:");
             String s1=sc.next(); 
             String s2=sc.next();
             a=Integer.parseInt(s1);
             b=Integer.parseInt(s2);
             result=a/b;
             System.out.println("Result: "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("The denominator cannot be zero");
        }
        catch(NumberFormatException e)
        {
            System.out.println("given input is not an integer");
        }
    }
}