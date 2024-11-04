import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MegaSenaAppTest {
    @Test
    public void testGerarJogo() {
        Set<Integer> jogo = MegaSenaApp.gerarJogo();
        assertEquals(6, jogo.size(), "Um jogo deve conter exatamente 6 números.");
        for (int numero : jogo) {
            assertTrue(numero >= 1 && numero <= 60, "Os números devem estar entre 1 e 60.");
        }
    }
}