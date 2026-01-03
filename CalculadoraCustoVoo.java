import java.util.Scanner;
import java.util.Locale;
import java.io.FileWriter;
import java.io.IOException;

public class CalculadoraCustoVoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Voo meuVoo = new Voo();

        System.out.println("=== SISTEMA AERONAUTICO V3.0 (O.O.) ===");

        System.out.print("Prefixo: ");
        meuVoo.prefixo = scanner.next();

        System.out.print("Hobbs Inicial e Final: ");
        meuVoo.hobbsInicial = scanner.nextDouble();
        meuVoo.hobbsFinal = scanner.nextDouble();

        System.out.print("Tach Inicial e Final: ");
        meuVoo.tachInicial = scanner.nextDouble(); // Corrigido para bater com a classe Voo
        meuVoo.tachFinal = scanner.nextDouble();   // Corrigido para bater com a classe Voo

        System.out.print("Valor Hora e Desconto: ");
        meuVoo.valorHora = scanner.nextDouble();
        meuVoo.desconto = scanner.nextDouble();

        // Gerando o relatório usando os métodos do objeto
        String relatorio = String.format(Locale.US,
            "--- FATURA OBJETO: %s ---\n" +
            "Horas Cobradas: %.1f\n" +
            "Total a Pagar: R$ %.2f\n" +
            "---------------------------",
            meuVoo.prefixo, meuVoo.calcularHorasACobrar(), meuVoo.calcularTotal()
        );

        System.out.println("\n" + relatorio);

        // Salvando o arquivo
        try (FileWriter writer = new FileWriter("fatura_" + meuVoo.prefixo + ".txt")) {
            writer.write(relatorio);
            System.out.println("[OK] Arquivo gerado via Objeto!");
        } catch (IOException e) {
            System.out.println("[ERRO] Falha ao salvar.");
        }

        scanner.close();
    }
}