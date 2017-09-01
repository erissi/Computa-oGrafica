
package projetocg.M;

import java.util.ArrayList;

/**
 *
 * @author Evelyn
 */
public class Transformacao {
    Operacao op = new Operacao();
    
    public ArrayList<Ponto> translacao(Ponto novo, ArrayList<Ponto> pontos){
        ArrayList<Ponto> novosPontos = new ArrayList<>();
        for (Ponto ponto : pontos) {
            novosPontos.add(op.soma(ponto,novo));
        }
        return novosPontos;
    }
    
    public ArrayList<Ponto> escala(Ponto novo, ArrayList<Ponto> pontos){
        Ponto pCentral;
        ArrayList<Ponto> novosPontos = new ArrayList<>();
        ArrayList<Ponto> pontosFinais;
        ArrayList<Ponto> aux;
        pCentral = calculaPontoCentral(pontos);
        aux = coordMenosPontoCentral(pontos, pCentral);
        for(int i=0; i<aux.size(); i++){
            novosPontos.add(new Ponto(aux.get(i).getX()*novo.getX(), aux.get(i).getY()*novo.getY()));
        }
        pontosFinais = coordMaisPontoCentral(novosPontos, pCentral);
        return pontosFinais;
    }
    
    public ArrayList<Ponto> rotacao(int ang, ArrayList<Ponto> pontos){
        double radianos = Math.toRadians(ang);
        float matriz[][] = { {(float)Math.cos(radianos),(float)Math.sin(radianos)} ,      //cos sen
                             {(float)-Math.sin(radianos),((float)Math.cos(radianos))} }; //-sen cos        
        Ponto p = calculaPontoCentral(pontos);
        ArrayList<Ponto> pontosNovos = new ArrayList<>();
        ArrayList<Ponto> aux = new ArrayList<>();
        
        for(int i=0; i<pontos.size(); i++){
            float dx = pontos.get(i).getX() - p.getX();
            float dy = pontos.get(i).getY() - p.getY();
            float mA[][] = {{dx, dy}};
            float mR[][] = op.multiplicacao(mA, matriz);       
            pontosNovos.add(new Ponto((int)mR[0][0],(int)mR[0][1]));
            aux = coordMaisPontoCentral(pontosNovos, p);
        }
        return aux;
    }
    
    private Ponto calculaPontoCentral(ArrayList<Ponto> pontos){
        Ponto pCentral;
        pCentral = new Ponto((((pegaXMaior(pontos)-pegaXMenor(pontos))/2)+pegaXMenor(pontos)),(((pegaYMaior(pontos)-pegaYMenor(pontos))/2)+pegaYMenor(pontos)));
        return pCentral;
    }
    
    public int pegaXMaior(ArrayList<Ponto> pontos){
        int maior = pontos.get(0).getX();
        for(int i=1; i<pontos.size(); i++){
            if(pontos.get(i).getX()>maior)
                maior = pontos.get(i).getX();
        }
        return maior;
    }

    public int pegaYMaior(ArrayList<Ponto> pontos){
        int maior = pontos.get(0).getY();
        for(int i=1; i<pontos.size(); i++){
            if(pontos.get(i).getY()>maior)
                maior = pontos.get(i).getY();
        }
        return maior;
    }
    
    public int pegaXMenor(ArrayList<Ponto> pontos){
        int menor = pontos.get(0).getX();
        for(int i=1; i<pontos.size(); i++){
            if(pontos.get(i).getX()<menor)
                menor = pontos.get(i).getX();
        }
        return menor;
    }
    
    public int pegaYMenor(ArrayList<Ponto> pontos){
        int menor = pontos.get(0).getY();
        for(int i=1; i<pontos.size(); i++){
            if(pontos.get(i).getY()<menor)
                menor = pontos.get(i).getY();
        }
        return menor;
    }
    
    private ArrayList<Ponto> coordMenosPontoCentral(ArrayList<Ponto> pontos, Ponto pCentral){
        ArrayList<Ponto> novos = new ArrayList<>();
        for(int i=0; i<pontos.size(); i++){
            novos.add(new Ponto((pontos.get(i).getX()-pCentral.getX()),(pontos.get(i).getY()-pCentral.getY())));
        }
        return novos;
    }
    
    private ArrayList<Ponto> coordMaisPontoCentral(ArrayList<Ponto> pontos, Ponto pCentral){
        ArrayList<Ponto> novos = new ArrayList<>();
        for(int i=0; i<pontos.size(); i++){
            novos.add(new Ponto((pontos.get(i).getX()+pCentral.getX()),(pontos.get(i).getY()+pCentral.getY())));
        }
        return novos;
    }
}
