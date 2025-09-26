class Main{
public static void main(String [] args){
    Animal a=new Animal();
    Animal d =new Dog();
    Animal c =new Cat();
    a.Sound();
    d.Sound();
    c.Sound();

}
}

public class Animal{
    public void Sound(){
        System.out.println("Animal makes sound");
    }
}
public class Dog extends Animal{
    public void Sound(){
        System.out.println("Barks");
    }
}
public class Cat extends Animal{
    public void Sound(){
    System.out.println("mew mewm ewmewmewmemewm");
}
}
