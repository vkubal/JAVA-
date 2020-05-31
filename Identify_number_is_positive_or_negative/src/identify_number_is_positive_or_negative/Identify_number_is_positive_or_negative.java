/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identify_number_is_positive_or_negative;
import java.awt.*;
import java.awt.event.*;

class identity extends Frame implements ActionListener {  
    Label l1;
    Button b1;
    TextField t1;
    int a;

    identity()
    {
        setLayout (new FlowLayout());
        l1 = new Label("enter no");
        t1 = new TextField(5);
        b1 = new Button("check");
        add(l1);
        add(t1);
        add(b1);
        b1.addActionListener( this );
        setSize(300,300);
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            int a = Integer.parseInt(t1.getText());
            if(a>0){
                l1.setText("positive");
            }
            else if(a<0){
                l1.setText("negative");
              
            }
            else {
                l1.setText("neither positive nor negative");
            }
   
        }
    }  
}
/**
 *
 * @author Vikram
 */
public class Identify_number_is_positive_or_negative {


    public static void main(String[] args) {
        identity obj=new identity();
    }
    
}
