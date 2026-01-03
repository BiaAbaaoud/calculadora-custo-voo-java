public class Voo {
    public String prefixo;
    public double hobbsInicial;
    public double hobbsFinal;
    public double tachInicial; // Nome correto aqui
    public double tachFinal;    // Nome correto aqui
    public double valorHora;
    public double desconto;

    public double calcularHorasACobrar() {
        double diffHobbs = hobbsFinal - hobbsInicial;
        double diffTach = tachFinal - tachInicial;
        return Math.max(diffHobbs, diffTach);
    }

    public double calcularTotal() {
        return (calcularHorasACobrar() * valorHora) - desconto;
    }
}