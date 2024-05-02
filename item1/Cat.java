package item1;

public class Cat extends Pet implements PetSound, PetEating {
    public Cat(String petName, String owner) {
        super(petName, owner);
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String eat() {
        return "Eating cat food.";
    }
}