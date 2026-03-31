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
public class ex2_2_celsiusParaFahren {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Digite uma Temperatura em celsius: ");
        double temperatura = input.nextInt();
        double fahrenheit = (temperatura * 9 / 5) + 32;
        
        System.out.println("Temperatura em fahrenheit: " + fahrenheit);
        
       
        
    }
}
