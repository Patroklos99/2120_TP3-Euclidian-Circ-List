package inf2120.tp213_3;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ListeEuclidienneTest {

    // estVide
    @Test
    void estVide1() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        assertTrue( c.estVide() );
    }

    // inserer, estVide
    @Test
    void inserer1Element() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );

        assertFalse( c.estVide() );
    }

    // taille
    @Test
    void taille0() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        assertEquals( 0, c.taille() );
    }

    // inserer, taille
    @Test
    void inserer2Elements() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 10 );

        assertEquals( 2, c.taille() );
    }

    // inserer, taille
    @Test
    void inserer5Elements() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 10 );
        c.inserer( 10 );
        c.inserer( 10 );
        c.inserer( 10 );

        assertEquals( 5, c.taille() );
    }

    @Test
    void lireLanceException() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        assertThrows( NoSuchElementException.class, () -> c.lire() );
    }

    @Test
    void lireNeLancePasException() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );

        assertDoesNotThrow( () -> c.lire() );
    }

    @Test
    void lire1element() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );

        assertEquals( 10, c.lire() );
    }

    @Test
    void lire2elements() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 11 );

        assertEquals( 11, c.lire() );
    }

    @Test
    void lire5elements() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 11 );
        c.inserer( 12 );
        c.inserer( 13 );
        c.inserer( 14 );

        assertEquals( 14, c.lire() );
    }

    @Test
    void avancerLanceException() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        assertThrows( ListeVideException.class, () -> c.avancer() );
    }

    @Test
    void avancerNeLancePasException() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );

        assertDoesNotThrow( () -> c.avancer() );
    }

    @Test
    void avancer1element() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );

        c.avancer();
        assertEquals( 10, c.lire() );
        c.avancer();
        assertEquals( 10, c.lire() );
        c.avancer();
        assertEquals( 10, c.lire() );
    }

    @Test
    void avancer2elements() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 11 );

        c.avancer();
        assertEquals( 10, c.lire() );
        c.avancer();
        assertEquals( 11, c.lire() );
        c.avancer();
        assertEquals( 10, c.lire() );
        c.avancer();
        assertEquals( 11, c.lire() );
    }

    @Test
    void avancer3elements() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 11 );
        c.inserer( 12 );

        c.avancer();
        assertEquals( 11, c.lire() );
        c.avancer();
        assertEquals( 10, c.lire() );
        c.avancer();
        assertEquals( 12, c.lire() );
        c.avancer();
        assertEquals( 11, c.lire() );
    }

    @Test
    void insererAvancer3elements() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        assertEquals( 10, c.lire() );

        c.inserer( 11 );
        assertEquals( 11, c.lire() );
        c.avancer();
        assertEquals( 10, c.lire() );

        c.inserer( 12 );
        assertEquals( 12, c.lire() );

        c.avancer();
        assertEquals( 10, c.lire() );
        c.avancer();
        assertEquals( 11, c.lire() );
        c.avancer();
        assertEquals( 12, c.lire() );
    }

    @Test
    void getDirection() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        assertEquals( ListeEuclidienne.Direction.HORAIRE, c.getDirection() );
    }

    @Test
    void getDirectionInsererLire() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.lire();

        assertEquals( ListeEuclidienne.Direction.HORAIRE, c.getDirection() );
    }

    @Test
    void getDirectionInsererAvancer() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.avancer();

        assertEquals( ListeEuclidienne.Direction.HORAIRE, c.getDirection() );
    }

    @Test
    void inverser() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inverser();

        assertEquals( ListeEuclidienne.Direction.ANTIHORAIRE, c.getDirection() );
    }

    @Test
    void inverserDouble() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inverser();
        c.inverser();

        assertEquals( ListeEuclidienne.Direction.HORAIRE, c.getDirection() );
    }

    @Test
    void ecrireLanceException() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        assertThrows( ListeVideException.class, () -> c.ecrire( 10 ) );
    }

    @Test
    void ecrireNeLancePasException() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );

        assertDoesNotThrow( () -> c.ecrire( 20 ) );
    }

    @Test
    void ecrire1case() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.ecrire( 20 );

        assertEquals( 20, c.lire() );
        assertEquals( 1, c.taille() );
        assertEquals(ListeEuclidienne.Direction.HORAIRE, c.getDirection() );
    }

    @Test
    void ecrire2case() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.ecrire( 20 );
        c.inserer( 11 );
        c.ecrire( 21 );

        assertEquals( 21, c.lire() );
        c.avancer();
        assertEquals( 20, c.lire() );
    }

    @Test
    void ecrire3fois2case() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.ecrire( 20 );
        c.inserer( 11 );
        c.ecrire( 21 );
        c.avancer();
        c.ecrire( 22 );

        assertEquals( 22, c.lire() );
        c.avancer();
        assertEquals( 21, c.lire() );
    }

    @Test
    void supprimerLanceException() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        assertThrows( ListeVideException.class, () -> c.supprimer() );
    }

    @Test
    void supprimerNeLancePasException() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );

        assertDoesNotThrow( () -> c.supprimer() );
    }

    @Test
    void supprimer1vers0() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.supprimer();

        assertTrue( c.estVide() );
    }

    @Test
    void supprimer2vers1() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 11 );
        c.supprimer();

        assertEquals( 1, c.taille() );
        assertEquals( 10, c.lire() );
    }

    @Test
    void supprimer2vers0() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 11 );
        c.supprimer();
        c.supprimer();

        assertTrue( c.estVide() );
    }

    @Test
    void supprimer3vers2() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 11 );
        c.inserer( 12 );

        c.supprimer();

        assertEquals( 2, c.taille() );
        assertEquals( 11, c.lire() );
        c.avancer();
        assertEquals( 10, c.lire() );
    }

    @Test
    void supprimer3vers1() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inserer( 10 );
        c.inserer( 11 );
        c.inserer( 12 );

        c.supprimer();
        assertEquals( 11, c.lire() );

        c.supprimer();
        assertEquals( 10, c.lire() );
    }

    @Test
    void supprimerinverse3vers1() {
        ListeEuclidienne<Integer> c = new ListeEuclidienne<>();

        c.inverser();

        c.inserer( 10 );
        c.inserer( 11 );
        c.inserer( 12 );

        c.supprimer();
        assertEquals( 11, c.lire() );

        c.supprimer();
        assertEquals( 10, c.lire() );

        assertEquals( ListeEuclidienne.Direction.ANTIHORAIRE, c.getDirection() );
    }



// A FAIRE ...

    //@Test
    void iterator() {
    }

}