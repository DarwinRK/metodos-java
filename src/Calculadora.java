public class Calculadora {
    public static void soma (double numero1, double numero2) {
        double resultado = numero1+numero2;
        System.out.println(numero1+" + "+numero2+" = "+resultado);
    }

    public static void substracao (double numero1, double numero2) {
        double resultado = numero1-numero2;
        System.out.println(numero1+" - "+numero2+" = "+resultado);
    }

    public static void multiplicacao (double numero1, double numero2) {
        double resultado = numero1*numero2;
        System.out.println(numero1+" * "+numero2+"= "+resultado);
    }

    public static void divisao (double numero1, double numero2) {
        if (numero2 != 0) {
            double resultado = numero1/numero2;
            System.out.print(numero1+" / "+numero2+" = "+resultado);
        } else {
            System.out.println(numero1+" / "+numero2+" = Não é possível dividir por zero!");
                }
    }
}