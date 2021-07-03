import java.time.LocalDate;
import java.time.LocalTime;

public class Anuncio {

    //Crie um sistema que permita o cadastro de anúncios. O anúncio deverá conter os seguintes dados:
    //nome do anúncio
    //cliente
    //data de início
    //data de término
    //investimento por dia

    private String nome;
    private String cliente;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double investimentoPorDia;

    public Anuncio(String nome, String cliente, LocalDate dataInicio, LocalDate dataTermino, double investimentoPorDia) {
        this.nome = nome;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.investimentoPorDia = investimentoPorDia;
    }

    public String getNome() {
        return nome;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public double getInvestimentoPorDia() {
        return investimentoPorDia;
    }

    public int calculaDiasRodando(){

        int dias = dataInicio.compareTo(dataTermino);
        return dias;
    }

    //valor total investido
    private double calculaTotalInvestido(int dias){

        double valorTotal = this.getInvestimentoPorDia() * dias;
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "nome='" + nome + '\'' +
                ", cliente='" + cliente + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", investimentoPorDia=" + investimentoPorDia +
                '}';
    }
}
