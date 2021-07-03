import java.util.Scanner;

public class TestaCalculadora {

    public static void main(String[] args) {

        //Crie um script em sua linguagem de programação preferida que receba o valor investido
        // em reais e retorne uma projeção aproximada da quantidade máxima de pessoas que visualizarão
        // o mesmo anúncio (considerando o anúncio original + os compartilhamentos)

        Calculadora calculadora = new Calculadora();
        Scanner scan = new Scanner(System.in);

        boolean valorValido = false;
        double valorInvestido = 0;

        while (!valorValido){

            System.out.println("Digite o valor do investimento:" );
            valorInvestido = scan.nextDouble();

            valorValido = calculadora.validaValor(valorInvestido);

            if(valorValido == false){
                System.out.println("Valor inválido");
            }

        }

        System.out.println(calculadora.calculaAlcance(valorInvestido));








    }


}
