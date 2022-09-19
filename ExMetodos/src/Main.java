public class Main {
    public static void main(String[] args) {
        System.out.println("Excercicio calculadora");
        ExMetodos.Calculadora.soma(9,5);
        ExMetodos.Calculadora.subtracao(7,5);
        ExMetodos.Calculadora.multiplicacao(9,6);
        ExMetodos.Calculadora.divisao(9,3);

        espaco();

        HoraDia.horadia.hora(1);

        espaco();

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        espaco();

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        espaco();

        //Ultilizando FOR
        For.OlhandoFor();
        espaco();

        //For Com Array
        ForArray.ListaFor();

        espaco();

        While.WhileMesada();
    }

    private static void espaco() {
        System.out.println("===================================");
    }

}
