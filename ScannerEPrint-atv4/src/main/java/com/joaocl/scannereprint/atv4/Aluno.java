/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joaocl.scannereprint.atv4;

/**
 *
 * @author joaocl
 */
public class Aluno {
    private String nome;
    private double nota1, nota2;
    
    public Aluno(){
        
    }
    
    public String getNome(){
        return nome;   
    }
    public Double getNota1(){
        return nota1;
    }
    public Double getNota2(){
        return nota2;
    }
    public Double getMedia(){
        return (nota2 + nota1)/2;
    }
    
    public void setNome(String nome){
         this.nome = nome;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    
    
    
    
    
}
