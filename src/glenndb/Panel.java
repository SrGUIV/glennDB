/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glenndb;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author aluno
 */
public class Panel extends JFrame implements ActionListener{
    
    JButton submitButton;
    JLabel message;
    
    Panel(){
        
        message = new JLabel("Ai pai para!");
        
        message.setBounds(200, 200, 150, 50);
        message.setVisible(false);
        
        submitButton = new JButton();
        
        submitButton.setBounds(400, 300, 100, 50);
        submitButton.addActionListener(this);
        submitButton.setText("Cadastrar");
        submitButton.setFocusable(false);
        //submitButton.setIcon(icon);
        submitButton.setForeground(Color.white);
        submitButton.setBackground(new Color(49, 133, 71));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000, 800);
        this.setVisible(true);
        this.add(submitButton);
        this.add(message);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            System.out.println("Ai pai para");
            message.setVisible(true);

        }
    }
    
}
