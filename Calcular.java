/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculomedia;

/**
 *
 * @author douglas.ssilva72
 */
public class Calcular {
    
    public double calcularMedia(Aluno aluno){
        
        double media = (aluno.nota1 + aluno.nota2 + aluno.nota3) / 3;
        return media;
    }
    
    public String situacao(double media, Aluno aluno){
        
        if(media >= 6)
            return aluno.situacao = "Aprovado";
        else
            return aluno.situacao = "Reprovado";
    }    
}
