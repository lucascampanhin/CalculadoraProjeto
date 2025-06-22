import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(5, calc.somar(2, 3));
        assertEquals(-1, calc.somar(-2, 1));
        assertEquals(0, calc.somar(0, 0));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2));
        assertEquals(-3, calc.subtrair(-2, 1));
        assertEquals(0, calc.subtrair(0, 0));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-2, calc.multiplicar(-2, 1));
        assertEquals(0, calc.multiplicar(0, 10));
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(-4, 2));
    }

    @Test

    void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
    //System.out.println("Rodando o teste de soma...");

}