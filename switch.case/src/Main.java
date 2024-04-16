import java.util.Scanner ;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor corresponde ao dia da semana (1 a 7) ");
        int x = sc.nextInt();
        String dia;
        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terca";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Wuinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "valor invalido ";
                break;
        }
        System.out.print(" Dia da semana: "+ dia );


    }
}