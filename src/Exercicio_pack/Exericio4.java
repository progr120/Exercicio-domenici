/*
 * Descubra o numero mximo entre N e M
 */

package Exercicio_pack;

import java.util.Scanner;

public class Exericio4 {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        float m = 0;
        float n = 0;
        float conta = 1;
        System.out.println("Escreva o primerio numero: ");
        m = Leitor.nextFloat();
        if (conta < 4) {
            conta = conta + 1;
            System.out.println("Escreva outro numero:");
            n = Leitor.nextFloat();
        }
        else if (n > m) {
            m = n;
        }
        System.out.println("O maximo e' " + m);
    }
}
