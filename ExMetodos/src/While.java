import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void WhileMesada()
    {
        double mesada = 50.0;

        while (mesada > 0)
        {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " Adicionado a o carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println ("Mesada: "+ mesada );
        System.out.println("Gastou toda mesada");
    }

    private  static  double valorAleatorio()
    {
        return  ThreadLocalRandom.current().nextDouble(2,8);
    }
}
