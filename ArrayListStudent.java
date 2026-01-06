import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListStudent{
    String name;
    int rollno;
    int marks;
    ArrayListStudent(String name, int rollno, int marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    void display(){
        System.out.println("Name: "+name+", Roll: "+rollno+", Marks: "+marks);
    }
    public static void main(String [] args){
        
        //  Why we put the class name in <> ?
        // Because the list stores STUDENT OBJECTS, not their individual fields.
        // Each student object already "packages" name+rollno+marks together.
        ArrayList<ArrayListStudent> students = new ArrayList<>();

        // Adding objects:
        // Each new ArrayListStudent(...) creates ONE object (with name+roll+marks inside it)
        // ArrayList stores the REFERENCE to that object.
        students.add(new ArrayListStudent ("Lokesh",68,99));
        students.add(new ArrayListStudent("Prerana",1,100));
        students.add(new ArrayListStudent("Abigal", 20, 80));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number: ");
        int roll = sc.nextInt();

        boolean found = false;

        for(ArrayListStudent s: students){  // ArrayListStudent s  ← s holds ONE student object at a time
            if(s.rollno == roll){
                System.out.println("Student Found: ");
                s.display();  //  Calling an instance method on the object we found
                found = true;  //  mark found
                break;  //top searching after first match
            }
        }  //  !found means "NOT found"...If found is still false after loop, print not found message once
        if (!found){
            System.out.println("Student with roll number"+roll+"not found...");
        }  
        sc.close();
    
    }
}