class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("Cow moos");
    }
}
public class InheritanceExample {
    public static void main(String[] args){
        Animal a;
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();

    }
}
