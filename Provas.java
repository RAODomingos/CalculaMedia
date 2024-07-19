import java.util.Scanner;

public class Provas {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de provas:");
        int qntProvas  = Integer.parseInt(sc.nextLine());

        // Inicia Variaveis
        int somaNotas = 0;
        int menorNota = 100;
        int maiorNota = 0;


        for(int i=1; i <= qntProvas; i++){
            System.out.println("Informe a nota da prova: " + i + " do aluno (0 - 100)");
            int nota = Integer.parseInt(sc.nextLine());

            somaNotas += nota;

            // Atualiza a menor nota.
            if(nota < menorNota){
                menorNota = nota;
            }

            // Atualiza a Maior nota.
            if(nota > maiorNota){
                maiorNota = nota;
            }

        }

        //Media
        int media = somaNotas / qntProvas;

        //imprime resultado
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A Maior nota é: " + maiorNota);
        System.out.println("A Media nota é: " + media);


    sc.close();
    }


}