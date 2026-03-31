/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.joaocl.scannereprint.atv4;
import java.util.Scanner;
/**
 *
 * @author joaocl
 */
public class ScannerEPrintAtv4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        
        Aluno aluno1 = new Aluno();
        System.out.println("Qual e o seu nome?");
        aluno1.setNome(input.nextLine());
        System.out.println("Qual e a sua nota1?");
        aluno1.setNota1(input.nextDouble());
        System.out.println("Qual e a sua nota2?");
        aluno1.setNota2(input.nextDouble());
        
        
        
        System.out.println("Seu nome: " + aluno1.getNome());
        System.out.println("Suas Notas: AV1(" + aluno1.getNota1() + ") AV2(" + aluno1.getNota2()+ ").");
        System.out.printf("Sua media: " + aluno1.getMedia());
        if(aluno1.getMedia() > 6){
            System.out.println("  Voce Foi Aprovado!");
        }
        else{
            System.out.println("  Voce foi reprovado!");
        }
    }
}
