package inf2120.tp213_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Principal {
    public static void main(String[] args) {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        System.out.println(c.lire());

        c.inserer( 11 );
        System.out.println(c.lire());
        System.out.println("here" + c);

        c.avancer();
        System.out.println(c.lire());
        System.out.println("here" + c);
        c.inserer( 12 );
        System.out.println(c.lire());
        System.out.println(c);


        c.avancer();
        System.out.println(c.lire());
        c.avancer();
        assertEquals( 11, c.lire() );
        c.avancer();
        assertEquals( 12, c.lire() );

    }

}
