package br.univali.cc.avpratica.dominio;


public class Carro extends VeiculoTerrestre {
    
    double potencia;
    
    public Carro(double potencia, String modelo, String placa) {
        super(modelo, placa);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }
    
        @Override
    public String getDescricao() {
        return this.modelo+" | "+this.placa+" | "+this.potencia+"cv";
    }

    @Override
    public String obterDescricaoVeiculo() {
        return getDescricao();
    }
    
    
}
