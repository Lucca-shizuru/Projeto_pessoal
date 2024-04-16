import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner ( System.in);
       double valor = 50;


       System.out.print("Quantos numeros voce utilizou? ");
        int tempo = sc.nextInt();
        if( tempo > 100){
            valor = valor + ( tempo - 100 ) * 2;

            System.out.println("Valor a pagar R$" + valor );
        }
        else {
            System.out.println("Valor a pagar R$" + valor );
        }


        sc.close();
    }

}