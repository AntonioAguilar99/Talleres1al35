/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author anton
 */
public class Ejercicio4 extends JFrame {
    JTextField txtNombre, txtCiudad;
    JLabel txtFrase;
    JButton btnAceptar, btnDesactivar, btnActivar;

    public Ejercicio4() {
        setLayout(null);
        setTitle("Ejercicio 4");
        setSize(400, 250);

        txtNombre = new JTextField();
        txtNombre.setBounds(50, 30, 150, 25);
        add(txtNombre);

        txtCiudad = new JTextField();
        txtCiudad.setBounds(50, 60, 150, 25);
        add(txtCiudad);

        txtFrase = new JLabel("");
        txtFrase.setBounds(50, 100, 300, 25);
        add(txtFrase);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(50, 140, 100, 25);
        add(btnAceptar);

        btnDesactivar = new JButton("Desactivar");
        btnDesactivar.setBounds(160, 140, 100, 25);
        add(btnDesactivar);

        btnActivar = new JButton("Activar");
        btnActivar.setBounds(270, 140, 100, 25);
        add(btnActivar);

        btnAceptar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            String ciudad = txtCiudad.getText();
            txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad + ".");
        });

        btnDesactivar.addActionListener(e -> {
            txtNombre.setEnabled(false);
            txtCiudad.setEnabled(false);
        });

        btnActivar.addActionListener(e -> {
            txtNombre.setEnabled(true);
            txtCiudad.setEnabled(true);
        });
    }

    public static void main(String[] args) {
        new Ejercicio4().setVisible(true);
    }
}
