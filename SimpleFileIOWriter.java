import java.io.FileWriter;
import java.io.IOException;
public class SimpleFileIOWriter{
    public static void main(String [] args){
        String name = "prerana";
        int age = 28;
        String country = "Nepal";
        try{
            FileWriter writer = new FileWriter("profile.txt",true);
            writer.write("Name: "+name+"\n");
            writer.write("Age: "+age+"\n");
            writer.write("country: "+country+"\n");
            writer.close();
            System.out.println("Profile saved successfully!!");
        } catch(IOException e){
            System.out.println("Error writing to file!");
        }

    }
}