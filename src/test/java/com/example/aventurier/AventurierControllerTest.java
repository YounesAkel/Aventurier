package com.example.aventurier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AventurierControllerTest {

    @Autowired
    private MockMvc mockMvc;


    //definition des testes unitaires
    @Test
    public void testDeplacerAventurier() throws Exception {
        //definition des parametres que j'ai definit dans le controller
        mockMvc.perform(get("/deplacer")
                        .param("fichierCarte", "src/test/resources/carte.txt")
                        .param("startX", "3")
                        .param("startY", "0")
                        .param("mouvements", "SSSSEEEEEENN"))
                .andExpect(status().isOk())//resultat attendu
                .andExpect(content().string("Position finale: 9,2"));//resultat attendu
    }

    @Test
    public void testDeplacerAventurier2() throws Exception {
        //definition des parametres que j'ai definit dans le controller
        mockMvc.perform(get("/deplacer")
                        .param("fichierCarte", "src/test/resources/carte.txt")
                        .param("startX", "6")
                        .param("startY", "9")
                        .param("mouvements", "OONOOOSSO"))
                .andExpect(status().isOk())//resultat attendu
                .andExpect(content().string("Position finale: 7,5"));//resultat attendu
    }
}
