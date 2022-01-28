package Loop;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);

        int numero;
        int maior=0;
        int contador=0;
        int soma=0;
        do {
            System.out.println("Informe um número: ");
            numero=leia.nextInt();
            contador++;
            soma= soma+numero;
            if(numero>maior){
                maior=numero;
            }
        }while(contador<5);
        System.out.println("O maior número digitado foi:" +maior);
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+(soma/5));

    }
}
