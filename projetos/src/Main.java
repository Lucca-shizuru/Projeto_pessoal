import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double largura, comprimento, area, preco, metroQuadrado, x, y ;

        System.out.print("Escreva a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.print("Escreva o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.print("Escreva o preco do metro quadrado do terreno: ");
        metroQuadrado = sc.nextDouble();
        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.println("Area= " + area);
        System.out.println("Preco=" + preco );



        sc.close();








    }
}