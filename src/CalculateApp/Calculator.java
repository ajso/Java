package CalculateApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField; //the text field to be used.
    JButton[] numButton = new JButton[10]; // array of numbers on a button.
    JButton[] functionButtons = new JButton[8]; // array of function buttons(+,-,/,* etc)
    //function buttons
    JButton addButton, subButton, divideButton, multButton, decimalButton, equalButton, deleteButton, clearButton;
    JPanel panel;

    //declare the font to use on the buttons
    Font myFont = new Font("Ink Free", Font.PLAIN, 20);
    double num1 = 0, num2 = 0, result = 0;
    char operator; //will hold the operating function i.e +,* etc


    //Constructor
    public Calculator() {

        //Initialize the frame
        frame = new JFrame("Calculator App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setResizable(false);

        //Adding the textField
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont); //the font in the textField
        textField.setEditable(false); //prevent direct typing into the textField

        //Adding Buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        multButton = new JButton("*");
        divideButton = new JButton("/");
        decimalButton = new JButton(".");
        equalButton = new JButton("=");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");

        //Adding the button to the functionsButtons Array.
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = multButton;
        functionButtons[3] = divideButton;
        functionButtons[4] = decimalButton;
        functionButtons[5] = equalButton;
        functionButtons[6] = deleteButton;
        functionButtons[7] = clearButton;

        //using a for loop, distribute the functionButtons
        for (int i = 0; i < functionButtons.length; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        //for loop to iterate through the numButtons
        for (int i = 0; i < numButton.length; i++) {
            //instantiate the number buttons
            numButton[i] = new JButton(String.valueOf(i));
            numButton[i].addActionListener(this);
            numButton[i].setFont(myFont);
            numButton[i].setFocusable(false);
        }

        //setting separate bounds for the delete and clear buttons
        deleteButton.setBounds(50, 430, 145, 50);
        clearButton.setBounds(205, 430, 145, 50);

        //creating a panel to hold all the different buttons.
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10)); //rows, column, horizontal gap, vertical gap
//        panel.setBackground(Color.lightGray);

        //Adding the function buttons and the number buttons to the panel
        //First Row
        panel.add(numButton[1]);
        panel.add(numButton[2]);
        panel.add(numButton[3]);
        panel.add(addButton);

        //Second Row
        panel.add(numButton[4]);
        panel.add(numButton[5]);
        panel.add(numButton[6]);
        panel.add(subButton);

        //Third Row
        panel.add(subButton);
        panel.add(numButton[7]);
        panel.add(numButton[8]);
        panel.add(numButton[9]);


        //Fourth Row
        panel.add(divideButton);
        panel.add(decimalButton);
        panel.add(numButton[0]);
        panel.add(equalButton);
        panel.add(multButton);


        frame.add(panel);
        frame.add(deleteButton); //adding the delete button to the frame
        frame.add(clearButton); //adding the clear button to the frame
        frame.add(textField); //adding the textField to the frame


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //setting an onClick of the buttons
        for (int i = 0; i < numButton.length; i++) { //loop through the 10 buttons
            if (e.getSource() == numButton[i]) {
                //push to the textField the value of the button clicked(Update the textField)
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        //setting the onClick for the functions buttons.
        //decimal button
        if (e.getSource() == decimalButton) {
            textField.setText(textField.getText().concat("."));
        }
        //add
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText(""); //clear the textField
        }
        //subtract
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText(""); //clear the textField
        }
        //MultiPly
        if (e.getSource() == multButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText(""); //clear the textField
        }
        //Divide
        if (e.getSource() == divideButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText(""); //clear the textField
        }

        //Working on the equals button

    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

    }
}
