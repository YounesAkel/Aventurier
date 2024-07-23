package com.example.aventurier;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AventurierTest {

//declaration des attributs et instansiation des classes Carte et Aventurier
    private Carte carte;
    private Aventurier aventurier;

    //JOUT LE ROLE PRESQUE D'UN CONSTRUCTEUR
    @BeforeEach
    public void setUp() throws IOException {
        carte = new Carte("src/test/resources/carte.txt");
        aventurier = new Aventurier(carte.getCarte());
    }


    //definition des testes unitaires
    @Test
    public void testDeplacement() {
        //implementation des parametres des fonctions
        aventurier.setPositionInitiale(3, 0);
        aventurier.deplacer("SSSSEEEEEENN");
        assertEquals("9,2", aventurier.getPosition());//le resultat attendu
    }

    @Test
    public void testDeplacement2() {
        //implementation des parametres des fonctions
        aventurier.setPositionInitiale(6, 9);
        aventurier.deplacer("OONOOOSSO");
        assertEquals("7,5", aventurier.getPosition());//le resultat attendu
    }
}

