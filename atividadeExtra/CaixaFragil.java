package atividadeExtra;

public class CaixaFragil {
    private double pesoMax;

    public CaixaFragil(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    void exibirEtiqueta(){
        System.out.println("PesoMax:" + getPesoMax());
    }
    
    
    
}
