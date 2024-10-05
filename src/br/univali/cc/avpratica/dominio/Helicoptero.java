package br.univali.cc.avpratica.dominio;

public class Helicoptero implements Veiculo{

    String modelo;
    String sigla;
    String piloto;

    public Helicoptero(String modelo, String sigla) {
        this.modelo = modelo;
        this.sigla = sigla;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getDescricao() {
        return modelo + " | " + sigla+ " | " + piloto;
    }

    @Override
    public String obterDescricaoVeiculo() {
        return getDescricao();
    }

}
