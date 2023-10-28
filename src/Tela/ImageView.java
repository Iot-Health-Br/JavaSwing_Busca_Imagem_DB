package Tela;

import javax.swing.*;
import javax.swing.JFrame;

import Controle.INomeControle;
import Controle.NomeControle;
import Modelo.NomeModelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageView extends javax.swing.JFrame  {
    private JTextField txt_Nome;
    private JPanel panelMain;
    private JButton btn_Buscar;
    private JLabel fotoLabel;
    INomeControle controle = new NomeControle();

    public ImageView() {
        btn_Buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txt_Nome.getText().toUpperCase();
                NomeModelo pessoa = controle.buscarPorNome(nome);
                if (pessoa != null) {
                    ImageIcon image = new ImageIcon(pessoa.getFoto());
                    fotoLabel.setIcon(image);
                    fotoLabel.setSize(300, 400);
                } else {
                    JOptionPane.showMessageDialog(null, "Pessoa não encontrada!");
                }
            }
        });
    }

    public static void main(String[] args) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("APP");
                frame.setContentPane(new ImageView().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
