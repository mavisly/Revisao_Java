package Exercicios;

import javax.swing.JOptionPane;

public class salario_minimo {
    public static void main (String[]args){
        float salarioMinimo, salarioUser, total;

        salarioMinimo = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o valor do salário mínimo atual?"));
        salarioUser = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o valor do seu salário?"));

        total = salarioUser/salarioMinimo;

        JOptionPane.showMessageDialog(null, "Você ganha "+ total + " salários mínimos.");
        
    }
}
