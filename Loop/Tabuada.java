package Loop;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        int numero;

        System.out.println("Escolha um número e irei multiplica-lo de 1 a 10:");
        numero= leia.nextInt();
        for(int i=1;i<=10;i++){
            int resultado=numero*i;
            System.out.println(numero+" x " +i+ " = "+resultado);
        }
    }
}
