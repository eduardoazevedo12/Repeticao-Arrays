package Arrays;
// mostrando a ordem inversa de posições de um vetor
public class OrdemInversa {
    public static void main(String[] args) {
        int vet[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Vetor: ");
        for(int i=0;i<(vet.length);i++){
            System.out.print(vet[i]+ " ");
        }
        System.out.println("\nVetor Inverso: ");
        for (int i = (vet.length-1); i >=0; i--) { // (vet.lenght) é o tamanho do vetor
            System.out.print(vet[i] + " ");            // nesse caso é 6 e o -1 é pq vetor tem
                                        //posição 0 até 5 resultando em 6 de tamanho
        }
    }
}
