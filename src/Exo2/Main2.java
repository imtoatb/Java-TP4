package Exo2;

public class Main2 {
    public static void main(String[] args){

        Dog dog1 = new Dog(10, "Dog1", "Master1");
        System.out.println(dog1.toString());
        System.out.println("\n");

        Animal animal = new Animal(20, "Duck");

        Dog dog2 = new Dog(15, "Dog2", "Master2");
        Dog dog3 = new Dog(25, "Dog3", "Master3");

        Cat cat1 = new Cat(7, "Cat1", "Race1");

        Animal[] animals = new Animal[5];
        animals[0] = dog1;
        animals[1] = animal;
        animals[2] = dog2;
        animals[3] = dog3;
        animals[4] = cat1;

        int j;
        for (j = 0; j < animals.length; j++){
            System.out.println(animals[j].toString());
        }
    }
}
