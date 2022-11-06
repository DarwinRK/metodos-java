public class Emprestimo {
    public static void emprestimo (double valor, double taxa, int parcelas) {
        double juros = valor*(taxa/100)*parcelas;
        double valorPagar = juros+valor;
        System.out.println("Um empréstimo no valor de "+valor+", a uma taxa de "+taxa+" ao mês, divido em "+parcelas+" parcelas, resultará em uma dívida de: "+valorPagar);
        System.out.println("O montante de juros é: "+juros);
    }
}
