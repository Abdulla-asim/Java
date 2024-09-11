public class DogsTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Tommy");
        cat.greets();

        Dog dog = new Dog("Rex");
        dog.greets();

        BigDog bigDog = new BigDog("Bull");
        bigDog.greets();
        
        dog.greets(dog);
        
        bigDog.greets(dog);
        
        bigDog.greets(bigDog);
    }
}

abstract class Animals {
    protected String name;

    public Animals(String name) { this.name = name; }

    public abstract void greets();
}

class Cat extends Animals{
    Cat (String name) { super(name); }

    @Override
    public void greets() { System.out.println("Mewo"); }
}

class Dog extends Animals {
    Dog(String name, String string) { super(name); }

    public Dog(String string) {
        super(string);
    }

    @Override
    public void greets() { System.out.println("Woof"); }

    public void greets(Dog another) { System.out.println("Woooof"); }

    public void sound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sound'");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public String getBreed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBreed'");
    }
}

class BigDog extends Dog {
    BigDog(String name) { super(name); }

    @Override
    public void greets() { System.out.println("Wooow");}

    @Override
    public void greets(Dog another) { System.out.println("Woooooow");}

    public void greets(BigDog another) { System.out.println("Wooooooooow");}
}



