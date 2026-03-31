/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.joaocl.exercicios.atv7;
import java.util.Scanner
/**
 *
 * @author joaocl
 */
public class ex1_12_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = -1, somaIdade = 0, contador = 0;
        
        while(true){
            System.out.printf("Digite a idade: ");
            idade = input.nextInt();
            if (idade == 0) {
                break; // Sai do loop se a idade for zero
            }
            if (idade < 0) {
                System.out.println("Digite um valor positivo");
                continue; // Pula para a próxima iteração do loop
            }
            somaIdade += idade; // Acumula a idade
            contador++;           // Incrementa o número de pessoas
        }
        if (contador > 0) {
            double media = (double) somaIdade / contador;
            System.out.printf("A média de idade do grupo é: " + media);
        } else {
            System.out.println("Nenhuma foi digitada");
        }
        }
        
    }
}
