# Tutorial 01: soluções dos problemas

Este documento apresenta uma possível abstração e uma decomposição para cada problema do arquivo [Problemas para abstração](tutorial-01-problemas.md).

As soluções são uma referência para discussão. Outras formulações podem estar corretas, desde que preservem as regras e produzam o resultado esperado.

## Problema 1: leitura da turma

### Abstração

O contexto da professora e da turma pode ser substituído por três quantidades inteiras que representam valores parciais. O problema consiste em calcular a soma desses valores.

### Entrada, processamento e saída

| Elemento | Descrição |
| --- | --- |
| Entrada | Três inteiros: `dia1`, `dia2` e `dia3` |
| Processamento | Somar os três valores |
| Saída | Soma dos valores |

### Enunciado técnico

> Leia três números inteiros e escreva a soma dos valores lidos.

### Regras e restrições

- Os três valores representam quantidades inteiras.
- A soma deve incluir todos os valores.
- A ordem dos valores não altera o resultado.

### Pseudocódigo

```text
leia dia1, dia2, dia3
total = dia1 + dia2 + dia3
escreva total
```

## Problema 2: transporte para a excursão

### Abstração

Estudantes e ônibus são elementos de um problema de agrupamento. A quantidade de estudantes representa o total de elementos, e os lugares por ônibus representam a capacidade de cada grupo. É preciso calcular a divisão com arredondamento para cima.

### Entrada, processamento e saída

| Elemento | Descrição |
| --- | --- |
| Entrada | Dois inteiros positivos: `estudantes` e `lugaresPorOnibus` |
| Processamento | Dividir a quantidade de estudantes pela capacidade de um ônibus e arredondar para cima |
| Saída | Menor quantidade de ônibus necessária |

### Enunciado técnico

> Leia a quantidade de elementos e a capacidade de cada grupo. Escreva a menor quantidade de grupos necessária para acomodar todos os elementos, permitindo que o último grupo fique parcialmente preenchido.

### Regras e restrições

- `estudantes` é positivo.
- `lugaresPorOnibus` é positivo.
- Todos os grupos têm a mesma capacidade.
- Um grupo pode ficar parcialmente preenchido.
- Todos os elementos devem ser acomodados.

### Pseudocódigo

```text
leia estudantes, lugaresPorOnibus
grupos = (estudantes + lugaresPorOnibus - 1) / lugaresPorOnibus
escreva grupos
```

## Problema 3: pontuação no campeonato

### Abstração

O campeonato fornece três quantidades. Cada quantidade possui um peso diferente na pontuação: vitória vale 3, empate vale 1 e derrota vale 0. O resultado é uma soma de produtos.

### Entrada, processamento e saída

| Elemento | Descrição |
| --- | --- |
| Entrada | Três inteiros: `vitorias`, `empates` e `derrotas` |
| Processamento | Multiplicar cada resultado pelo valor correspondente e somar os pontos |
| Saída | Pontuação final |

### Enunciado técnico

> Leia as quantidades de ocorrências de três categorias. A primeira categoria vale 3 pontos, a segunda vale 1 ponto e a terceira vale 0 pontos. Calcule e escreva a pontuação total.

### Regras e restrições

- As quantidades são inteiros não negativos.
- Cada vitória vale 3 pontos.
- Cada empate vale 1 ponto.
- Cada derrota vale 0 pontos.

### Pseudocódigo

```text
leia vitorias, empates, derrotas
pontuacao = 3 * vitorias + 1 * empates + 0 * derrotas
escreva pontuacao
```

## Problema 4: ordem das caixas

### Abstração

As caixas e seus pesos são apenas um contexto para comparar três números. A condição exigida é uma sequência estritamente crescente: cada valor deve ser maior que o anterior.

### Entrada, processamento e saída

| Elemento | Descrição |
| --- | --- |
| Entrada | Três números: `primeiro`, `segundo` e `terceiro` |
| Processamento | Verificar se `primeiro < segundo` e `segundo < terceiro` |
| Saída | `SIM` quando as duas comparações forem verdadeiras; caso contrário, `NAO` |

### Enunciado técnico

> Leia três números e informe se eles estão em ordem crescente estrita. Escreva `SIM` se o segundo for maior que o primeiro e o terceiro for maior que o segundo. Caso contrário, escreva `NAO`.

### Regras e restrições

- A comparação é estrita.
- Valores iguais não formam uma ordem crescente.
- As duas condições precisam ser verdadeiras ao mesmo tempo.

### Pseudocódigo

```text
leia primeiro, segundo, terceiro

se primeiro < segundo e segundo < terceiro então
    escreva "SIM"
senão
    escreva "NAO"
fim se
```

## Problema 5: movimento do robô

### Abstração

O robô pode ser representado por um número inteiro que indica sua posição. Cada comando altera essa posição em uma unidade: `D` soma 1 e `E` subtrai 1. A sequência deve ser percorrida comando por comando.

### Entrada, processamento e saída

| Elemento | Descrição |
| --- | --- |
| Entrada | Uma sequência de comandos formada por `D` e `E` |
| Processamento | Atualizar a posição para cada comando |
| Saída | Posição final do robô |

### Enunciado técnico

> Considere uma posição inicial igual a zero e uma sequência de caracteres. Para cada `D`, some 1 à posição. Para cada `E`, subtraia 1. Escreva a posição obtida ao final da sequência.

### Regras e restrições

- A posição inicial é zero.
- Cada comando altera a posição exatamente uma unidade.
- `D` representa deslocamento para a direita.
- `E` representa deslocamento para a esquerda.
- A sequência contém apenas os comandos `D` e `E`.

### Pseudocódigo

```text
leia comandos
posicao = 0

para cada comando em comandos faça
    se comando = "D" então
        posicao = posicao + 1
    senão
        posicao = posicao - 1
    fim se
fim para

escreva posicao
```

## Observação final

Em todos os problemas, a solução foi construída depois da identificação dos elementos essenciais. O contexto mudou, mas a estrutura técnica permaneceu: entradas, regras, processamento e saída.
