/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculomedia;

/**
 *
 * @author douglas.ssilva72
 */
public class CalculoMedia {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        aluno1.nota1 = 8;
        aluno1.nota2 = 7;
        aluno1.nota3 = 9;
        
        Calcular calculadora = new Calcular();
        
        double media = calculadora.calcularMedia(aluno1);
        
        String situacao = calculadora.situacao(media, aluno1);
        
        System.out.println("A media foi: " + media + " e o aluno esta: " + situacao);
        
    }
}
