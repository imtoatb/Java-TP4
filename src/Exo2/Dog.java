package Exo2;

public class Dog extends Animal{
    protected String master;

    public Dog(int weight, String name, String master){
        super(weight, name);
        this.master = master;
    }

    public String getMaster(){
        return master;
    }
    public void setMaster(String master){
        this.master = master;
    }

    @Override
    public String toString(){
        return "Dog{ master = " + master + ", name = " + name + ", weight = " + weight + "} \n";
    }
}
