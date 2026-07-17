public class CalculadoraCientifica {
    // Método para somar (a somado a b)
    public double somar (double a, double b) {
        return a + b; 
    }

    // Método para potência (x elevado a y) 
    public double potencia (double x, double y) {
        return Math.pow(x, y); // Contextualização no arquivo 'Anotacoes.md'
    }

    // Método para raiz quadrada (raiz quadrada de x)
    public double raizQuadrada (double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(x); // Contextualização no arquivo 'Anotacoes.md' 
    }

}