package Loop;

import java.util.Scanner;

public class ParImpar  {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int quantNumeros;
        int numero;
        int contador=0;
        int par=0, impar=0;
        System.out.println("Informe a quantidade de números: ");
        quantNumeros= leia.nextInt();
        System.out.println("A quantidade de números é:"+quantNumeros);

        do{
            System.out.println("Digite algum número: ");
            numero=leia.nextInt();
            if((numero%2==0)){
                par++;
            }else{
                impar++;
            }
            contador++;
        }while(contador<quantNumeros);
        System.out.println("A quantidade de números pares digitados foi: "+par);
        System.out.println("A quantidade de números ímpares digitados foi: "+impar);


    }
}
