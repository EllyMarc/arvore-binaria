package main;

import models.ArvoreB;

public class Main {
    public static void main(String[] args) {
        ArvoreB arvore = new ArvoreB();
        
        // Inserindo valores
        System.out.println("Inserindo: D, B, F, A, C, E, G");
        arvore.inserir('D');
        arvore.inserir('B');
        arvore.inserir('F');
        arvore.inserir('A');
        arvore.inserir('C');
        arvore.inserir('E');
        arvore.inserir('G');
        
        // Percorrendo em ordem (deve mostrar ordenado)
        System.out.print("Em ordem: ");
        arvore.percorreEmOrdem(); // Saída: A B C D E F G
        
        // Buscando
        System.out.println("Buscar 'C': " + arvore.buscar('C')); // true
        System.out.println("Buscar 'X': " + arvore.buscar('X')); // false
        
        // Removendo
        System.out.println("Removendo 'B'");
        arvore.remover('B');
        System.out.print("Em ordem após remover B: ");
        arvore.percorreEmOrdem(); // Saída: A C D E F G
    }
}