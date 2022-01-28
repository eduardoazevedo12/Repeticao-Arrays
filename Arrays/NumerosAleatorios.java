package Arrays;

import java.util.Random; //pra gerar numeros aleatorios

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random= new Random();
        int numAleatorios[]= new int[20];
        for (int i=0; i<numAleatorios.length;i++){
            int numero= random.nextInt(100);
            numAleatorios[i]=numero;
        }
        System.out.print("                 Numeros Aleatorios: ");
        for (int numero  : numAleatorios  ) {
            System.out.print(numero +" ");
        } System.out.print("\n Sucessores  dos Numeros Aleatorios: ");
        for (int numero  : numAleatorios  ) {
            System.out.print((numero+1) +" ");
        }System.out.print("\nAntecessores dos Numeros Aleatorios: ");
        for (int numero  : numAleatorios  ) {
            System.out.print((numero-1) +" ");
        }
    }
}
