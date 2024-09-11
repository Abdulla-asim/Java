public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void sound() {
        System.out.println("A Dog barks");
    }

    public String getBreed() {
        return breed;
    }

}
