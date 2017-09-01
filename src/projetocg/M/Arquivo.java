package projetocg.M;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Evelyn
 */
public class Arquivo {

    private int numPontos = 0;
    private ArrayList<Ponto> pontos = null;

    public ArrayList<Ponto> leitura(String caminho) throws IOException {
        pontos = new ArrayList<>();
        FileReader arq = new FileReader(caminho);
        BufferedReader lerArq = new BufferedReader(arq);
        String linha = lerArq.readLine();//le a primeira linha
        setNumPontos(Integer.parseInt(linha));
        System.out.println("Numero de Pontos: " + getNumPontos());
        linha = lerArq.readLine();//le a proxima linha
        while (linha.length()!=0) {
            pontos.add(capturaPonto(linha));
            System.out.println("Linha: " + linha);
            linha = lerArq.readLine();
            if(linha==null)
                break;
        }
        arq.close();
        return pontos;
    }

    public Ponto capturaPonto(String linha) {
        String x = "", y = "";
        int i = 0;
        while (linha.charAt(i) != ' ') {
            x += linha.charAt(i);
            i++;
        }
        i++;
        while (i < linha.length()) {
            y += linha.charAt(i);
            i++;
        }
        Ponto p = new Ponto(Integer.parseInt(x), Integer.parseInt(y));
        return p;
    }

    public void setNumPontos(int n) {
        this.numPontos = n;
    }

    public int getNumPontos() {
        return this.numPontos;
    }
}
