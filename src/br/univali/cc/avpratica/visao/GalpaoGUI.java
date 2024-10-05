package br.univali.cc.avpratica.visao;

import br.univali.cc.avpratica.dominio.Caminhao;
import br.univali.cc.avpratica.dominio.Carro;
import br.univali.cc.avpratica.dominio.Galpao;
import br.univali.cc.avpratica.dominio.Helicoptero;
import br.univali.cc.avpratica.dominio.Iate;
import br.univali.cc.avpratica.dominio.Veiculo;
import javax.swing.JOptionPane;

public class GalpaoGUI {

    private Galpao g1;

    public String lerValor(String rotulo) {
        return JOptionPane.showInputDialog(null, rotulo);
    }

    public String lerValor(String rotulo, String[] opcoes) {
        return (String) JOptionPane.showInputDialog(null, null, rotulo, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
    }

    public void escreverValor(String valor) {
        JOptionPane.showMessageDialog(null, valor);
    }

    public GalpaoGUI(Galpao g1) {
        this.g1 = g1;
    }

    public void menu() {
        char opcao;
        do {
            String[] opcoes = {
                "1 - Inserir novo veiculo",
                "2 - Relação de Veiculos",
                "3 - Sair"
            };
            String valorSelecionado = this.lerValor("Selecione uma opção", opcoes);
            if (valorSelecionado == null) {
                opcao = 'S';
            } else {
                opcao = valorSelecionado.toUpperCase().charAt(0);
            }

            switch (opcao) {
                case '1':
                    inserirVeiculo();
                    break;
                case '2':
                    relacaoVeiculos();
                    break;
            default: break;
            }
        } while (opcao != '3');
    }

    private void inserirVeiculo() {
        char opcao;
        do {
            String[] opcoes = {
                "1 - Inserir novo Carro",
                "2 - Inserir novo Caminhao",
                "3 - Inserir novo Iate",
                "4 - Inserir novo Helicoptero",
                "5 - Voltar ao menu principal"
            };
            String valorSelecionado = this.lerValor("Selecione uma opção", opcoes);
            if (valorSelecionado == null) {
                opcao = 'S';
            } else {
                opcao = valorSelecionado.toUpperCase().charAt(0);
            }

            switch (opcao) {
                case '1':
                    String modelo = (lerValor("Informe o modelo do carro que deseja inserir: "));
                    String placa = (lerValor("Informe a placa: "));
                    int potencia = Integer.parseInt((lerValor("Informe a potencia: ")));
                    Veiculo v1 = new Carro(potencia, modelo, placa);
                    g1.adicionarVeiculo(v1);
                    break;
                case '2':
                    String modeloC = (lerValor("Informe o modelo do caminhão que deseja inserir: "));
                    String placaC = (lerValor("Informe a placa: "));
                    int carga = Integer.parseInt((lerValor("Informe a capacidade de carga (em kg): ")));
                    Veiculo c1 = new Caminhao(carga, modeloC, placaC);
                    g1.adicionarVeiculo(c1);
                    break;
                case '3':
                    String nome = (lerValor("Informe o nome do iate que deseja inserir: "));
                    String capitao = (lerValor("Informe o capitão do iate: "));
                    Veiculo i1 = new Iate(nome);
                    ((Iate)i1).setCapitao(capitao);
                    g1.adicionarVeiculo(i1);
                    break;
                case '4':
                    String modeloH = (lerValor("Informe o modelo do helicoptero que deseja inserir: "));
                    String sigla = (lerValor("Informe a sigla: "));
                    String piloto = (lerValor("Informe o piloto: "));
                    Veiculo h1 = new Helicoptero(modeloH, sigla);
                    ((Helicoptero)h1).setPiloto(piloto);
                    g1.adicionarVeiculo(h1);
                    break;
                    
                default: break;
            }
        } while (opcao != '5');
    }

    private void relacaoVeiculos() {
            
       g1.imprimirRelacaoVeiculos();
    }
}
