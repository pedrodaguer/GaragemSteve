
package br.univali.cc.avpratica.dominio;

import javax.swing.JOptionPane;

public class Galpao{
    StringBuilder mensagem = new StringBuilder();

    public StringBuilder getMensagem() {
        return mensagem;
    }

     public Galpao() {
    }
    
    Veiculo[] veiculos = new Veiculo[999];
    int numVeiculos = 0;

   public void adicionarVeiculo(Veiculo veiculo){
       veiculos[numVeiculos] = veiculo;
       if(veiculos[numVeiculos]== null){
           System.out.println("Não foi possível adicionar");
       }
       else{
           System.out.println("Adicionado com sucesso!");
           numVeiculos++;
       }
   }
  
   public String imprimirRelacaoVeiculos(){
       
       for (Veiculo veiculo:veiculos) {
           if(veiculo == null){
               break;
           }
            mensagem.append("\n" + veiculo.obterDescricaoVeiculo());
        }
        JOptionPane.showMessageDialog(null,mensagem);
       return "\n";
   }
}
