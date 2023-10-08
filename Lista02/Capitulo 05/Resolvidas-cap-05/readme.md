# Capítulo 5
| Resolvidos | Enunciados|
|------------|-----------|
|Q01R: |Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
|a)| Esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00.
|b)| Em 2006, ele recebeu aumento de 1,5% sobre seu salário inicial.
|c)| A partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
||Faça um programa que determine o salário atual desse funcionário.|
|Q02R: |Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o valor de E, conforme a fórmula a seguir:|
|E=|  1 + 1/1! + 1/2! + 1/3! ... + 1/N!|  
|Q03R: |Faça um programa que leia um número N que indica quantos valores inteiros e positivos devem ser lidos a seguir. Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor.|
|Q04R: |Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:|
|1.| código da cidade;|
|2.| número de veículos de passeio;|
|3.| número de acidentes de trânsito com vítimas.|
||Deseja-se saber:|
|a)| qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
|b)| qual é a média de veículos nas cinco cidades juntas;
|c)| qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.|
|Q05R: |Faça um programa que leia o número de termos e um valor positivo para X. Calcule e mostre o valor da série a seguir:|
|S=| -X2/1! +X3/2! –X4/3! +X5/4! -X6/3! +X7/2! -X8/1! +X9/2! -X10/3! +X11/4! -...|
|Q06R: |Uma empresa possui dez funcionários com as seguintes características: código, número de horas trabalhadas no mês, turno de trabalho (M — matutino; V — vespertino; ou N — noturno), categoria (O — operário; ou G — gerente), valor da hora trabalhada. Sabendo-se que essa empresa deseja informatizar sua folha de pagamento, faça um programa que:
|a)| Leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informados turnos e nem categorias inexistentes. Trabalhe sempre com a digitação de letras maiúsculas.
|b)| Calcule o valor da hora trabalhada, conforme a tabela a seguir. Adote o valor de R$ 450,00 para o salário mínimo.|
|c)| Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas trabalhadas.
|d)| Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme a tabela a seguir.|
|e)| Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio alimentação e salário final (salário inicial + auxílio alimentação).|

| Categoria | Turno | Valor da Hora Trabalhada |
|-----------|-------|--------------------------|
| G         | N     | 18% do salário mínimo   |
| G         | M ou V| 15% do salário mínimo   |
| O         | N     | 13% do salário mínimo   |
| O         | M ou V| 10% do salário mínimo   |

| Salário Inicial | Auxílio Alimentação |
|-----------------|---------------------|
| Até R$ 300,00   | 20% do salário inicial |
| Entre R$ 300,00 e R$ 600,00 | 15% do salário inicial |
| Acima de R$ 600,00 | 5% do salário inicial |

| Resolvidos | Enunciados|
|------------|-----------|
|Q07R: |Faça um programa que monte os oito primeiros termos da sequência de Fibonacci.|
|sequência de Fibonacci:|0-1-1-2-3-5-8-13-21-34-55...|
|Q08R: |Faça um programa que leia o número de termos, determine e mostre os valores de acordo com a série a seguir:|
|Série =| 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768...|
|Q09R: |Faça um programa que receba duas notas de seis alunos. Calcule e mostre:|
|a)|a média aritmética das duas notas de cada aluno, e a mensagem que está na tabela a seguir:|
|b)| o total de alunos aprovados;
|c)| o total de alunos de exame;
|d)| o total de alunos reprovados;
|e)| a média da classe.|

| Média Aritmética Mensal | Classificação |
|-------------------------|---------------|
| Até 3                  | Reprovado     |
| Entre 3 e 7            | Exame         |
| De 7 para cima         | Aprovado      |
 
| Resolvidos | Enunciados|
|------------|-----------|
|Q10R: |Em um campeonato de futebol existem cinco times e cada um possui onze jogadores. Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores, calcule e mostre:
|a)|a quantidade de jogadores com idade inferior a 18 anos;
|b)|a média das idades dos jogadores de cada time;
|c)|a média das alturas de todos os jogadores do campeonato; e
|d)|a porcentagem de jogadores com mais de 80 kg entre todos os jogadores do campeonato.|
|Q11R: |Faça um programa que receba um número inteiro maior que 1, verifique se o número fornecido é primo ou não e mostre uma mensagem de número primo ou de número não primo.
||Um número é primo quando é divisível apenas por 1 e por ele mesmo.|
|Q12R: |Em uma fábrica trabalham homens e mulheres divididos em três classes:|

|Classes|O que são|
|-------|---------|
|classe 1|trabalhadores que fazem até 30 peças por mês.|
|classe 2|trabalhadores que fazem de 31 a 50 peças por mês.|
|classe 3|trabalhadores que fazem mais de 50 peças por mês.|

|Classes|Quanto recebem|
|-------|--------------|
|A classe 1| recebe salário mínimo. |
|A classe 2 |recebe salário mínimo mais 3% deste salário por peça, acima das 30 peças iniciais.|
|A classe 3| recebe salário mínimo mais 5% desse salário por peça, acima das 30 peças iniciais.|

