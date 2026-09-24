# Passo a passo: da interpretação ao algoritmo

## Objetivo

Este roteiro orienta a resolução de problemas que podem ser implementados usando apenas:

- estrutura sequencial;
- estrutura condicional;
- combinação de sequência e condição.

A proposta é interpretar o problema, retirar o contexto desnecessário, escrever o enunciado técnico e representar a solução com pseudocódigo antes de programar.

## 1. Reconheça o tipo de problema

Leia o enunciado procurando identificar a ação principal:

| O problema pede para... | Estrutura provável |
| --- | --- |
| ler valores, calcular uma fórmula e exibir o resultado | sequencial |
| converter unidades ou horários | sequencial |
| calcular um total com pesos, taxas ou descontos | sequencial ou condicional |
| comparar valores | condicional |
| classificar um valor em categorias | condicional |
| escolher um resultado conforme uma regra | condicional |
| repetir uma operação várias vezes | repetição; não pertence ao recorte deste roteiro |
| processar uma lista ou sequência de valores | geralmente repetição; não pertence ao recorte deste roteiro |

### Características da estrutura sequencial

Um problema tende a ser sequencial quando:

- cada entrada é lida uma vez;
- existe uma ordem direta de cálculos;
- todos os passos são executados;
- não é necessário escolher entre caminhos diferentes;
- o resultado pode ser descrito por uma fórmula ou por cálculos sucessivos.

Modelo geral:

```text
leia entradas
calcule valores intermediarios
calcule resultado
escreva resultado
```

Exemplos de operações sequenciais:

- soma de valores;
- cálculo de área, média ou distância;
- conversão de unidades;
- aplicação de uma fórmula;
- cálculo de um horário após determinado intervalo.

### Características da estrutura condicional

Um problema tende a exigir condição quando:

- uma regra depende de comparação;
- o resultado muda conforme o valor de uma entrada;
- existem duas ou mais classificações possíveis;
- o enunciado usa expressões como “se”, “caso contrário”, “quando”, “maior que” ou “menor ou igual a”;
- nem todos os passos são executados em todas as situações.

Modelo geral:

```text
leia entradas
se condição então
    execute regra 1
senão
    execute regra 2
fim-se
escreva resultado
```

Quando existem mais de duas possibilidades, use condições encadeadas:

```text
se condição 1 então
    resultado 1
senão se condição 2 então
    resultado 2
senão
    resultado 3
fim-se
```

## 2. Faça a primeira leitura: compreenda o objetivo

Na primeira leitura, não tente resolver nem programar. Responda apenas:

1. Qual situação está sendo apresentada?
2. Qual é a pergunta principal?
3. O programa deve calcular um valor ou tomar uma decisão?
4. O resultado é numérico, textual ou uma combinação dos dois?

Escreva o objetivo em uma frase curta:

> O programa deve calcular ________________________________.

ou:

> O programa deve decidir/classificar ______________________.

## 3. Faça a segunda leitura: separe entrada e saída

Identifique somente os dados que influenciam o resultado.

### Entradas

Para cada valor, registre:

- nome abstrato;
- significado;
- tipo de dado;
- unidade, quando houver;
- limite permitido.

Exemplo:

| Entrada | Significado | Tipo | Restrição |
| --- | --- | --- | --- |
| `A` | primeiro valor | inteiro | `0 <= A <= 1000` |
| `B` | segundo valor | inteiro | `0 <= B <= 1000` |

### Saída

Descreva exatamente o que deve ser exibido:

- qual valor ou mensagem;
- quantas linhas;
- se existe arredondamento;
- se há palavras fixas, como `SIM` e `NAO`;
- se zeros à esquerda são proibidos.

Uma especificação precisa evita que o programa produza um resultado correto no cálculo, mas incorreto no formato.

## 4. Faça a terceira leitura: transforme a história em regras

Procure as relações entre as entradas e a saída.

Pergunte:

- Existe uma fórmula?
- É necessário somar, subtrair, multiplicar ou dividir?
- É necessário calcular o maior ou o menor valor?
- Existe uma comparação?
- O que acontece quando a condição é verdadeira?
- O que acontece quando a condição é falsa?
- Todas as possibilidades estão cobertas?

Registre as regras em frases objetivas. Por exemplo:

- “O resultado é a soma de `A` e `B`.”
- “Se `A` for maior que `B`, o resultado será `A`.”
- “Se o valor for maior ou igual a 60, escreva `APROVADO`; caso contrário, escreva `REPROVADO`.”

## 5. Remova o contexto sem perder a regra

O contexto explica a situação, mas o algoritmo depende apenas de dados, regras e resultado.

Substitua nomes específicos por conceitos gerais:

| Contexto | Termo técnico possível |
| --- | --- |
| estudantes | elementos |
| escola | ponto ou posição |
| dinheiro | valor |
| pizza | unidades ou fatias |
| partida | evento |
| jogador | participante |
| loja | estabelecimento |

