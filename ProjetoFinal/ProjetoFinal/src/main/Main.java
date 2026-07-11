package main;

import models.ArvoreB;
import models.MotorGrafico;

public class Main {
    public static void main(String[] args) {
        
        MotorGrafico motor = new MotorGrafico();
        new Thread(() -> {
            motor.inicializarMotorGrafico();
        }).start();

        try { Thread.sleep(2000); } catch (Exception e) {}

        ArvoreB arvore = new ArvoreB(motor);
        
                System.out.println("A inserir: D, B, F, A, C, E, G");
        arvore.inserir('D');
        arvore.inserir('B');
        arvore.inserir('F');
        arvore.inserir('A');
        arvore.inserir('C');
        arvore.inserir('E');
        arvore.inserir('G');
        
        System.out.print("Em ordem: ");
        arvore.percorreEmOrdem(); 
        
        System.out.println("Procurar 'C': " + arvore.buscar('C')); 
        System.out.println("Procurar 'X': " + arvore.buscar('X')); 
        
        System.out.println("A remover 'B'");
        arvore.remover('B');
        System.out.print("Em ordem após remover B: ");
        arvore.percorreEmOrdem(); 
    }
}