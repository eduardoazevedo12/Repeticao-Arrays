package Loop;
import java.util.Scanner;
public class NomeIdade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade;
        String nome;

        while(true) {
            System.out.println("Digite seu nome: ");
            nome = leia.next();
            if(nome.equals("0"))break;

            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();

        }
        System.out.println("Contiua...");
    }

}