Não remova informações que alteram a solução. Limites, unidades, ordem dos dados e regras de decisão precisam permanecer no enunciado técnico.

### Teste de abstração

Depois de escrever o enunciado técnico, verifique:

- uma pessoa consegue resolver o problema sem conhecer a história original?
- todas as entradas estão definidas?
- a saída está definida?
- todas as regras estão explícitas?
- os nomes das variáveis representam conceitos gerais?

Se alguma resposta for “não”, a especificação ainda precisa ser revisada.

## 6. Escreva o enunciado técnico

Use esta estrutura:

```text
Leia [entradas] e [descreva a operação ou decisão].
Determine e escreva [saída].
```

Depois acrescente as seções necessárias:

```text
Entrada:
[formato e significado dos valores]

Saída:
[formato exato do resultado]

Restrições:
[limites e condições dos valores]
```

### Modelo para problema sequencial

> Leia dois números inteiros positivos, representando uma quantidade e um valor unitário. Calcule o produto entre eles e escreva o resultado.

### Modelo para problema condicional

> Leia um número inteiro. Escreva `SIM` se ele satisfizer a condição definida e `NAO` caso contrário.

O enunciado técnico deve ser suficiente para implementar o algoritmo, mas não precisa repetir detalhes narrativos que não afetam a solução.

## 7. Escreva a fórmula, quando existir

Uma fórmula torna o processamento verificável e reduz ambiguidades.

Exemplo:

```text
resultado = quantidade * valorUnitario
```

Para várias etapas, apresente as operações na ordem em que serão realizadas:

```text
valorParcial = A * pesoA
valorTotal = valorParcial + B * pesoB
resultado = valorTotal - desconto
```

Em problemas com condição, registre as fórmulas de cada caminho:

```text
se valor >= 100 então
    resultado = valor * 90 / 100
senão
    resultado = valor
fim-se
```

Confira se a fórmula usa as unidades corretas e se a ordem das operações está clara.

## 8. Escreva o pseudocódigo

O pseudocódigo deve ser uma tradução direta das regras, sem detalhes da linguagem Java.

### Sequência

```text
inicio
    leia A
    leia B
    resultado <- A + B
    escreva resultado
fim
```

### Condição simples

```text
inicio
    leia valor
    se valor >= 0 então
        escreva POSITIVO
    senão
        escreva NEGATIVO
    fim-se
fim
```

### Condições encadeadas

```text
inicio
    leia nota
    se nota >= 80 então
        conceito <- A
    senão se nota >= 60 então
        conceito <- B
    senão
        conceito <- C
    fim-se
    escreva conceito
fim
```

### Regras de qualidade

Um bom pseudocódigo:

- possui início e fim;
- lê todas as entradas;
- apresenta os cálculos na ordem correta;
- registra as condições e seus caminhos;
- atribui nomes compreensíveis às variáveis;
- produz exatamente a saída descrita;
- não usa comandos específicos de Java.

## 9. Verifique com exemplos

Use pelo menos três exemplos, incluindo casos que possam revelar erros.

### Para sequência

Inclua, quando possível:

- valores mínimos;
- valores máximos;
- resultado igual a zero;
- divisão exata e não exata, se houver divisão.

### Para condição

Inclua:

- um caso em que a condição é verdadeira;
- um caso em que a condição é falsa;
- o valor de fronteira, como `valor = 60` quando a regra usa `>= 60`.

Para cada exemplo, registre:

| Entrada | Regra aplicada | Saída |
| --- | --- | --- |
| valores fornecidos | cálculo ou condição escolhida | resultado |

Se um exemplo não puder ser resolvido manualmente, a regra ainda não está clara.

## 10. Faça a revisão final

Antes de implementar, responda:

- O problema usa apenas sequência e/ou condição?
- Há alguma repetição escondida no enunciado?
- Todas as entradas foram identificadas?
- A saída está no formato correto?
- As restrições foram registradas?
- O contexto foi removido sem remover regras importantes?
- A fórmula está correta, quando aplicável?
- Todas as alternativas da condição foram tratadas?
- O pseudocódigo representa exatamente a solução?
- Os exemplos cobrem casos comuns e casos de fronteira?

Somente depois dessa revisão escreva o código.

## Roteiro de entrega

Para cada problema, entregue:

1. objetivo do problema;
2. entradas, processamento e saída;
3. regras e restrições;
4. classificação: sequencial, condicional ou sequencial com condição;
5. enunciado técnico sem o contexto original;
6. fórmula, se existir;
7. pseudocódigo;
8. pelo menos três exemplos resolvidos;
9. implementação somente depois da análise.

## Resumo do fluxo

```text
ler o problema
    |
    v
identificar entradas, regras e saída
    |
    v
classificar a estrutura algorítmica
    |
    v
remover contexto desnecessário
    |
    v
escrever enunciado técnico
    |
    v
registrar fórmula e pseudocódigo
    |
    v
verificar exemplos e fronteiras
    |
    v
implementar
```
