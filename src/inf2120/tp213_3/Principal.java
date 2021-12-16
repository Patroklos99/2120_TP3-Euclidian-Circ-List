package inf2120.tp213_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Principal {
    public static void main(String[] args) {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 12 );
        c.inserer( 11 );
        c.inserer( 10 );

        ListeEuclidienne<Integer> c2 = new ListeEuclidienne<>();

        c2.inserer( 16 );
        c2.inserer( 15 );

        System.out.println(c2.lire());
        System.out.println(c);
    }

}
