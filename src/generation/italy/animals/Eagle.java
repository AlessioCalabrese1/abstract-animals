package generation.italy.animals;

public class Eagle extends Animal implements IVolante{
    public Eagle(String name){
        category = "Aquila";
        this.name = name;
    }

    @Override
    public void animalCall() {
        System.out.println("AMERICA FUCK YEAH!");
        
    }

    @Override
    public void eat() {
        System.out.println("I can't tell");
    }

    @Override
    public void fly() {
        System.out.println("I CAN FLY!");
    }
}
