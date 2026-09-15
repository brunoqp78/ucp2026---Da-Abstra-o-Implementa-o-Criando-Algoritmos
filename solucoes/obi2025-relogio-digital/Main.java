/*
 * Problema: OBI 2025 - Relógio Digital
 *
 * Origem:
 * OBI 2025, Fase 1, Modalidade Iniciação, Nível Júnior, Questão 4.
 *
 * Enunciado técnico:
 * Leia dois valores inteiros positivos X e Y, some-os, então encontre o resto da divisão por 24 e apresente ao usuário.
 *
 * Pseudocódigo:
 * leia X e Y
 * resultado = (X + Y) % 24
 * escreva resultado
 *
 * Abstração:
 * O contexto de um relógio pode ser representado por uma posição em um
 * ciclo de 24 valores. Somar horas significa avançar nessa posição. Quando
 * o resultado ultrapassa o tamanho do ciclo, usamos o resto da divisão por
 * 24 para retornar ao início.
 *
 * Observação:
 * O operador % calcula o resto da divisão inteira. Como X e Y são
 * não negativos, o resultado de (X + Y) % 24 está sempre entre 0 e 23.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaAtual = scanner.nextInt();
        int horasDecorridas = scanner.nextInt();
        int horaFinal = (horaAtual + horasDecorridas) % 24;

        System.out.println(horaFinal);

        scanner.close();
    }
}
