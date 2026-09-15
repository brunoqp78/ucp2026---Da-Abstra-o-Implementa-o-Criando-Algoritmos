/*
 * Problema: UCP - Presença Premiada
 *
 *
 * Enunciado técnico:
 * Leia dois valores inteiros UCPI e UCPII, cada um podendo ser 0 ou 1.
 * Seguir a regra:
 * - se UCPI for 0, escreva C;
 * - se UCPI for 1 e UCPII for 0, escreva B;
 * - se UCPI for 1 e UCPII for 1, escreva A.
 *
 * Pseudocódigo:
 * leia UCPI e UCPII
 * se UCPI = 0
 *     escreva C
 * senão se UCPII = 0
 *     escreva B
 * senão
 *     escreva A
 *
 * Relação com o problema Flíper:
 * Depois que o contexto original é removido, este problema tem exatamente
 * a mesma estrutura lógica do Flíper. UCPI ocupa o papel de P, UCPII ocupa
 * o papel de R e os bilhetes A, B e C correspondem às mesmas saídas.
 * Por isso, o algoritmo que resolve os dois problemas é igual; somente os
 * nomes das variáveis e a história do enunciado mudam.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int ucpi = scanner.nextInt();
            int ucpii = scanner.nextInt();

            if (ucpi == 0) {
                System.out.println("C");
            } else if (ucpii == 0) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
    }
}
