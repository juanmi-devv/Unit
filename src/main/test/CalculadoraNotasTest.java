import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
    public class CalculadoraNotasTest {
        @Test
        void mediaDeTresNotas() {
            double resultado = CalculadoraNotas.calcularMedia(6, 8, 10);
            assertEquals(8.0, resultado, 0.0001);
        }
        @Test
        void mediaNotasIguales() {
            double resultado = CalculadoraNotas.calcularMedia(5,5,5);
            assertEquals(5.0, resultado, 0.0001);
        }
        @Test
        void mediaNotasCero() {
            double resultado = CalculadoraNotas.calcularMedia(0,0,0);
            assertEquals(0.0, resultado, 0.0001);
        }
        @Test
        void mediaNota10() {
            double resultado = CalculadoraNotas.calcularNotaFinal(10,10);
            assertEquals(10.0, resultado, 0.0001);
        }

        @Test
        void notaFinalCorrecta() {
            double resultado = CalculadoraNotas.calcularNotaFinal(7, 9);
            assertEquals(7.8, resultado, 0.0001);
        }
        @Test
        void notaFinalSinPracticas() {
            double resultado =
                    CalculadoraNotas.calcularNotaFinal(10, 0);
            assertEquals(6.0, resultado, 0.0001);
        }
        @Test
        void notaFinalSinExamen() {
            double resultado =
                    CalculadoraNotas.calcularNotaFinal(0, 10);
            assertEquals(4.0, resultado, 0.0001);
        }
    }