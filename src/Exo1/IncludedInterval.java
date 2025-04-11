package Exo1;

public class IncludedInterval implements Condition{
    private int inf;
    private int sup;

    public IncludedInterval(int inf, int sup) {
        this.inf = inf;
        this.sup = sup;
    }

    @Override
    public String toString() {
        return "(Included in [" + inf + ", " + sup + "[)";
    }

    public boolean verif(int nb) {
        return (nb >= inf && nb < sup);
    }

    public String result(int nb) {
        if (verif(nb)) {
            return (nb + " is included in [" + inf + ", " + sup + "[");
        } else {
            return (nb + " is not included in [" + inf + ", " + sup + "[");
        }
    }
}
