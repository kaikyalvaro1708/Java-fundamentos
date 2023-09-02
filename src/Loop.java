import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;


        for(int i =0; i < 3; i++){
            System.out.println("Digite sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvalicao += nota; //recebe oq já tinha + nota
        }
        System.out.println("Média de avaliação: " + mediaAvalicao/3);
    }
}
