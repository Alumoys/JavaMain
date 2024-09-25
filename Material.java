import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de itens");
        int qntdDeItens = sc.nextInt();
        System.out.println("Digite o valor unitário");
        double valorProduto = sc.nextDouble();
        System.out.println("Digite uma porcentagem de desconto (ENTRE 0 E 1)");
        double porcentagemDesconto = sc.nextDouble();

        System.out.println("Valor sem desconto:");
        System.out.println(calculoValorProduto(qntdDeItens, valorProduto));
        System.out.println("Valor com desconto de "+ porcentagemDesconto*100 +"%:");
        System.out.println(calculoValorProduto(qntdDeItens, valorProduto,porcentagemDesconto));
    }

    /**
     * Essa função é responsável por retornar a soma de dois valores do tipo inteiro.
     * @param num1 primeiro número inteiro
     * @param num2 segundo número inteiro
     * @return a soma dos números inteiros enviados, retorno do tipo inteiro.
     */
    public static int soma(int num1, int num2){
        return num1+num2;
    }

    /**
     * Essa função é responsável por retornar a soma de dois valores do tipo long.
     * @param num1 primeiro número long
     * @param num2 segundo número long
     * @return a soma dos números long enviados, retorno do tipo long.
     */
    public static long soma(long num1, long num2){
        return num1+num2;
    }

    /**
     * Essa função é responsável por calcular o valor de algum produto, com a sua porcentagem de desconto.
     * (Qntd de items * valor unitário) - (qntd de itens * valor unitário) * porcentagem de desconto
     * @param qntd Quantidade de itens, em formato de número inteiro
     * @param valorUnitario Valor unitário do item, do tipo double
     * @param porcentagemDesconto Porcentagem de desconto entre 0 e 1 do tipo double
     * @return Valor do item calculado com a porcentagem de desconto.
     * @throws Exception
     */
    public static double calculoValorProduto(int qntd, double valorUnitario, double porcentagemDesconto) throws Exception {

        if(porcentagemDesconto>1){
            porcentagemDesconto = porcentagemDesconto/100;
        }
        if(porcentagemDesconto<0){
                throw new Exception();
        }
        return (qntd*valorUnitario) - (qntd*valorUnitario)*porcentagemDesconto;
    }
    /**
     * Essa função é responsável por calcular o valor de algum produto sem desconto.
     * (Qntd de items * valor unitário)
     * @param qntd Quantidade de itens, em formato de número inteiro
     * @param valorUnitario Valor unitário do item, do tipo double
     * @return Valor do item calculado.
     * @throws Exception
     */
    public static double calculoValorProduto(int qntd, double valorUnitario) throws Exception {
        return calculoValorProduto(qntd,valorUnitario,0);
    }
}
