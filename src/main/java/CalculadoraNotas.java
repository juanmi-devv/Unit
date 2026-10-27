public class CalculadoraNotas {
    public static double calcularMedia(
            double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public static double calcularNotaFinal(
            double examen, double practicas) {
        double parteExamen = examen * 0.6;
        double partePracticas = practicas * 0.4;
        return parteExamen + partePracticas;
    }
}