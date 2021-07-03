import java.util.ArrayList;

public class Repositorio {

    ArrayList<Anuncio> bancoDeAnuncios = new ArrayList<>();

    public void cadastrarAnuncio(Anuncio anuncio) {
        bancoDeAnuncios.add(anuncio);
    }

    public ArrayList<Anuncio> pesquisarAnuncio() {

        return this.bancoDeAnuncios;

    }

}
