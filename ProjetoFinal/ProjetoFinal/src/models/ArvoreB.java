package models;

public class ArvoreB {

	private No raiz;
	private MotorGrafico motorGrafico; 

    public ArvoreB(MotorGrafico motorGrafico) {
        this.raiz = null;
        this.motorGrafico = motorGrafico;
    }
    
    public void inserir(char chave) {
    	raiz = inserirRecursivo(raiz, ' ', chave, false, 1);
    }

	private No inserirRecursivo(No atual, char valorPai, char chave, boolean ehEsquerdo, int nivelAtual) {
		if (atual == null) {
			if (this.motorGrafico != null) {
				this.motorGrafico.adicionarNoVisual(chave, valorPai, ehEsquerdo, nivelAtual);
				try { Thread.sleep(300); } catch (Exception e) {} // Animação
			}
			return new No(chave);
		}

		if(chave < atual.getValor()) {
			atual.setEsquerdo(inserirRecursivo(atual.getEsquerdo(), atual.getValor(), chave, true, nivelAtual + 1));
		}
		else if (chave > atual.getValor()) {
			atual.setDireito(inserirRecursivo(atual.getDireito(), atual.getValor(), chave, false, nivelAtual + 1));
		}
				
		return atual;
	}
	
	public boolean buscar (char chave) {
		return buscarRecursivo(raiz, chave);
	}

	private boolean buscarRecursivo(No atual, char chave) {
		if (atual == null) return false;
		if (chave == atual.getValor()) return true;
		if (chave < atual.getValor()) return buscarRecursivo(atual.getEsquerdo(), chave);
		else return buscarRecursivo(atual.getDireito(), chave);
	}
	
	public void percorreEmOrdem() {
		percorreEmOrdemRecursivo(raiz);
		System.out.println();
	}

	private void percorreEmOrdemRecursivo(No atual) {
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
		
		atualizarVisual();
	}
	
	public No removerRecursivo (No atual, char chave) {
		if (atual == null) return null;
		
		if (chave < atual.getValor()) {
			atual.setEsquerdo(removerRecursivo(atual.getEsquerdo(), chave));
		} else if (chave > atual.getValor()) {
			atual.setDireito(removerRecursivo(atual.getDireito(), chave));
		} else { 
			if(atual.getEsquerdo() == null) return atual.getDireito();
			else if (atual.getDireito() == null) return atual.getEsquerdo();
			
			No sucessor = procuraMenor(atual.getDireito());
			atual.setValor(sucessor.getValor());
			atual.setDireito(removerRecursivo(atual.getDireito(), sucessor.getValor()));
		}
		return atual;
	}

	private No procuraMenor(No atual) {
		while (atual.getEsquerdo() != null) atual = atual.getEsquerdo();
		return atual;
	}
	
	
	public void atualizarVisual() {
	    if (this.motorGrafico != null) {
	        this.motorGrafico.limparTela(); 
	        atualizarEstadoCG(raiz, ' ', false, 1);
	    }
	}

	private void atualizarEstadoCG(No atual, char valorPai, boolean ehEsquerdo, int nivel) {
	    if (atual == null) return;
	    
	    this.motorGrafico.adicionarNoVisual(atual.getValor(), valorPai, ehEsquerdo, nivel);
	    try { Thread.sleep(150); } catch (Exception e) {} 
	    
	    atualizarEstadoCG(atual.getEsquerdo(), atual.getValor(), true, nivel + 1);
	    atualizarEstadoCG(atual.getDireito(), atual.getValor(), false, nivel + 1);
	}
}