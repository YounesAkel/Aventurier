package com.example.aventurier;



import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class CarteTest {

    //definition des testes unitaires
    @Test
    public void testLectureCarte() throws IOException {
        Carte carte = new Carte("src/test/resources/carte.txt");
        assertNotNull(carte.getCarte());
        assertEquals(20, carte.getCarte().length);//le resultat attendu
    }

    @Test
    public void testAfficherCarte() throws IOException {
        Carte carte = new Carte("src/test/resources/carte.txt");
        carte.afficherCarte();
        // on peut ajouter des assertions ici pour vérifier la sortie si nécessaire
    }
}
