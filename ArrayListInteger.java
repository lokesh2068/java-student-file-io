import java.util.ArrayList;
public class ArrayListInteger{
    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(35);
        numbers.add(3);

        int sum = 0;

        for(int n: numbers){
            sum += n;
        }
        double average = (double)sum/numbers.size();
        int max = numbers.get(0);
        int min = numbers.get(0);

        for(int n:numbers){
            if(n>max){
                max = n;
            }
        }
        for (int n: numbers){
            if(n<min){
                min = n;
            }
        }
        System.out.println("All Numbers: "+ numbers );
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}