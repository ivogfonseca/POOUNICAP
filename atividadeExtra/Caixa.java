package atividadeExtra;

public class Caixa {
    private String identificador;
    private String conteudo;
    private double peso;
    private int altura;
    
    public Caixa(String identificador, String conteudo, double peso, int altura) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    void exibirEtiqueta(){
        System.out.println("identificador:" + getIdentificador());
        System.out.println("conteudo:" + getConteudo());
        System.out.println("peso:" + getPeso());
        System.out.println("altura:" + getAltura());
    }
    
}
