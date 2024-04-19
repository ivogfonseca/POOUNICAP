package atividadeExtra;

import java.util.Stack;

public class PilhaDeCaixas extends Caixa {
    private int alturaMax;
    private Stack<String> pilha;

   public PilhaDeCaixas(String identificador, String conteudo, double peso, int altura, int alturaMax,
            Stack<String> pilha) {
        super(identificador, conteudo, peso, altura);
        this.alturaMax = alturaMax;
        this.pilha = pilha;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public boolean empilhar(String caixa, int pesoCaixa) {
        if (pilha.size() >= alturaMax) {
            System.out.println("Altura máxima atingida. Não é possível empilhar mais.");
            return false;
        }

        int pesoMax = Calcularpeso() + pesoCaixa;
        if (pesoMax > pesoCaixa) {
            System.out.println("Peso máximo suportado ultrapassado. Não é possível empilhar.");
            return false;
        }
        return false;

    }

    private int Calcularpeso() {
        throw new UnsupportedOperationException("Unimplemented method 'Calcularpeso'");
    }
    public String desempilhar() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia. Não há mais caixas para desempilhar.");
            return null;
        }
    
        return pilha.pop();
    }
    public int getAlturaAtual(){
        return pilha.size();
    }
    public double getPesoMaxAtual(){
        return pesoMax();
    }

    private double pesoMax() {
    throw new UnsupportedOperationException("Unimplemented method 'pesoMax'");
    }
    public void exibirDadosDaPilha() {
        System.out.println("Dados da pilha:");
        System.out.println("Altura atual da pilha: " + getAlturaAtual());
        System.out.println("Peso total atual da pilha: " + getPesoMaxAtual());
        System.out.println("Caixas empilhadas (de cima para baixo):");
        for (String caixa : pilha) {
            System.out.println(caixa);
        }
    }
}
