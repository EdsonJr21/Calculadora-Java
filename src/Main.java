import java.util.Scanner;

/**
 * Classe principal que executa o programa.
 */
public class Main {

    public static void main(String[] args) {
        // Inicializa o Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        try {
            // Cria uma instância da classe Pratica
            Pratica calculadora = new Pratica(scanner);

            // Executa a lógica da calculadora
            calculadora.executar();
        } finally {
            // Fecha o Scanner após o uso
            scanner.close();
        }
    }
}
