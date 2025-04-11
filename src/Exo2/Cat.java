package Exo2;

public class Cat extends Animal{
    private String race;

    public Cat(int weight, String name, String race){
        super(weight, name);
        this.race = race;
    }

    public void getName(){
        System.out.println(name);
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Cat{ race = " + race + ", weight = " + weight + ", name = " + name  + "} \n";
    }
}
