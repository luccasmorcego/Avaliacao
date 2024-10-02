import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Me diga a quantidade de filmes: ");
        int quantidade = input.nextInt();
        int[] filmes = new int[quantidade];

        int soma = 0;
        int media = 0;

        for(int i = 1; i <= quantidade; i++){
            System.out.println("Me diga a avaliação dos filmes " + i);
            filmes[i-1] = input.nextInt();
            soma += filmes[i-1];
        }
        media = soma/quantidade;
        System.out.println("A soma das notas dos filmes é: " + soma);
        System.out.println("A media dos filmes é: " + media);

        int menorSeis = 0;
        int maiorSeis = 0;
        int invalidos = 0;
        for(int i = 0; i < quantidade; i++){
            if(filmes[i] >= 11 || filmes[i] < 0){
                invalidos+=1;
            } else if (filmes[i] >= 6) {
                maiorSeis+=1;
            } else if (filmes[i] < 6) {
                menorSeis+=1;
            }
        }
        System.out.println("A quantidade de filmes avaliados como bons é: " + maiorSeis);
        System.out.println("A quantidade de filmes avaliados como ruins é: " + menorSeis);
        System.out.println("A quantidade de notas inválidas (fora do intervalo 010) é " + invalidos);
    }
}