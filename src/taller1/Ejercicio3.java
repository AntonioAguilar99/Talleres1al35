
package taller1;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Andonio Aguilar
 */
public class Ejercicio3 extends JFrame {
    JTextField txtTexto;
    JLabel etiTexto;
    JButton btnVaciar;

    public Ejercicio3() {
        setLayout(null);
        setTitle("Ejercicio 3");
        setSize(400, 200);

        txtTexto = new JTextField();
        txtTexto.setBounds(50, 30, 200, 25);
        add(txtTexto);

        etiTexto = new JLabel("");
        etiTexto.setBounds(50, 70, 200, 25);
        add(etiTexto);

        btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(50, 110, 100, 25);
        add(btnVaciar);

        txtTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                etiTexto.setText(txtTexto.getText());
            }
        });

        btnVaciar.addActionListener(e -> {
            txtTexto.setText("");
            etiTexto.setText("");
        });
    }

    public static void main(String[] args) {
        new Ejercicio3().setVisible(true);
    }
}
