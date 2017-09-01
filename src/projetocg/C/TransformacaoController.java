
package projetocg.C;

import projetocg.M.Ponto;
import projetocg.M.Transformacao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Evelyn
 */
public class TransformacaoController {
    
    Transformacao t = new Transformacao();
    
    public ArrayList<Ponto> translacaoController(ArrayList<Ponto> p){
        int dx = 600 - t.pegaXMaior(p);
        int dy = 500 - t.pegaYMaior(p);
        int x = verificaIntervalo(0, dx, "Digite a quantidade para andar em X:(0-"+dx);
        int y = verificaIntervalo(0, dx, "Digite a quantidade para andar em Y:(0-"+dy);
        return t.translacao(new Ponto(x, y), p);
    }
    
    public ArrayList<Ponto> escalaController(ArrayList<Ponto> p){
        int x = verificaIntervalo(1, 5, "Digite o Fator X:(1-5)");
        int y = verificaIntervalo(1, 5, "Digite o Fator Y:(1-5)");
        return t.escala(new Ponto(x,y), p);
    }
    
    public ArrayList<Ponto> rotacaoController(ArrayList<Ponto> p){
        int ang;
        ang = verificaIntervalo(0,360,"Digite o Valor do Ângulo(0-360): ");
        return t.rotacao(ang, p);
    }
    
    private int verificaIntervalo(int min, int max, String msg){
        int n;
        do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
        }while(max<0||min>360);
        return n;
    }

}
