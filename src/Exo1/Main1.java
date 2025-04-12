package Exo1;

public class Main1 {
    public static void main(String[] args) {
        MultipleOf n = new MultipleOf(3);
        System.out.println(n);
        System.out.println(n.verif(9));
        System.out.println(n.result(9));
        System.out.println(n.verif(10));
        System.out.println(n.result(10));
        System.out.println("\n");



        SuperiorTo s = new SuperiorTo(5);
        System.out.println(s);
        System.out.println(s.verif(9));
        System.out.println(s.result(9));
        System.out.println(s.verif(4));
        System.out.println(s.result(4));
        System.out.println("\n");

        IncludedInterval i = new IncludedInterval(5, 10);
        System.out.println(i);
        System.out.println(i.verif(9));
        System.out.println(i.result(9));
        System.out.println(i.verif(4));
        System.out.println(i.result(4));
        System.out.println("\n");

        Condition[] cond = new Condition[3];

        cond[0] = new MultipleOf(2);
        cond[1] = new SuperiorTo(6);
        cond[2] = new IncludedInterval(1, 9);

        int j;
        for (j = 0; j < cond.length;j++){
            System.out.println(cond[j]);
            System.out.println(cond[j].verif(9));
            System.out.println(cond[j].result(9));
            System.out.println("\n");
        }



    }
}