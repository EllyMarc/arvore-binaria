package models;

public class MotorGrafico {

    static {
        System.loadLibrary("MotorGraficoCG");
    }

    public native void inicializarMotorGrafico();
    public native void adicionarNoVisual(char valorNovo, char valorPai, boolean ehEsquerdo, int nivel);
    public native void limparTela();
}