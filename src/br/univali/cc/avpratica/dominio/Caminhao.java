
package br.univali.cc.avpratica.dominio;

public class Caminhao extends VeiculoTerrestre{
    
    double capacidadeCarga;
    
    public Caminhao(double capacidadeCarga, String modelo, String placa) {
        super(modelo, placa);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String getDescricao() {
        return this.modelo+" | "+this.placa+" | "+this.capacidadeCarga+"kg";
    }

    @Override
    public String obterDescricaoVeiculo() {
        return getDescricao();
    }
    
    
}
