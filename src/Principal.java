import br.univali.cc.avpratica.dominio.Carro;
import br.univali.cc.avpratica.dominio.Galpao;
import br.univali.cc.avpratica.dominio.Iate;
import br.univali.cc.avpratica.dominio.Veiculo;
import br.univali.cc.avpratica.visao.GalpaoGUI;

public class Principal {

    public static void main(String[] args) {
        Galpao g1 = new Galpao();
        GalpaoGUI menu = new GalpaoGUI(g1);
        menu.menu();
        
        
    }
    
}
