import java.util.Scanner;
public class ExceptionArray{
    public static void main (String[] args){
        int [] num = {5,6,4,2,48,69,51,3,22,10,55,698,7458,12,3};
        Scanner sc = new Scanner(System.in);
        try{
            
            System.out.print("ENter the array index (0 to 14) ");
            int i = sc.nextInt();
            System.out.println("The number in "+(i+1)+" position: "+num[i]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error: INvalid index! please enter between 0 and 14");
    }
    catch(Exception e){
        System.out.println("Error: Please enter a valid number.");
    } finally {
        sc.close();
    }
    System.out.println("Program continues.....");
 }
}