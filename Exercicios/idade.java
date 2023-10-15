package Exercicios;

import javax.swing.JOptionPane;

public class idade {
    public static void main(String[] args) {
        int anos, meses, dias, idade_dias;
        anos = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Quantos anos você tem?", JOptionPane.QUESTION_MESSAGE));
        meses = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Quantos meses você tem?", JOptionPane.QUESTION_MESSAGE));
        dias = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Quantos dias você tem?", JOptionPane.QUESTION_MESSAGE));

        idade_dias =  (anos*365) + (meses*12) + dias;

        JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + idade_dias);
    }
}