package macias.nelson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private JLabel etiqueta;
    private JTextField campo;
    private JButton boton;
    private JDialog venDialogo;
    private JLabel mensaje;

    public Ventana() {
        super("Juego de Numeros");
        etiqueta = new JLabel("'Juguemos' Dime un numero: ");
        campo = new JTextField(5);
        boton = new JButton("Jugar");
        mensaje = new JLabel("");


        venDialogo = new JDialog(this);
        venDialogo.setBounds(550, 350, 300, 150);


        FlowLayout f = new FlowLayout();
        setLayout(f);

        add(etiqueta);
        add(campo);
        add(boton);

        venDialogo.add(mensaje);
        boton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        //System.out.println("esto funciona");
                                        jugar();

                                    }
                                }
        );

    }

    private void jugar() {

        String valor = campo.getText();
        int num = Integer.parseInt(valor);
        num++;

        mensaje.setText(" Mi numero es ═ " + num + "....Te gane  ☺ ");
        venDialogo.setVisible(true);
    }

}
