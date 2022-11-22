package generation.italy.animals;

public class LittleSparrow extends Animal {
    public LittleSparrow(String name) {
        category = "Passerotto";
        this.name = name;
    }

    @Override
    public void animalCall() {
        System.out.println("My name is Jack, Jack Sparrow!");
    }

    @Override
    public void eat() {
        System.out.println("Pirates");
    }
}
