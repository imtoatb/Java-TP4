package Exo2;

public class Zoo {
    private Animal[] animals;

    public Zoo(){
        this.animals = new Animal[20];
    }


    int cpt = 0;
    public void add(Animal animal){
        animals[cpt++] = animal;
    }

    int j;
    @Override
    public String toString(){
        String s= "";
        for (j = 0; j < animals.length; j ++){
            if (animals[j] != null){
                s = s + animals[j].toString();
            }
        }

        return s;
    }
}
