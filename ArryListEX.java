import java.util.ArrayList;
public class ArryListEX{
    public static void main(String [] args ){
        ArrayList<String> names = new ArrayList<>();
        names.add("lokesh");
        names.add("Prerana");
        names.add("Sita");
        names.add("Ram");
        names.add("salman");
      
        System.out.println("ALL names: ");
        for (String name:names){
            System.out.println(name);
        }
        names.remove("salman");

        System.out.println("After removing one name: ");

        for(String name: names){
            System.out.println(name);
        }

    }
}