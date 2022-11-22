package generation.italy.animals;

public abstract class Animal {
    protected String name;
    protected String category;

    public Animal(){

    }

    public void sleep(){
        System.out.println("zzz");
    }

    
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public abstract void animalCall();

    public abstract void eat();
}
