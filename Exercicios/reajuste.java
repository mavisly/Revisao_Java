package Exercicios;

import javax.swing.JOptionPane;

public class reajuste {
    public static void main (String[]args){
        float saldo;
        double reajuste;
        saldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o saldo a ser reajustado: "));
        reajuste = (saldo * 0.01) + saldo;

        JOptionPane.showMessageDialog(null, "Saldo reajustado: "+reajuste);

    }
}
