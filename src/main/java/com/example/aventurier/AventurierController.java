package com.example.aventurier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AventurierController {

    @GetMapping("/deplacer")
    public String deplacerAventurier(@RequestParam String fichierCarte, @RequestParam int startX, @RequestParam int startY, @RequestParam String mouvements) throws IOException {
        Carte carte = new Carte(fichierCarte);
        Aventurier aventurier = new Aventurier(carte.getCarte());
        aventurier.setPositionInitiale(startX, startY);
        aventurier.deplacer(mouvements);
        return "Position finale: " + aventurier.getPosition();
    }
}
/*=============exemple d'une url pour tester ====================

http://localhost:8080/deplacer?fichierCarte=src/test/resources/carte.txt&startX=6&startY=9&mouvements=SSNNEEOO

 */