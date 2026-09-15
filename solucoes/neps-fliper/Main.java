/*
 * Problema: Flíper
 *
 * Origem:
 * NEPS Academy, exercício 87.
 *
 * Enunciado técnico:
 * Leia dois valores inteiros P e R, cada um podendo ser 0 ou 1.
 * Seguir a regra:
 * - se P for 0, escreva C;
 * - se P for 1 e R for 0, escreva B;
 * - se P for 1 e R for 1, escreva A.
 *
 * Pseudocódigo:
 * leia P e R
 * se P = 0
 *     escreva C
 * senão se R = 0
 *     escreva B
 * senão
 *     escreva A
 *
 * Abstração:
 * As portinhas e o labirinto podem ser representados por duas entradas
 * binárias. A combinação dos valores determina uma única saída entre A,
 * B e C. A solução pode ser construída apenas com estruturas condicionais.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int p = scanner.nextInt();
            int r = scanner.nextInt();

            if (p == 0) {
                System.out.println("C");
            } else if (r == 0) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
    }
}
