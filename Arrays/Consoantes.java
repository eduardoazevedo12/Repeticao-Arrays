package Arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);

        String[] consoantes =new String[6];
        int quantConsoantes=0;
        int count=0;
        do{
            System.out.println("Letra: ");
            String letra = leia.next();
            if(!(letra.equalsIgnoreCase("a") | // ! sinal de inversão
            letra.equalsIgnoreCase("e")|
            letra.equalsIgnoreCase("i")|
            letra.equalsIgnoreCase("o")|
            letra.equalsIgnoreCase("u"))){
                consoantes[count]=letra;
                quantConsoantes++;
            }
            count++;
    }while(count<consoantes.length);
        System.out.println("Consoantes: ");
        //FOREACH para cada elemento dentro desse array de consoantes execute {}
        for ( String consoante:consoantes ) {
            if (consoante!=null){
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nQuantidade de consoantes: "+quantConsoantes);
    }
}

