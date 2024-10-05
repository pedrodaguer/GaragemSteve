package br.univali.cc.avpratica.dominio;

public class Iate implements Veiculo{

    String nome;
    String capitao;

    public Iate(String nome) {
        this.nome = nome;
    }

    public void setCapitao(String capitao) {
        this.capitao = capitao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String obterDescricaoVeiculo() {
        return getNome()+" | "+this.capitao;
    }

}
