public class Monkey extends LivingThing{
    public Monkey(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("Monkey " + getName() + " also walks...");
    }
}
