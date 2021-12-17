package inf2120.tp213_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Principal {
    public static void main(String[] args) {
        ListeEuclidienne<Integer> c2 = new ListeEuclidienne<>();

        c2.inserer( 1 );
        c2.inserer( 2 );
        c2.inserer( 3 );

        System.out.println(c2.lire());
    }

}
