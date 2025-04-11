package Exo1;

public class MultipleOf implements Condition{
    private int n;

    public MultipleOf(int n){
        this.n = n;
    }

    @Override
    public String toString(){
        return("(Multiple of " + n + ")");
    }

    public boolean verif(int nb){
        return (nb % n == 0);
    }

    public String result(int nb){
        if (verif(nb)){
            return (nb + " is a multiple of " + n);
        } else {
            return (nb + " is not a multiple of " + n);
        }
    }
}