|Questão|Enunciado|
|-------|---------|
||Faça um programa que receba o número do operário, o número de peças fabricadas no mês, o sexo do operário, e que também calcule e mostre:
|a)|O número do operário e seu salário;
|b)|o total da folha de pagamento da fábrica;
|c)|o número total de peças fabricadas no mês;
|d)|a média de peças fabricadas pelos homens;
|e)|a média de peças fabricadas pelas mulheres; e
|f)|o número do operário ou operária de maior salário.A fábrica possui 15 operários.|
|Q13R: |Foi feita uma pesquisa para determinar o índice de mortalidade infantil em certo período. Faça um programa que:
|1.|leia o número de crianças nascidas no período;
|2.|identifique o sexo (M ou F) e o tempo de vida de cada criança nascida.
O programa deve calcular e mostrar:
|a)| a percentagem de crianças do sexo feminino mortas no período;
|b)| percentagem de crianças do sexo masculino mortas no período;
|c)| a percentagem de crianças que viveram 24 meses ou menos no período.|
|Q14R: |Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados:
valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
Os juros e a quantidade de parcelas seguem a tabela:|

| Quantidade de Parcelas | % de Juros sobre o Valor Inicial da Dívida |
|------------------------|--------------------------------------------|
| 1                      | 0                                          |
| 3                      | 10                                         |
| 6                      | 15                                         |
| 9                      | 20                                         |
| 12                     | 25                                         |

## Exemplo de saída do programa:

| Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela |
|-----------------|-----------------|------------------------|------------------|
| R$ 1.000,00     | R$ 0            | 1                      | R$ 1.000,00     |
| R$ 1.100,00     | R$ 100          | 3                      | R$ 366,67       |
| R$ 1.150,00     | R$ 150          | 6                      | R$ 191,67       |

| Resolvidos | Enunciados|
|------------|-----------|
|Q15R: |Faça um programa que receba o preço unitário, a refrigeração (S para os produtos que necessitem de refrigeração e N para os que não necessitem) e a categoria (A — alimentação; L — limpeza; e V — vestuário) de doze produtos, e que calcule e mostre:|
|1.|O custo de estocagem, calculado de acordo com a tabela a seguir.|

| Preço Unitário | Refrigeração | Categoria | Custo de Estocagem |
|----------------|--------------|-----------|--------------------|
| Até 20        | A            | R$ 2,00   |                   |
| Até 20        | L            | R$ 3,00   |                   |
| Até 20        | V            | R$ 4,00   |                   |
| 20 a 50       | S            |           | R$ 6,00           |
| 20 a 50       | N            |           | R$ 0,00           |
| Maior que 50  | S            | A         | R$ 5,00           |
| Maior que 50  | S            | L         | R$ 2,00           |
| Maior que 50  | S            | V         | R$ 4,00           |
| Maior que 50  | N            | A ou V    | R$ 0,00           |
| Maior que 50  | N            | L         | R$ 1,00           |

|Ordem|O que é pedido|
|---------|----------|
|1|.O imposto calculado de acordo com as regras a seguir:
|Regra|Se o produto não preencher nenhum dos requisitos a seguir, seu imposto será de 2% sobre o preço unitário; caso contrário, será de 4%.|
|2.|Os requisitos são: categoria — A e refrigeração — S.
|a)|O preço final, ou seja, preço unitário mais custo de estocagem mais imposto.|
|b)|A classificação calculada usando a tabela a seguir.|

| Preço Final         | Classificação |
|---------------------|---------------|
| Até R$ 20,00        | Barato        |
| Entre R$ 20,00 e R$ 100,00 (inclusive) | Normal |
| Acima de R$ 100,00  | Caro          |

|Ordem|O que é pedido|
|---------|----------|
|1.| A média dos valores adicionais, ou seja, a média dos custos de estocagem e dos impostos dos doze produtos.|
|2. |O maior preço final.|
|3. |O menor preço final.|
|4. |O total dos impostos.|
|5. |A quantidade de produtos com classificação barato.|
|6. |A quantidade de produtos com classificação caro.|
|7. |A quantidade de produtos com classificação normal.|

