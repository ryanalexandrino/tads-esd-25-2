package avaliacoes;

public class Questao8 {

    public static void main(String[] args) {

        String [] meses = {"Janeiro", "Favereiro", "Março"};
        double [] gastos = {15000, 23000, 17000};
        double orcamento = 18000;
        double economia = 0;
        double estouro = 0;

        for (int i = 0; i < gastos.length; i++){
            if (gastos[i] < orcamento){
                economia += orcamento - gastos[i];
                System.out.printf("No mês de %s, houve economia\n", meses[i]);
            }
            else {
                estouro = gastos [i] - orcamento;
                System.out.printf("No mês de %s houve estouro de orçamento\n", meses[i]);
            }
        }

        System.out.println("\nA economia total foi de R$" + economia);
        System.out.println("O estouro total foi de R$" + estouro);

    }

}
