package generation.italy.animals;

public class Dolphin extends Animal{
    public Dolphin(String name){
        category = "Delfino";
        this.name = name;
    }

    @Override
    public void animalCall() {
        System.out.println("Ah yes, Human!");
    }

    @Override
    public void eat() {
        System.out.println("Intelligence");
    }
}
