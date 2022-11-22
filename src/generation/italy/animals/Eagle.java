package generation.italy.animals;

public class Eagle extends Animal{
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
}
