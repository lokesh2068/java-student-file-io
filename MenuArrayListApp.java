import java.util.ArrayList;
import java.util.Scanner;
public class MenuArrayListApp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Our dynamic list (can grow/shrink)
        ArrayList<String> items = new ArrayList<>();
        int choice;

        //Menu loop: keeps running until user chooses Exit (4)
        do{
            System.out.println("...........MENU.........");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. show all items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  //consume the leftover newline after nextInt()
            
            if(choice == 1){
                System.out.println("Enter item to add");
                String newItem = sc.nextLine();
                items.add(newItem);
                System.out.println("Added item: "+newItem);
            } else if(choice ==2){
                if(items.isEmpty()){
                    System.out.println("List is empty. Nothing to remove.");
                } else {
                    System.out.println("Enter item to remove:");
                    String removeItem = sc.nextLine();

                    boolean removed = items.remove(removeItem);
                    if(removed){
                        System.out.println("Removed Item: "+removeItem);
                    } else{
                        System.out.println("Item not found: "+removeItem);
                    }

                }     
            } else if (choice ==3){
                if(items.isEmpty()){
                    System.out.println("No items to show( List os empty).");
                }else{
                    System.out.println("All Items:");

                    for(String item: items){
                        System.out.println("-"+item);
                    }
                }

            } else if (choice == 4){

                System.out.println("Exiting....Goodbye!!");
            } else{
                System.out.println("Invalid choice. please enter1-4");
            }

        } while (choice !=4);
        sc.close();
    }
}