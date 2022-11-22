package generation.italy.animals;

public class Dog extends Animal{
    
    public Dog(String name){
        category = "Cane";
        this.name = name;
    }

    public void animalCall(){
        System.out.println("Bau BUFF");
    }

    public void eat(){
        System.out.println("Whatever enters the mouth");
    }
}
