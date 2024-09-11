public class DogTest {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        System.out.println("Name: " + myDog.getName());
        System.out.println("Breed: " + myDog.getBreed());
        myDog.sound();
    }
}
