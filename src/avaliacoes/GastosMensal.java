package avaliacoes;

public class GastosMensal {

    public static void main(String[] args) {

        double[] trimestre = {15000, 23000, 17000};
        double total = 0;
        int acima = 0;

        for (int i = 0; i < trimestre.length; i++) {
            total += trimestre[i];
        }

        double media = total / trimestre.length;
        System.out.printf("A média dos meses é: %.2f",media);

        for(int k = 0; k < trimestre.length; k++){
            if (trimestre[k] > media) {
                acima = 1;
                break;
            }
        }

        if (acima == 1){
            System.out.println("\nTeve um mês acima da média!");
        }
    }
}