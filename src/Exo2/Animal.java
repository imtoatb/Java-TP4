package Exo2;

public class Animal {
    protected int weight;
    protected String name;

    public Animal(int weight, String name){
        this.weight = weight;
        this.name = name;
    }

    public void getWeight(){
        System.out.println("Weight: " + weight);
    }

    public void getName(){
        System.out.println("Name : " + weight);
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Animal{weight = " + weight + ", name = " + name + "} \n";
    }
}
