package item1;

public class PetShop {
    public static void main(String[] args) {
        // Creating a Dog
        Pet dog = new Dog("Buddy", "John");
        System.out.println("Dog Name: " + dog.getPetName());
        System.out.println("Owner: " + dog.getOwner());
        System.out.println("Dog Sound: " + ((PetSound) dog).makeSound());
        System.out.println("Dog Eating: " + ((PetEating) dog).eat());
        System.out.println();

        // Creating a Cat
        Pet cat = new Cat("Whiskers", "Jane");
        System.out.println("Cat Name: " + cat.getPetName());
        System.out.println("Owner: " + cat.getOwner());
        System.out.println("Cat Sound: " + ((PetSound) cat).makeSound());
        System.out.println("Cat Eating: " + ((PetEating) cat).eat());
    }
}