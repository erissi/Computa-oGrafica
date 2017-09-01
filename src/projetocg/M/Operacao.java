package projetocg.M;

/**
 *
 * @author Evelyn
 */
public class Operacao {

    public Ponto soma(Ponto p1, Ponto p2) {
        Ponto novoPonto = new Ponto((p1.getX() + p2.getX()), (p1.getY() + p2.getY()));
        return novoPonto;
    }

    public float[][] subtracao(int n, int m, float a[][], float b[][]) {
        float c[][] = new float[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

    public float escalar(Ponto p1, Ponto p2) {
        float escalar = p1.getX() * p2.getX();
        escalar += p1.getY() * p2.getY();
        return escalar;
    }

    public float[][] multiplicacao(float mA[][], float mB[][]) {
        if (mA[0].length == mB.length) {
            float mC[][] = new float[mA.length][mB[0].length];
            for (int i = 0; i < mA.length; i++) {
                for (int j = 0; j < mB[0].length; j++) {
                    for (int k = 0; k < mA[0].length; k++) {
                        mC[i][j] += mA[i][k] * mB[k][j];
                    }
                }
            }
            return mC;
        }

        return null;

    }
}
