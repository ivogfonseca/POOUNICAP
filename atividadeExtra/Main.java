package atividadeExtra;

public class Main {

    public static void main(String[] args) {
        PilhaDeCaixas pilha = new PilhaDeCaixas("X","roupas",5,"10","15");

        pilha.empilhar("Caixa 1", 1);
        pilha.empilhar("Caixa 2", 2);
        pilha.empilhar("Caixa 3", 3);

        
        pilha.exibirDadosDaPilha();

        
        String caixaDesempilhada = pilha.desempilhar();
        System.out.println("Caixa desempilhada: " + caixaDesempilhada);
        
        pilha.exibirDadosDaPilha();
    }
}
