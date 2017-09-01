package projetocg.C;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetocg.M.Arquivo;
import projetocg.M.Ponto;
import projetocg.V.Tela;

/**
 *
 * @author Evelyn
 */
public class ArquivoController {

    private Arquivo arq;
    private ArrayList<Ponto> pontos;
    private int nPontos;

    public ArquivoController(String caminho) {
        arq = new Arquivo();
        try {
            this.pontos = arq.leitura(caminho);
            this.nPontos = arq.getNumPontos();
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Ponto> getPontos() {
        return pontos;
    }

    public int getnPontos() {
        return nPontos;
    }
    
}
