/*
 * Exercicio para Descobrir o numero maximo de 3 variaveis.
 */

package Exercicio_pack;

import java.util.Scanner;

public class Exercicio5 {
    public void mian(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        float m = 0;
        float n = 0;
        int i = 3;
        System.out.println("Escreva o primeiro numero: ");
        m = Leitor.nextFloat();

        System.out.println("Escreva outro numero: ");
        n = Leitor.nextFloat();

        if (n > m) {
            m = n;
        }
        System.out.println("O maximo e': " + m);
    } 
}
