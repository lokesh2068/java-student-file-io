import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double result;
        try{
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Select the operator(+,-,/,*): ");
            char op = sc.next().charAt(0);

            switch (op){
                case '+':
                    result = a+b;
                    break;
                case '-':
                    result = a-b;
                    break;
                case '/':
                    result = a/b;
                    break;
                case '*':
                    result = a*b;
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
                
            }
            System.out.println("Result: "+result);
        } catch (ArithmeticException e){
            System.out.println("Error: cannot divide by zero");
        } catch(InputMismatchException e ){
            System.out.println("Error: Please enter valid numbers ");
            sc.next();
        } finally{
            sc.close();
        }
    }
}