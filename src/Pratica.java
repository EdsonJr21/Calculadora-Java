import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe responsável pelas operações matemáticas.
 */
public class Pratica {
    private Scanner scanner;

    /**
     * Construtor que recebe o Scanner como parâmetro.
     * @param scanner Scanner para entrada do usuário.
     */
    public Pratica(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Método que executa a lógica principal da calculadora.
     */
    public void executar() {
        while (true) {
            try {
                System.out.println("Escolha a operação: (+, -, *, /) ou 's' para sair:");
                String operacao = scanner.next();

                if (operacao.equalsIgnoreCase("s")) {
                    System.out.println("Saindo do programa");
                    break;
                }

                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;
                boolean operacaoValida = true;
                switch (operacao) {
                    case "+":
                        resultado = somar(num1, num2);
                        break;
                    case "-":
                        resultado = subtrair(num1, num2);
                        break;
                    case "*":
                        resultado = multiplicar(num1, num2);
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Erro: Não é possível dividir por zero. Tente novamente.");
                            operacaoValida = false;
                            break;
                        }
                        resultado = dividir(num1, num2);
                        break;
                    default:
                        System.out.println("Operação inválida. Tente novamente.");
                        operacaoValida = false;
                        break;
                }
                if (operacaoValida) {
                    System.out.println("O resultado de " + num1 + " " + operacao + " " + num2 + " é igual a " + resultado);
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números válidos. Tente novamente.");
                scanner.nextLine();
            }
        }
    }

    /**
     * Método que realiza a soma de dois números.
     * @param num1 Primeiro número.
     * @param num2 Segundo número.
     * @return Resultado da soma.
     */
    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Método que realiza a subtração de dois números.
     * @param num1 Primeiro número.
     * @param num2 Segundo número.
     * @return Resultado da subtração.
     */
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Método que realiza a multiplicação de dois números.
     * @param num1 Primeiro número.
     * @param num2 Segundo número.
     * @return Resultado da multiplicação.
     */
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Método que realiza a divisão de dois números.
     * @param num1 Primeiro número.
     * @param num2 Segundo número.
     * @return Resultado da divisão.
     */
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
