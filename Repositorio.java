import java.util.ArrayList;

public class Repositorio {

    ArrayList<Anuncio> bancoDeAnuncios = new ArrayList<>();

    public boolean cadastrarAnuncio(Anuncio anuncio) {

        try {

            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    public ArrayList<Anuncio> pesquisarAnuncio() {

        return this.bancoDeAnuncios;


    }

}
