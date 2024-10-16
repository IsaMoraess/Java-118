/*a) Imagine que você está tentando fazer um jogo de luta medieval com canhões, e tenta simular a realidade. Para isso você precisa utilizar equações da física para determinar o alcance da bala docanhão. Imagine também que o alvo está a 300 metros do canhão e tem 50 metros de comprimento. Faça um programa que calcula o alcance a partir da velocidade de lançamento e do ângulo de tiro, e verifica se o tiro acertará alguma parte do alvo.
// Fórmula para calcular o alcance do tiro de canhão:
// alcance = (V0^2 * sin(2 * θ)) / g
// Onde:
// V0 = velocidade inicial (em metros por segundo)
// θ = ângulo de lançamento (em radianos)
// g = aceleração da gravidade (9,8 m/s²)
Crie uma classe com um método com duas variáveis de instância: velocidade e ângulo, depois crie os métodos gets e sets para cada um desses campos da classe, crie também um método que calcula eretorna o alcance.Crie outra classe com o método main que lê os valores da velocidade e ângulo e chama o método da primeira classe que calcula o alcance. Por fim mostre a informação se atingiu o alvo ou não. */

public class Canhao {
    private double velocidade; // Velocidade inicial do tiro de canhão (V0)
    private double angulo;     // Ângulo de lançamento (em graus)

    // Construtor da classe Canhao
    public Canhao(double velocidade, double angulo) {
        this.velocidade = velocidade; // É utilizada para diferenciar entre os atributos da instância (variáveis da classe) e os parâmetros locais (variáveis passadas como argumento para o método ou construtor).
        this.angulo = angulo;
    }
    // Getters e Setters para velocidade e angulo
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public double getAngulo() {
        return angulo;
    }
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    // Método que calcula o alcance do tiro de canhão
    public double calculaAlcance() {
        double g = 9.8; // Aceleração da gravidade em m/s²
        double anguloRadianos = Math.toRadians(angulo); // Converte o ângulo de graus para radianos

        // Fórmula do alcance
        double alcance = (Math.pow(velocidade, 2) * Math.sin(2 * anguloRadianos)) / g;
        return alcance;
    }
}
