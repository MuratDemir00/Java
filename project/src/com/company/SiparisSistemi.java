package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiparisSistemi extends JFrame{



        SiparisSistemi()
        {


            JCheckBox c1 = new JCheckBox("Elbise");
            c1.setBounds(50,50,100,20);
            JCheckBox c2 = new JCheckBox("Pantolon");
            c2.setBounds(50,80,100,20);

            JCheckBox c3 = new JCheckBox("Gömlek");
            c3.setBounds(50,110,100,20);

            JButton b1 = new JButton("Satın Al");
            b1.setBounds(50,140,100,20);



            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    double total = 0;
                    String mesaj = "";
                    if(c1.isSelected())
                    {
                        total += 200;
                        mesaj += "Elbise 200 TL\n";
                    }
                    if(c2.isSelected())
                    {
                        total += 300;
                        mesaj += "Pantolon 300 TL\n";
                    }
                    if(c3.isSelected())
                    {
                        total += 150;
                        mesaj += "Gömlek 150 TL\n";

                    }
                   JOptionPane.showMessageDialog(null,mesaj + "\nToplam Borç : " + total,
                          "Borç Bilgisi",JOptionPane.PLAIN_MESSAGE);



                }
            });
            add(c1);
            add(c2);
            add(c3);
            add(b1);

            setSize(600,600);
            setLayout(null);
            setVisible(true);


        }





}
