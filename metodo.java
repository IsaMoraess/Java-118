import java.util.Scanner;

public class metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados: velocidade e ângulo
        System.out.print("Informe a velocidade de lançamento (em m/s): ");
        double velocidade = sc.nextDouble();

        System.out.print("Informe o ângulo de lançamento (em graus): ");
        double angulo = sc.nextDouble();

        // Cria o objeto da classe Canhao
        Canhao canhao = new Canhao(velocidade, angulo);

        // Calcula o alcance do tiro de canhão
        double alcance = canhao.calculaAlcance();
        System.out.printf("O alcance do tiro de canhão foi de: %.2f metros%n", alcance);

        // Verifica se o tiro acertou o alvo
        double alvoInicio = 300.0; // O alvo começa a 300 metros
        double alvoFim = 350.0;    // O alvo termina a 350 metros (300 + 50 metros de comprimento)

        if (alcance >= alvoInicio && alcance <= alvoFim) {
            System.out.println("O tiro acertou o alvo!");
        } else {
            System.out.println("O tiro não acertou o alvo.");
        }
    }
}
