# Visualizador 3D de Árvore Binária

Este projeto consiste numa aplicação interativa interdisciplinar que integra os conceitos de **Programação Orientada a Objetos (POO)** e **Estruturas de Dados em Java** com a renderização gráfica em **Computação Gráfica (CG)** utilizando C++ e OpenGL Moderno.

A comunicação entre os dois ecossistemas é realizada nativamente através de **JNI (Java Native Interface)**, permitindo que as alterações na estrutura da árvore binária feitas pelo utilizador na interface Java reflitam-se instantaneamente na janela de renderização controlada pela GPU.

##  Funcionalidades

* **Interface Gráfica Interativa:** Painel desenvolvido em Java Swing para inserção e remoção manual de nós.
* **Inserção Dinâmica:** Renderização procedural de esferas na janela assim que um novo nó é adicionado à árvore.
* **Remoção Visual:** Algoritmo em Java que resolve a reorganização estrutural, envia um comando de limpeza de memória gráfica para o C++ e reconstrói a árvore visual instantaneamente via travessia pré-ordem.

## Tecnologias Utilizadas

### Camada de Lógica e UI (Java/POO)
* **Java**
* **Java Swing** (Interface Gráfica)
* **JNI** (Ponte de comunicação)

### Camada Gráfica (C++/CG)
* **C++**
* **OpenGL 3.3**
* **GLFW**
* **GLAD**
* **GLM**

## 🔧 Pré-requisitos e Configuração

Para executar a aplicação através do Java:

* **Via `TelaPrincipal.java`:** Executa a interface gráfica Java Swing ao lado da janela 3D do OpenGL. O utilizador pode digitar letras, clicar em **Inserir** ou **Remover** e ver a árvore a reorganizar-se dinamicamente nas janelas.

##  Autores

### Computação Gráfica
* **Guilherme Seidel**
* **Luiz Guilherme Gomes**

### Programação Orientada a Objetos
* **Anderson Santos**
* **Rodrigo Moço**
* **Marcelly Yasmim**
* **Pedro Artur**
