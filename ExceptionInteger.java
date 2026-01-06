import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionInteger{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter an integer: ");
            int number = sc.nextInt();
            System.out.println("You entered: "+number);
        } catch(InputMismatchException e) {
            System.out.println("Erro: please enter a valid integer.");
        }
        finally{
            sc.close();
        }
        System.out.println("Program continues.....");
    }
}