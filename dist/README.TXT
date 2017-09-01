READ-ME!
Nome: Évelyn Elizama Silveira Batista Rissi
Disciplina: Computação Gráfica
Introdução
Objetivo: A partir de uma entrada de dados, com coordenadas determinadas, desenhar um polígono utilizando o algoritmo de Bresenham, para desenho de linhas. Após,  aplicar Transformações no polígono, como translação, rotação, escala, tendo como base operações de soma, subtração, escalar e multiplicação de matrizes. Demostrando os pontos antes e depois da aplicação das transformações.
Parte 1:
 Desenvolver algoritmos para a realização de operações com matrizes:
•	Soma
•	Subtração
•	Escalar
•	Multiplicação
Parte 2:
Desenvolver algoritmos para a realização das Transformações no polígono:
•	Translação
•	Rotação
•	Escala
Objetivos com as transformações:
1.	Translação: Movimentar o polígono no espaço especificado através da adição de quantidades às coordenadas do mesmo.
2.	Rotação: O polígono rotaciona à um ângulo determinado.
3.	Escala: As dimensões do polígono são mudadas através de um fator.

Decisões de Projeto
Entrada de Dados:
A partir de um Arquivo Texto(.txt), com a seguinte formatação:
Exemplo:
3
100 200
200 200
150 300
 
Onde o n° 3 representa o número de pontos que terá o polígono. E as linhas abaixo simbolizam x(com valor: 100) e y (com valor: 200), e as linhas abaixo desta sendo também, respectivamente, x e y.
Observação:
•	Os valores lidos do arquivo texto devem ser obrigatoriamente inteiros.
Informações Específicas:
•	A linguagem de programação utilizada no desenvolvimento deste trabalho foi: Java.
•	O Diagrama de Classe foi desenvolvido com : EasyUML.
Divisão do Projeto:
A divisão do projeto se deu dá seguinte forma:
-O projeto se denomina: ProjetoCG
-Possui Pacotes nomeados:
 	pacotecg.C
 	pacotecg.M
 	pacotecg.V
Onde:
- pacotecg.C é onde estão as classes Control do projeto.
São elas: 
 	TransformacaoController.java
 	ArquivoController.java
- pacotecg.M é onde estão as classes Models do projeto.
São elas:
 	Arquivo.java
 	Operação.java
 	Transformacao.java
 	Ponto.java
- pacotecg.V é onde estão as classes de View do projeto.
São elas:
 	Tela.java
 	BresenhamPanel.java
