READ-ME!
Nome: �velyn Elizama Silveira Batista Rissi
Disciplina: Computa��o Gr�fica
Introdu��o
Objetivo: A partir de uma entrada de dados, com coordenadas determinadas, desenhar um pol�gono utilizando o algoritmo de Bresenham, para desenho de linhas. Ap�s,  aplicar Transforma��es no pol�gono, como transla��o, rota��o, escala, tendo como base opera��es de soma, subtra��o, escalar e multiplica��o de matrizes. Demostrando os pontos antes e depois da aplica��o das transforma��es.
Parte 1:
 Desenvolver algoritmos para a realiza��o de opera��es com matrizes:
�	Soma
�	Subtra��o
�	Escalar
�	Multiplica��o
Parte 2:
Desenvolver algoritmos para a realiza��o das Transforma��es no pol�gono:
�	Transla��o
�	Rota��o
�	Escala
Objetivos com as transforma��es:
1.	Transla��o: Movimentar o pol�gono no espa�o especificado atrav�s da adi��o de quantidades �s coordenadas do mesmo.
2.	Rota��o: O pol�gono rotaciona � um �ngulo determinado.
3.	Escala: As dimens�es do pol�gono s�o mudadas atrav�s de um fator.

Decis�es de Projeto
Entrada de Dados:
A partir de um Arquivo Texto(.txt), com a seguinte formata��o:
Exemplo:
3
100 200
200 200
150 300
 
Onde o n� 3 representa o n�mero de pontos que ter� o pol�gono. E as linhas abaixo simbolizam x(com valor: 100) e y (com valor: 200), e as linhas abaixo desta sendo tamb�m, respectivamente, x e y.
Observa��o:
�	Os valores lidos do arquivo texto devem ser obrigatoriamente inteiros.
Informa��es Espec�ficas:
�	A linguagem de programa��o utilizada no desenvolvimento deste trabalho foi: Java.
�	O Diagrama de Classe foi desenvolvido com : EasyUML.
Divis�o do Projeto:
A divis�o do projeto se deu d� seguinte forma:
-O projeto se denomina: ProjetoCG
-Possui Pacotes nomeados:
 	pacotecg.C
 	pacotecg.M
 	pacotecg.V
Onde:
- pacotecg.C � onde est�o as classes Control do projeto.
S�o elas: 
 	TransformacaoController.java
 	ArquivoController.java
- pacotecg.M � onde est�o as classes Models do projeto.
S�o elas:
 	Arquivo.java
 	Opera��o.java
 	Transformacao.java
 	Ponto.java
- pacotecg.V � onde est�o as classes de View do projeto.
S�o elas:
 	Tela.java
 	BresenhamPanel.java
