package com.joaocl.exbasicos.atv6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author joaocl
 */
public class ex1_4_cuboEQuadrado {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Digite um numero: ");
        int n1 = input.nextInt();
        double quadrado = Math.pow(n1, 2);
        double cubo = Math.pow(n1, 3);
        
        System.out.println("O quadrado e: " + quadrado + ", e o cubo: " + cubo + ".");
        
       
        
    }
}
