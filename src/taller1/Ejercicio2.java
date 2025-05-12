
package taller1;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Andonio Aguilar
 */
public class Ejercicio2 extends JFrame {
    JTextField txtTexto;
    JLabel etiTexto1, etiTexto2;
    JButton btnTraspasa1, btnTraspasa2;

    public Ejercicio2() {
        setLayout(null);
        setTitle("Ejercicio 2");
        setSize(400, 200);

        txtTexto = new JTextField();
        txtTexto.setBounds(50, 20, 200, 25);
        add(txtTexto);

        etiTexto1 = new JLabel("");
        etiTexto1.setBounds(50, 60, 200, 20);
        add(etiTexto1);

        etiTexto2 = new JLabel("");
        etiTexto2.setBounds(50, 90, 200, 20);
        add(etiTexto2);

        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa1.setBounds(260, 60, 120, 25);
        add(btnTraspasa1);

        btnTraspasa2 = new JButton("Traspasa 2");
        btnTraspasa2.setBounds(260, 90, 120, 25);
        add(btnTraspasa2);

        btnTraspasa1.addActionListener(e -> etiTexto1.setText(txtTexto.getText()));
        btnTraspasa2.addActionListener(e -> etiTexto2.setText(txtTexto.getText()));
    }

    public static void main(String[] args) {
        new Ejercicio2().setVisible(true);
    }
}
