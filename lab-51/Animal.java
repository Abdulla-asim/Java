public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("An Animal makes a sound");
    }

    public String getName() {
        return name;
    }
}
