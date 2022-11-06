public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3,6);
        Calculadora.substracao(9, 1.5);
        Calculadora.multiplicacao(10, 5);
        Calculadora.divisao(5, 0);
        Calculadora.divisao(42, 2);
    
        //Mensagem
        System.out.println("Exercício mensagem de saudação:");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(3);
        Mensagem.obterMensagem(30);

        //Emprestimo
        System.out.println("Exercício empréstimo:");
        Emprestimo.emprestimo(5000, 3.55, 120);

    }
}
