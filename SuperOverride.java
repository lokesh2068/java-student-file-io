class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    // Overriding method
    @Override
    public void sound(){
        // First call parent method
        super.sound();

        // Then add Dog's own behavior

        System.out.println("Dog barks: Woof Woof!!");
        }
    }
public class SuperOverride{
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();   // Calls Dog's version
    }
}
