# ListaEncadeada

### Um sistema de lista encadeada que insere dados de forma ordenada no Java

<br>
Pesquise e responda os itens a seguir sobre Listas Encadeadas

1) O que é uma lista encadeada?

2) Como o encadeamento de elementos é realizado em uma lista encadeada?

3) Quais as diferenças entre uma lista encadeada com e sem descritor (header)?

4) Elabore um método JAVA que imprime todos os elementos de uma Lista Simplesmente Encadeada com descritor

5) Elabore método JAVA que insere um elemento de forma ordenada em uma Lista Simplesmente Encadeada com descritor considerando as 4 situações:

a) lista esta vazia

b) elemento é menor que o primeiro

c) elemento é maior que o último

d) elemento é intermediário

PARTE 2 (o que esta aqui):
Dada a implementação de Lista Simplesmente Encadeada com Descritor (Deque) Dinâmica discutida em sala e no lab, elabore a solução para os seguintes problemas:

(Valor 0.5) Cálculo de similaridade entre duas listas com MESMO tamanho n utilizando a função do cosseno:

Cos(X,Y) = ... ver arquivo anexo

onde X e Y são listas, Li é o i-ésimo elemento da lista L. O valor produzido pela função deve ser um número real entre [0.0 , 1.0], sendo o valor 1.0 a similaridade máxima possível.

(Valor 0.5) Determinação da interseção entre duas listas de inteiros de tamanho quaisquer. Dadas duas listas X e Y, retorne uma terceira lista ORDENADA que contém os elementos comuns entre elas.
 
OBS: A estrutura de lista simplesmente encadeada e as seguintes operações são pré-requisito para a apresentação das soluções das questões 1 e 2, ou seja, só poderá apresentar a solução das questões quem tiver desenvolvido integralmente as seguintes operações sobre a lista em JAVA:<br>

boolean vazia(); // Verifica se a lista L está vazia<br>
void insere_primeiro( int info);    // Insere o elemento info como primeiro na lista L<br>
void insere_depois(Node * No, int info);  // Insere o elemento info depois do nó No<br>
void insere_ultimo(int info);       // Insere o elemento info como último na lista L<br>
void insere_ordenado(int info); // Insere o elemento info de maneira ordenada na lista<br>
void mostra_lista();                            // Mostra em Tela os Elementos da Lista L<br>
int retira_primeiro(); // Retira o primeiro elemento da Lista e retorna o valor da info do No<br>
int retira_ultimo();           // Retira o último elemento da Lista e retorna a informação do Nó<br>
int retira_depois(Node No);             // Retira o elemento posterior ao nó No e retorna a sua informação<br>
int ultimo_elemento();   // Retorna a informação do último elemento da Lista<br>
