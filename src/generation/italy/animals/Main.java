package generation.italy.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Dog("Bastardino");
        animals[1] = new Dolphin("Dolphin il delfino");
        animals[2] = new Eagle("America");
        animals[3] = new LittleSparrow("Jack");

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Category: " + animals[i].getCategory());
            System.out.println("Name: " + animals[i].getName());
            System.out.printf("Animal Call: ");
            animals[i].animalCall();
            System.out.printf("What eat: ");
            animals[i].eat();
            System.out.println("-----------------------------------");
        }

        Dolphin dolph = new Dolphin("Delfino Solitario");
        makeSwim(dolph);
        Eagle eagle = new Eagle("MyBrother");
        makeFly(eagle);
    }

    static void makeFly(IVolante animal){
        animal.fly();
    }

    static void makeSwim(INuotante animal){
        animal.swim();
    }
}
