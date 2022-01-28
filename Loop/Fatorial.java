package Loop;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int numero;
        int multiplicacao=1;
        System.out.println("Informe um número e eu farei seu fatorial: ");
        numero= leia.nextInt();
        System.out.print(numero+ "! = ");

        for (int i=numero;i>=1;i--){
            multiplicacao=multiplicacao*i;
        }
        System.out.println(multiplicacao);

    }
}
