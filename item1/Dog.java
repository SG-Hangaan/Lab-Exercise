package item1;

public class Dog extends Pet implements PetSound, PetEating {
    public Dog(String petName, String owner) {
        super(petName, owner);
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String eat() {
        return "Eating dog food.";
    }
}