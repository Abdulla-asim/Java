public class AnimalTest {
    public static void main(String[] args) {
        Goose goose = new Goose();
        Airplane airplane = new Airplane();

        goose.speak();
        goose.move();
        goose.fly();

        airplane.fly();

        Flying flyingGoose = goose;
        Flying flyingAirplane = airplane;

        flyingGoose.fly();
        flyingAirplane.fly();
    }
    
}

abstract class Animal {
    public Animal(String name) {
        //TODO Auto-generated constructor stub
    }

    public void speak() {
        System.out.println("This animal speaks");
    }

    public void move() {
        System.out.println("This animal moves forward");
    }
}

interface Flying {
    void fly();
}

class Goose extends Animal implements Flying {
    public Goose(String name) {
        super(name);

    }

    public Goose() {
        super("Goose");
    }

    @Override
    public void speak() {
        System.out.println("The goose speaks");
    }

    @Override
    public void move() {
        System.out.println("The goose moves forward");
    }

    @Override
    public void fly() {
        System.out.println("The goose flies gracefully");
    }
}

class Lynx extends Animal {
    public Lynx(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("The lynx speaks");
    }

    @Override
    public void move() {
        System.out.println("The lynx moves forward");
    }
}


class Airplane implements Flying {
    @Override
    public void fly() {
        System.out.println("The airplane soars through the sky");
    }
}

