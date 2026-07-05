package models;

public class ArvoreB {

	private No raiz;

    public ArvoreB() {
        this.raiz = null;
    }
    
    public void inserir(char chave) {
    	raiz = inserirRecursivo(raiz, chave);
    }

	private No inserirRecursivo(No atual, char chave) {
		// Se o no atual for nulo, cria um novo nó
		if (atual == null) {
			return new No(chave);
		}

		//se o valor for menor que o atual, esquerda
		if(chave < atual.getValor()) {
			atual.setEsquerdo(inserirRecursivo(atual.getEsquerdo(), chave));
		}
		
		//se o valor for menor que o atual, direita
		if (chave > atual.getValor()) {
			atual.setDireito(inserirRecursivo(atual.getDireito(), chave));
			
		}
				
		return atual;
	}
	
	public boolean buscar (char chave) {

		return buscarRecursivo(raiz, chave);
	}

	private boolean buscarRecursivo(No atual, char chave) {
		// TODO Auto-generated method stub
		//atual for nulo, dá erro
		if (atual == null) {
			return false;
		}
		
		//chave encontrada!
		if (chave == atual.getValor()) {
			return true;
		}
		
		//se não encontrou, procura pela arvore (ou filho esquerdou o direito)
		if (chave < atual.getValor()) {
			return buscarRecursivo(atual.getEsquerdo(), chave);
		} else {
			return buscarRecursivo(atual.getDireito(), chave);
			
		}
		
	}
	
	public void percorreEmOrdem() {
		percorreEmOrdemRecursivo(raiz);
		System.out.println();
		
	}

	private void percorreEmOrdemRecursivo(No atual) {
		// TODO Auto-generated method stub
		//se ainda nao chegou no final
		if (atual != null) {
			percorreEmOrdemRecursivo(atual.getEsquerdo());
			System.out.print(atual.getValor() + " ");
			percorreEmOrdemRecursivo(atual.getDireito());
					
		}
	}
	
	public boolean estaVazia() {
        return raiz == null;
    }
	
	public void remover (char chave) {
		raiz = removerRecursivo(raiz, chave);
	}
	
	public No removerRecursivo (No atual, char chave) {
		if (atual == null) {
			return null;
		}
		
		if (chave < atual.getValor()) {
			//se a chave for menor que o valor a ser removido, testa o proximo esquerdo
			atual.setEsquerdo(removerRecursivo(atual.getEsquerdo(), chave));
		} else if (chave > atual.getValor()) {
			//se a chave for maior que o valor a ser removido, testa o proximo direito
			atual.setDireito(removerRecursivo(atual.getDireito(), chave));
		} else { 
			//O nó foi encontrado, então...
			
			//caso 1: Nó sem filho ou com UM filho
			if(atual.getEsquerdo() == null) {
				//se nao tem filhos na esquerda, testa a direita
				return atual.getDireito();
				
			} else if (atual.getDireito() == null) {
				//se nao tem filhos na direita, testa a esquerda
				return atual.getEsquerdo();
			}
			
			//caso 2: Nó com DOIS filhos
			//procura o menor dos menores
			No sucessor = procuraMenor(atual.getDireito());
			atual.setValor(sucessor.getValor());
			atual.setDireito(removerRecursivo(atual.getDireito(), sucessor.getValor()));
		}
		
		return atual;
	}

	private No procuraMenor(No atual) {
		// TODO Auto-generated method stub
		while (atual.getEsquerdo() != null) {
			atual = atual.getEsquerdo();
		}
		return atual;
	}
	
	
	
}
