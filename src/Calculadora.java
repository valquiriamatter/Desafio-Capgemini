import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Calculadora {

    /*
      o mesmo anúncio é compartilhado no máximo 4 vezes em sequência
      (1ª pessoa -> compartilha -> 2ª pessoa -> compartilha - > 3ª pessoa -> compartilha -> 4ª pessoa)


     */


    //a cada 100 pessoas que visualizam o anúncio 12 clicam nele.
    private double calculaClicks(double visualizacoes){

        double clicks = visualizacoes * 0.12;
        return clicks;

    }

    //a cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais.
    // 20  100
    // 3    x
    // 300 = 20x
    // x = 15%
    private double calculaCompartilhamentos(double clicks){

        double compartilhamentos = clicks * 0.15;
        return compartilhamentos;

    }

    //cada compartilhamento nas redes sociais gera 40 novas visualizações.
    private double calculaNovasVisualizacoes(double compartilhamentos){

        double novasVisualizacoes = compartilhamentos * 40;
        return novasVisualizacoes;

    }

    // 30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido.
    private double calculaVisualizacoes(double valorInvestido){

        double visualizacoes = valorInvestido * 30;
        return visualizacoes;

    }


    public String calculaAlcance(double valorInvestido){

        double visualizacoes = this.calculaVisualizacoes(valorInvestido);
        double clicks = this.calculaClicks(visualizacoes);
        double compartilhamentos = this.calculaCompartilhamentos(clicks);
        double novasVisualizacoes = this.calculaNovasVisualizacoes(compartilhamentos);

        String output =  "Número Aproximado de Visualizações Originais: " + visualizacoes + "\n" +
                 "Número Aproximado de Clicks: " + clicks + "\n" +
                 "Número Aproximado de Compartilhamentos: " + compartilhamentos + "\n" +
                 "Número Aproximado de Novas Visualizações: " + novasVisualizacoes + "\n" +
                 "Número Aproximado do Total de Visualizações: " + (visualizacoes + novasVisualizacoes);

        return output;

    }

    public boolean validaValor(double valorInvestido){

        if (valorInvestido <= 0){
            return false;
        }else {
            return true;
        }
    }

    public boolean validaCompartilhamentos(double compartilhamentos){
        if(compartilhamentos >4){
            return true;
        }
        return false;


    }



}
