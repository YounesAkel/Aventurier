package com.example.aventurier;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
    "java.vm.args=-Xshare:off"
})
class AventurierApplicationTests {
    @Test
    void contextLoads() {
    }
}