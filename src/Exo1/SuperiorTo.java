package Exo1;

public class SuperiorTo implements Condition{
    private int ref;

    public SuperiorTo(int ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "(Superior to > " + ref + ")";
    }

    public boolean verif(int nb) {
        return (nb > ref);
    }

    public String result(int nb) {
        if (verif(nb)) {
            return (nb + " is superior to " + ref);
        } else {
            return (nb + " is not superior to " + ref);
        }
    }
}
