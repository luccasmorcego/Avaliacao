import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de eleitores: ");
        int eleitores = input.nextInt();

        int taffe = 0;
        int rodrigo = 0;
        int lucas = 0;
        int alessandro = 0;
        int[] votos = {taffe, rodrigo, lucas, alessandro};

        String[] Candidatos = {
                "Taffe - 99",
                "Rodrigo - 88",
                "Lucas - 77",
                "Alessandro - 66"
        };

        System.out.println("Os candidatos são:");
        for (int i = 0; i < 4; i++) {
            System.out.println(Candidatos[i]);
        }
        int voto = 0;
        int[] numsCandidatos = {99, 88, 77, 66};
        for (int i = 0; i < eleitores; i++) {
            boolean esta = false;
            while (!esta) {System.out.println("Votante - " + i + " - Digite o número de seu candidato:");
                voto  = input.nextInt();
                for (int j = 0; j < numsCandidatos.length; j++) {
                    if (voto == numsCandidatos[j])
                        esta = true;

                }
                if (!esta){System.out.println("Digite um candidato válido");}


            switch (voto){
                case 99:
                    votos[0] +=1;
                    break;
                case 88:
                    votos[1] +=1;
                    break;
                case 77:
                    votos[2] +=1;
                    break;
                case 66:
                    votos[3] +=1;
                    break;
                default:
                    break;
            }


        }
        System.out.println("Votos de cada candidato: ");
        for (int j = 0; j < Candidatos.length; j++) {
            System.out.println(Candidatos[j] + ": " + votos[j]);
        }
    }
}
}



