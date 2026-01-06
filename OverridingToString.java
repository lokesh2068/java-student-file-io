class Student{
    String name;
    int age;
    double grade;

    //constructor
    Student (String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

@Override
public String toString(){
    return "Student{name= "+name+" , age= "+age+" , grade= "+grade+" }";
    }
}
public class OverridingToString{
    public static void main(String[] args){
        Student s = new Student("Lokesh",28,4.0);
        System.out.println(s);
    }
}