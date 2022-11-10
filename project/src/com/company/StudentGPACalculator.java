package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGPACalculator extends JFrame{
    private JPanel StudentGPA;
    private JTextField name;
    private JTextField surname;
    private JTextField midterm;
    private JTextField final1;
    private JTextField total;
    private JTextField average;
    private JTextField gpa;
    private JButton calculateButton;




    StudentGPACalculator()
    {



        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double e1,e2;
                double total1 = 0,avg;

                e1 = Double.parseDouble(midterm.getText());
                e2 = Double.parseDouble(final1.getText());
                total1 = e1 + e2;
                total.setText(String.valueOf(total1));

                avg = total1 / 2;

                average.setText(String.valueOf(avg));

                if(avg < 50)
                    gpa.setText("Fail !! ");
                else
                    gpa.setText("Success!! ");


            }
        });


    }

}
