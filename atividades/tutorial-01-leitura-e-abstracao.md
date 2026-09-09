# Tutorial 01: da leitura à especificação técnica

## Objetivo

Aprender a ler um problema, separar o contexto das regras importantes e transformar a situação apresentada em um enunciado técnico que possa ser resolvido por um algoritmo.

Você deverá ser capaz de:

- explicar o que o problema está pedindo;
- identificar dados de entrada e resultado esperado;
- separar informações importantes de detalhes do contexto;
- registrar regras e restrições;
- escrever um enunciado técnico claro;
- decompor o problema em etapas de solução.

## 1. O que significa abstrair um problema?

Um problema costuma ser apresentado dentro de uma história: uma escola, uma competição, uma loja ou uma situação do cotidiano. Essa história ajuda a criar significado, mas nem todas as informações são necessárias para construir a solução.

**Abstrair** é identificar a estrutura essencial do problema e ignorar detalhes que não alteram o resultado.

Na prática, fazemos uma passagem:

```text
situação apresentada
        |
        v
informações, regras e restrições
        |
        v
enunciado técnico
        |
        v
algoritmo
```

O objetivo não é apagar o contexto. É compreender o contexto e, em seguida, encontrar o modelo que permite resolver o problema.

## 2. Leitura em três passagens

Ao receber um enunciado, faça três leituras com perguntas diferentes.

### Primeira passagem: compreender a situação

- Qual situação precisa ser resolvida?

Nesta etapa, ainda não tente escrever código. Concentre-se no significado geral.

### Segunda passagem: localizar os dados

- Quais valores já são conhecidos?
- Quais valores precisam ser informados?
- O que precisa ser calculado ou decidido?
- Qual será o resultado apresentado?

Marque os valores que realmente participam da solução.

### Terceira passagem: encontrar as regras

- Como os dados se relacionam?
- Existe uma fórmula, comparação ou condição?
- Há limites para os valores?
- O que acontece quando o cálculo não é exato?

As regras são a ponte entre a leitura do problema e o algoritmo.

## 3. Exemplo guiado

### Problema contextualizado

Uma escola vai organizar uma sessão de cinema para os estudantes. O auditório possui fileiras com a mesma quantidade de lugares. A direção sabe quantos estudantes participarão e quantos lugares existem em cada fileira. Para organizar o espaço, é necessário descobrir o menor número de fileiras que deve ser ocupado para acomodar todos os estudantes.

### 3.1 Compreensão da situação

O contexto fala sobre uma escola, uma sessão de cinema e um auditório. Esses elementos ajudam a entender o problema, mas a solução depende apenas de duas informações:

- a quantidade de estudantes;
- a quantidade de lugares em cada fileira.

O resultado é a quantidade de fileiras necessárias.

### 3.2 Entrada, processamento e saída

| Elemento | Descrição |
| --- | --- |
| Entrada 1 | Quantidade de estudantes `estudantes` |
| Entrada 2 | Quantidade de lugares por fileira `lugaresPorFileira` |
| Processamento | Determinar quantas fileiras acomodam todos os estudantes |
| Saída | Menor quantidade de fileiras necessárias |

### 3.3 Regra principal

Se a divisão da quantidade de estudantes pela quantidade de lugares por fileira for exata, o resultado é a própria divisão.

Se sobrar algum estudante, será necessária mais uma fileira. Portanto, o resultado deve ser o menor inteiro maior ou igual a:

```text
estudantes / lugaresPorFileira
```

Essa operação é chamada de **arredondamento para cima** ou **teto da divisão**.

### 3.4 Restrições

Para este exercício, considere que:

- `estudantes` é um inteiro positivo;
- `lugaresPorFileira` é um inteiro positivo;
- cada fileira possui a mesma quantidade de lugares;
- uma fileira pode ficar parcialmente ocupada;
- não é permitido deixar estudantes sem lugar.

As restrições evitam interpretações diferentes e ajudam a escolher uma solução correta.

## 4. Conversão para o enunciado técnico

Agora retiramos os detalhes da escola e escrevemos apenas o problema computacional:

> Leia dois números inteiros positivos: a quantidade de elementos e a capacidade de cada grupo. Determine e escreva a menor quantidade de grupos necessária para acomodar todos os elementos, permitindo que o último grupo fique parcialmente preenchido.

Observe as mudanças:

| Contexto original | Formulação técnica |
| --- | --- |
| estudantes | elementos |
| lugares em uma fileira | capacidade de um grupo |
| fileiras do auditório | grupos |
| acomodar todos os estudantes | acomodar todos os elementos |

A estrutura do problema permaneceu a mesma. Apenas substituímos nomes específicos por conceitos gerais.

## 5. Decomposição da solução

Antes de programar, descreva a solução em passos:

1. Ler a quantidade de elementos.
2. Ler a capacidade de cada grupo.
3. Dividir a quantidade de elementos pela capacidade do grupo.
4. Arredondar o resultado para cima quando houver resto.
5. Escrever a quantidade mínima de grupos.

Uma forma equivalente de representar a regra, usando apenas divisão inteira, é:

```text
grupos = (elementos + capacidade - 1) / capacidade
```

Essa fórmula funciona porque acrescenta o suficiente para que qualquer resto faça a divisão avançar para o próximo inteiro.

## 6. Conferência com exemplos

Use exemplos pequenos para verificar se sua interpretação está coerente:

| Elementos | Capacidade | Grupos necessários | Explicação |
| ---: | ---: | ---: | --- |
| 20 | 5 | 4 | Todas as posições são preenchidas exatamente. |
| 21 | 5 | 5 | O último elemento exige um novo grupo. |
| 3 | 10 | 1 | Um único grupo comporta todos os elementos. |
| 30 | 6 | 5 | A divisão é exata. |

A conferência não serve apenas para validar o código. Ela também ajuda a descobrir se o problema foi interpretado corretamente antes da implementação.

## 7. Atividade orientada

Escolha um problema curto de programação e preencha o roteiro abaixo antes de escrever qualquer código.

Para escolher um problema, utilize a [lista de problemas do Tutorial 01](tutorial-01-problemas.md). Você também pode buscar outro exercício de programação que tenha tamanho e dificuldade semelhantes. As [soluções dos problemas propostos](tutorial-01-solucoes.md) devem ser consultadas depois da sua própria análise.

### Roteiro de leitura

1. Qual é o objetivo do problema?
2. Quais informações são apenas contexto?
3. Quais valores são entradas?
4. Qual resultado deve ser produzido?
5. Quais regras relacionam as entradas ao resultado?
6. Quais são as restrições dos valores?
7. Como você escreveria o problema sem nomes de pessoas, lugares ou objetos específicos?
8. Quais são os passos da solução?

### Entrega

Produza um documento com:

- o problema original;
- a lista de entradas, processamento e saída;
- as regras e restrições;
- o enunciado técnico reescrito;
- a decomposição da solução em passos;
- pelo menos três exemplos resolvidos.

## Síntese

Uma boa solução começa antes do código. Primeiro, compreenda o problema. Depois, identifique seus elementos essenciais, registre as regras e transforme a situação em uma especificação técnica. Só então escolha a representação do algoritmo e faça a implementação.
