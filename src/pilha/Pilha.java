package pilha;

public class Pilha {
	private int vetor[];
	private int topo;
	
	public Pilha() {
		vetor = new int[10];
		topo = -1;
	}
	
	//Insere um elemento no topo
	public void push(int elemento) {
		topo++;
		vetor[topo] = elemento;
	}
	
	//retira um elemento do topo
	public int pop() {
		int elemento = vetor[topo];
		topo--;
		return elemento;
	}
	
	//verifica se a pilha esta vazia
	public boolean isEmpty() {
		return topo == -1;
	}
	
	//verifica se a pilha esta cheia
	public boolean isFull() {
		return topo == 9;		
	}

}