| Resolvidos | Enunciados|
|------------|-----------|
|Q16R: |Faça um programa para calcular a área de um triângulo e que não permita a entrada de dados inválidos, ou seja, medidas menores ou iguais a 0.|
|Q17R: |Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.|
|Q18R: |Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero.|
|Q19R: |Faça um programa que leia um número não determinado de pares de valores [m,n], todos inteiros e positivos, um par de cada vez, e que calcule e mostre a soma de todos os números inteiros entre m e n (inclusive). A digitação de pares terminará quando m for maior ou igual a n.|
|Q20R: |Faça um programa para ler o código, o sexo (M — masculino; F — feminino) e o número de horas/aula dadas mensalmente pelos professores de uma universidade, sabendo-se que cada hora/aula vale R$ 30,00. Emita uma listagem contendo o código, o salário bruto e o salário líquido (levando em consideração os descontos explicados a seguir) de todos os professores. Mostre também a média dos salários líquidos dos professores do sexo masculino e a média dos salários líquidos dos professores do sexo feminino. Considere:|
|1.|desconto para homens, 10%, e, para mulheres, 5%;|
|2.|as informações terminarão quando for lido o código = 99999.|
|Q21R: |Faça um programa que receba vários números, calcule e mostre:
|1.| a soma dos números digitados;|
|2.| a quantidade de números digitados;|
|3.| a média dos números digitados;|
|4.| o maior número digitado;|
|5.| o menor número digitado;|
|6.| a média dos números pares;|
|7.| a porcentagem dos números ímpares entre todos os números digitados.|
|F.|Finalize a entrada de dados com a digitação do número 30.000.|
|Q22R: |Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem para preenchimento de vagas em seu quadro de funcionários. Supondo que você seja o programador dessa empresa, faça um programa que leia, para cada candidato, a idade, o sexo (M ou F) e a experiência no serviço (S ou N). Para encerrar a entrada de dados, digite zero para a idade.
O programa também deve calcular e mostrar:
|1.| o número de candidatos do sexo feminino;|
|2.| o número de candidatos do sexo masculino;|
|3.| a idade média dos homens que já têm experiência no serviço;|
|4.| a porcentagem dos homens com mais de 45 anos entre o total dos homens;|
|5.| o número de mulheres com idade inferior a 21 anos e com experiência no serviço;|
|6.| a menor idade entre as mulheres que já têm experiência no serviço.|
|Q23R: |Faça um programa que receba o valor do salário mínimo, uma lista contendo a quantidade de quilowatts gasta por consumidor e o tipo de consumidor (1 — residencial; 2 — comercial; ou 3 — industrial) e que calcule e mostre:
|1.| o valor de cada quilowatt, sabendo que o quilowatt custa um oitavo do salário mínimo;
|2.| o valor a ser pago por consumidor (conta final mais acréscimo). O acréscimo encontra-se na tabela a seguir:|

| Tipo | % de Acréscimo sobre o Valor Gasto |
|------|------------------------------------|
| 1    | 5                                 |
| 2    | 10                                |
| 3    | 15                                |

|Questão|
|-------|
|o faturamento geral da empresa, a quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00.|
|Termine a entrada de dados com quantidade de quilowats igual a zero.|

| Resolvidos | Enunciados|
|------------|-----------|
|Q24R: |Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida e não se preocupe com restrições do tipo salário inválido.
Menu de opções:|
|1.| Imposto|
|2.| Novo salário|
|3.| Classificação|
|4.| Finalizar o programa|
|Digite a opção desejada.|
|Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras
a seguir.|

| Salários                | % do Imposto |
|-------------------------|--------------|
| Menor que R$ 500,00      | 5            |
| De R$ 500,00 a R$ 850,00 | 10           |
| Acima de R$ 850,00       | 15           |

|O que é pedido|
|--------------|
|Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as
regras a seguir.|

| Salários                                     | Aumento  |
|----------------------------------------------|----------|
| Maiores que R$ 1.500,00                      | R$ 25,00 |
| De R$ 750,00 (inclusive) a R$ 1.500,00 (inclusive) | R$ 50,00 |
| De R$ 450,00 (inclusive) a R$ 750,00         | R$ 75,00 |
| Menores que R$ 450,00                        | R$ 100,00|

|O que é pedido|
|--------------|
|Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando esta tabela:|

| Salários               | Classificação    |
|------------------------|------------------|
| Até R$ 700,00          | Mal remunerado  |
| Maiores que R$ 700,00  | Bem remunerado  |

| Resolvidos | Enunciados|
|------------|-----------|
|Q25R: |Faça um programa que receba os dados a seguir de vários produtos: preço unitário, país de origem
|Regra|(1 – Estados Unidos; 2 — México; e 3 — outros), meio de transporte (T — terrestre; F — fluvial; e A— aéreo), carga perigosa (S — sim; N — não), finalize a entrada de dados com um preço inválido, ou seja, menor ou igual a zero. O programa deve calcular e mostrar os itens a seguir.
O valor do imposto, usando a tabela a seguir.|

| Preço Unitário     | Percentual de Imposto sobre o Preço Unitário |
|-------------------|-----------------------------------------------|
| Até R$ 100,00      | 5%                                            |
| Maior que R$ 100,00| 10%                                           |

|O que é pedido|
|--------------|
|O valor do transporte usando a tabela a seguir.|

| Carga Perigosa | País de Origem | Valor do Transporte |
|----------------|----------------|---------------------|
| S              | 1              | R$ 50,00            |
| S              | 2              | R$ 21,00            |
| S              | 3              | R$ 24,00            |
| N              | 1              | R$ 12,00            |
| N              | 2              | R$ 21,00            |
| N              | 3              | R$ 60,00            |

|O que é pedido|
|--------------|
|O valor do seguro, usando a regra a seguir.|
|Os produtos que vêm do México e os produtos que utilizam transporte aéreo pagam metade do valor do seu preço unitário como seguro.|
|O preço final, ou seja, preço unitário mais imposto mais valor do transporte mais valor do seguro.|
|O total dos impostos.|
