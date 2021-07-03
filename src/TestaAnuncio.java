import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TestaAnuncio {

    public static void main(String[] args) {

        //O sistema fornecerá os relatórios de cada anúncio contendo:
        //Os relatórios poderão ser filtrados por intervalo de tempo e cliente.

        //quantidade máxima de visualizações
        //quantidade máxima de cliques
        //quantidade máxima de compartilhamentos

        Scanner scanner = new Scanner(System.in);

        Repositorio repositorio = new Repositorio();

        boolean flagSair = false;

        while(!flagSair){

            System.out.println("Digite a opção desejada: 1-Cadastrar, 2-Consultar, 0-Sair");
            int menu = scanner.nextInt();

            if(menu == 1){
                if(repositorio.cadastrarAnuncio(leDados(scanner))){
                    System.out.println("Anúncio Cadastrado com Sucesso! ");
                }else {
                    System.out.println("Não foi possível cadastrar.");
                }
            }else if(menu == 2){
                pesquisar(repositorio.pesquisarAnuncio());
            }else if(menu == 0){
                flagSair = true;
            }


        }











    }

    private static Anuncio leDados(Scanner scanner){

        System.out.println("Digite o nome do anúncio:");
        String nome = scanner.next();

        System.out.println("Digite o nome do cliente:");
        String cliente = scanner.next();

        System.out.println("Digite a data de Inicio: yyyy-MM-dd");
        String dataInicio = scanner.next();

        System.out.println("Digite a data Final: yyyy-MM-dd");
        String dataFinal = scanner.next();

        System.out.println("Digite o valor do Investimento por Dia:");
        double investimentoPorDia = scanner.nextDouble();

        //transformando uma String em LocalDate
        LocalDate dataInicioOk = LocalDate.parse(dataInicio);
        LocalDate dataFinalOk = LocalDate.parse(dataFinal);

        Anuncio anuncio = new Anuncio(nome, cliente, dataInicioOk, dataFinalOk, investimentoPorDia);

        return anuncio;

    }

    private static void pesquisar(ArrayList<Anuncio> anuncios){

        for(Anuncio anuncio : anuncios){

            System.out.println(anuncio);

        }


    }

}
