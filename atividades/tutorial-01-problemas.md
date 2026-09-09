# Tutorial 01: problemas para abstração

Este documento reúne cinco problemas curtos para a atividade de leitura, interpretação e conversão para um enunciado técnico.

Você pode escolher um dos problemas abaixo ou buscar outro exercício de programação. O importante é realizar o processo completo de abstração antes de escrever o código.

## Orientações

Para o problema escolhido, produza:

1. a explicação do objetivo do problema;
2. a separação entre contexto e informações essenciais;
3. a identificação das entradas, do processamento e da saída;
4. as regras e restrições;
5. o enunciado técnico reescrito;
6. a decomposição da solução em passos;
7. pelo menos três exemplos resolvidos.

Não é necessário implementar todos os problemas. Escolha um deles para desenvolver a atividade.

## Problema 1: leitura da turma

Durante uma semana, uma professora registrou quantas páginas foram lidas pela turma em cada um dos três primeiros dias. Ela deseja saber o total de páginas lidas no período.

Escreva um programa que receba a quantidade de páginas lidas em cada dia e informe o total.

### Exemplos

| Dia 1 | Dia 2 | Dia 3 | Total |
| ---: | ---: | ---: | ---: |
| 12 | 8 | 15 | 35 |
| 20 | 20 | 20 | 60 |

## Problema 2: transporte para a excursão

Uma turma fará uma excursão. Cada ônibus disponível possui a mesma quantidade de lugares. Sabendo a quantidade de estudantes e a capacidade de cada ônibus, determine o menor número de ônibus necessário para transportar todos.

Um ônibus pode sair com lugares vazios, mas nenhum estudante pode ficar sem transporte.

### Exemplos

| Estudantes | Lugares por ônibus | Ônibus necessários |
| ---: | ---: | ---: |
| 40 | 40 | 1 |
| 41 | 40 | 2 |
| 73 | 30 | 3 |

## Problema 3: pontuação no campeonato

Em um campeonato escolar, uma equipe recebe 3 pontos por vitória, 1 ponto por empate e nenhum ponto por derrota. Ao final da competição, são informadas as quantidades de vitórias, empates e derrotas da equipe.

Calcule a pontuação final da equipe.

### Exemplos

| Vitórias | Empates | Derrotas | Pontuação |
| ---: | ---: | ---: | ---: |
| 3 | 0 | 1 | 9 |
| 2 | 4 | 0 | 10 |
| 0 | 5 | 2 | 5 |

## Problema 4: ordem das caixas

Três caixas possuem pesos diferentes. Para organizar o estoque, uma pessoa precisa descobrir se os pesos estão informados em ordem crescente: o segundo peso deve ser maior que o primeiro, e o terceiro deve ser maior que o segundo.

Informe `SIM` se os três pesos estiverem em ordem crescente estrita. Caso contrário, informe `NAO`.

### Exemplos

| Primeiro peso | Segundo peso | Terceiro peso | Resultado |
| ---: | ---: | ---: | --- |
| 2 | 5 | 9 | SIM |
| 2 | 5 | 5 | NAO |
| 8 | 4 | 10 | NAO |

## Problema 5: movimento do robô

Um robô começa na posição zero de uma linha numerada. Ele recebe uma sequência de comandos. O comando `D` move o robô uma posição para a direita e o comando `E` move o robô uma posição para a esquerda.

Determine a posição final do robô depois de executar todos os comandos.

### Exemplos

| Comandos | Posição final |
| --- | ---: |
| `DDDE` | 2 |
| `EEDD` | 0 |
| `DDEEE` | -1 |

## Observação

Os problemas foram escritos para esta atividade. Você também pode escolher uma questão da OBI ou outro exercício curto, desde que consiga explicar o contexto, identificar a estrutura essencial e produzir um enunciado técnico claro.
