public class Human extends LivingThing{
    public Human(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("Human " + this.getName() + " Walks...");
    }
}
