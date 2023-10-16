package Exercicios;
import javax.swing.JOptionPane;

public class media {
    public static void main (String[]args){
        float media_a, media_b, soma_media, media_media;

        media_a = (8+9+7)/3;
        media_b = (4+5+6)/3;
        soma_media = media_a + media_b;
        media_media = (media_a + media_b)/2;

        JOptionPane.showMessageDialog(null, "A média aritmética dos números 7, 8 e 9 é: "+ media_a);
        JOptionPane.showMessageDialog(null, "A média aritmética dos números 4, 5 e 6 é: "+ media_b);
        JOptionPane.showMessageDialog(null, "A soma das duas médias é : "+ soma_media);
        JOptionPane.showMessageDialog(null, "A média das duas médias é: "+ media_media);

    }
}
