package com.example.aventurier;

public class Aventurier {
    private char[][] carte;
    private int x, y;

    public Aventurier(char[][] carte) {
        this.carte = carte;
    }

    public void setPositionInitiale(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplacer(String deplacements) {
        for (char direction : deplacements.toCharArray()) {
            switch (direction) {
                // pour chaque cas on teste si la case suivant est vide pour se deplacer
                case 'N': // Nord
                    if (x > 0 && carte[x - 1][y] == ' ') x--;
//on teste si la ligne superieur x-1 est vide pour se deplacer et x>0 pour s assurer que l aventurier n a pas depaser les bords de la carte
                    break;
                case 'S': // Sud
                    if (x < carte.length - 1 && carte[x + 1][y] == ' ') x++;
//on teste si la ligne inferieur x+1 est vide pour se deplacer et x < carte.length - 1 pour s assurer que l aventurier n a pas depaser les bords de la carte
                    break;
                case 'E': // Est
                    if (y < carte[0].length - 1 && carte[x][y + 1] == ' ') y++;
 //on teste si la case suivante est vide pour se deplacer et y < carte[0].length - 1 pour s assurer que l aventurier n a pas depaser les bords de la carte
                    break;
                case 'O': // Ouest
                    if (y > 0 && carte[x][y - 1] == ' ') y--;
 //on teste si la case precedante est vide pour se deplacer et y >0 pour s assurer que l aventurier n a pas depaser les bords de la carte
                    break;
            }
        }
    }

    public String getPosition() {
        return x + "," + y;
    }
}
