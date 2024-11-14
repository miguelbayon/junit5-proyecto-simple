import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculadoraSimple {

    @Test
    public void test01() {
        CalculadoraSimple calculadora = new CalculadoraSimple();
        assertEquals(4, calculadora.sumar(3, 2));
    }
    
}
