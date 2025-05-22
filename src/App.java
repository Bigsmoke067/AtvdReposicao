import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Cifra de Vigenère ===");

        System.out.print("Digite a chave de criptografia (somente letras): ");
        String chave = scanner.nextLine().toUpperCase();
        scanner.close();
        Mecanismo mec = new Mecanismo(chave);
        String entradaTexto = "texto/entradaTexto.txt";
        String saidaCripto = "texto/saidaCripto.txt";
        mec.executarCripto(entradaTexto, saidaCripto);
        String saidaDecripto = "texto/saidaDecripto.txt";
        mec.executarDecripto(saidaCripto, saidaDecripto);
    }
}