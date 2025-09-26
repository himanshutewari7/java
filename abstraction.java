abstract class Animal {
    public abstract void animalsound();

    public void sleep() {
        System.out.println("Zzzz");
    }
}

class Pig extends Animal {
    public void animalsound() {
        System.out.println("weee weew");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig mypig = new Pig();
        mypig.animalsound();
        mypig.sleep();
    }
}
