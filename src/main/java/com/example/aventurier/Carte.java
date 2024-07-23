package com.example.aventurier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Carte {
    private char[][] carte;

    public Carte(String fichierCarte) throws IOException {
        List<String> lignes = Files.readAllLines(Paths.get(fichierCarte));
        int hauteur = lignes.size();
        int largeur = lignes.get(0).length();
        carte = new char[hauteur][largeur];

        for (int i = 0; i < hauteur; i++) {
            carte[i] = lignes.get(i).toCharArray();
        }
    }

    public char[][] getCarte() {
        return carte;
    }

    public void afficherCarte() {
        for (char[] ligne : carte) {
            for (char c : ligne) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

