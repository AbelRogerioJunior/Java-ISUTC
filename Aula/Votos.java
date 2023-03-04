import java.util.Scanner;

public class Votos
{
    public static void main(String[] args)
    {
        //Declaracso de classe
        Scanner ler = new Scanner(System.in);

        //Leitura do numero
        //Leitura de nomes de candidatos
           System.out.print("Nome do 1 candidato: ");
           String candidato1 = ler.nextLine();
        System.out.print("Nome do 2 candidato: ");
        String candidato2 = ler.nextLine();
        System.out.print("Nome do 3 candidato: ");
        String candidato3 = ler.nextLine();
        System.out.print("Nome do 4 candidato: ");
        String candidato4 = ler.nextLine();
        System.out.print("Nome do 5 candidato: ");
        String candidato5 = ler.nextLine();

        //declaracao de variaver
        int votocad1 = 0;
        int votocad2 = 0;
        int votocad3 = 0;
        int votocad4 = 0;
        int votocad5 = 0;


        System.out.println("Quantos alunos tem na sala? ");
        int alunos = ler.nextInt();
        System.out.printf("Qual candidato quer votar \n [1] - %s \n [2] - %s \n [3] - %s \n [4] - %s \n [5] - %s \n" ,candidato1,candidato2,candidato3,candidato4,candidato5);
        for(int i = 0; i < alunos;i++)
        {
            
            int voto = ler.nextInt();

            if(voto == 1)
            {
                votocad1++;
            }
            else if(voto == 2)
            {
                votocad2++;
            }
            else if (voto == 3)
            {
                votocad3++;
            }
            else if(voto == 4)
            {
                votocad4++;
            }
            else if(voto == 5)
            {
                votocad5++;
            }
        }


        //Imprimir na tela vencedor
        if((votocad1 > votocad2) && (votocad1>votocad3) && (votocad1>votocad4) && (votocad1> votocad5))
        {
            System.out.printf("O vencedor e o %s com %d votos",candidato1,votocad1);
        }
        else if((votocad2> votocad1) && (votocad2>votocad3) && (votocad2>votocad4) && (votocad2> votocad5))
        {
            System.out.printf("O vencedor e o %s com %d votos",candidato2,votocad2);
        }
        else if((votocad3 > votocad1) && (votocad3>votocad2) && (votocad3>votocad4) && (votocad3> votocad5))
        {
            System.out.printf("O vencedor e o %s com %d votos",candidato3,votocad3);
        }
        else if ((votocad4 > votocad1) && (votocad4>votocad2) && (votocad4>votocad3) && (votocad3> votocad5))
        {
            System.out.printf("O vencedor e o %s com %d votos",candidato4,votocad4);
        }
        else if ((votocad5 > votocad1) && (votocad5>votocad2) && (votocad5>votocad3) && (votocad5> votocad4))
        {
            System.out.printf("O vencedor e o %s com %d votos",candidato5,votocad5);
        }
    }
}
