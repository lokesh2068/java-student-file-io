interface Flyable{
    void fly();
}
abstract class Bird{
    void eat(){
        System.out.println("Bird is eating");
    }
    abstract void sound();
}
class Eagle extends Bird implements Flyable{
    @Override
    public void fly(){
        System.out.println("Eagle is flying high");
    }
    @Override
    void sound(){
        System.out.println("Eagle screeches");
    }
}
public class InterfaceEX{
    public static void main(String [] args){
        Flyable f = new Eagle();
        f.fly();

        Bird b = new Eagle();
        b.eat();
        b.sound();
    }
}
