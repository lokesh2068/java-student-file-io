
class Person{
    void work(){
        System.out.println("Person works");
    }
}
class Doctor extends Person{
    @Override
    void work(){
        System.out.println("Doctor treats patients");
    }
}
class Engineer extends Person{
    @Override
    void work(){
        System.out.println("Engineer builds things");
    }
}
public class Polymorphism{
    public static void main(String[] args){
        Person[] people= { new Doctor(), new Engineer(), new Person()};
        for(Person p : people){
            p.work();
        }

    }
}



