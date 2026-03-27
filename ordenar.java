import java.util.Random;
import java.util.Scanner;

public class ordenar {
    public static void main(String[] args) {
        int Escolha, posicao = 0, i, j = 0, aux;
        int[] vet = new int[30];
        Random random = new Random();
        while(posicao < 30)
        {
            vet[posicao] = random.nextInt(100) + 1;
            posicao++;
        }
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.printf("Deseja organizar de forma:\n");
        System.out.printf("(1) Crescente\n");
        System.out.printf("(2) Decrescente\n");
        System.out.printf("Opção:");
        Escolha = scan.nextInt();
        if (Escolha == 1)
        {
            for (j = 0; j < vet.length - 1; j++)
            {
                for (i = 0; i < vet.length - j - 1; i++)
                {
                    if (vet[i] > vet[i + 1])
                    {
                        aux = vet[i];
                        vet[i] = vet[i + 1];
                        vet[i + 1] = aux;
                    }
                }
            }
        }
        else if (Escolha == 2)
        {
            for (j = 0; j < vet.length - 1; j++)
            {
                for (i = 0; i < vet.length - j - 1; i++)
                {
                    if (vet[i] < vet[i + 1])
                    {
                        aux = vet[i];
                        vet[i] = vet[i + 1];
                        vet[i + 1] = aux;
                    }
                }
            }
        }
        for (j = 0; j < posicao; j++)
        {
            System.out.printf("%d ", vet[j]);
        }
        scan.close();
    }
}
