package inf2120.tp213_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Principal {
    public static void main(String[] args) {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 11 );
        c.inserer( 12 );
        System.out.println(c);
    }

}
