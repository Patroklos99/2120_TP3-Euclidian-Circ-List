package inf2120.tp213_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Principal {
    public static void main(String[] args) {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );


        c.inserer( 11 );
        System.out.println("Tête -> " + c.lire());
        System.out.println("1: " + c);

        c.avancer();
        System.out.println("Tête -> " + c.lire());
        System.out.println("2: " + c);
        c.inserer( 12 );
        System.out.println("Tête -> " + c.lire());
        System.out.println(c);


        c.avancer();
        assertEquals( 10, c.lire() );
        c.avancer();
        assertEquals( 11, c.lire() );
        c.avancer();
        assertEquals( 12, c.lire() );
        System.out.println("Tête -> " + c.lire());
    }

}
