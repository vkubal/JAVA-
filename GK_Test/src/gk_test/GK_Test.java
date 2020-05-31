/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gk_test;
import java.awt.*;
import java.awt.event.*;
class gk extends Frame implements ItemListener{
    Label l1,l2,l3,l4;
    CheckboxGroup cg1,cg2,cg3;
    Checkbox c1,c2,c3,c4,c5,c6;
    int count=0;
    
    gk() {
        
        setLayout(new FlowLayout());
        l1=new Label("who is pm?");
        l2=new Label("who is cm of maharashtra?");
        l3=new Label("who is cm of bihar?");
        l4=new Label(" ");
        cg1=new CheckboxGroup();
        cg2=new CheckboxGroup();
        cg3=new CheckboxGroup();
        c1=new Checkbox("modi");
        c2=new Checkbox("sonia");
        c3=new Checkbox("uddhav");
        c4=new Checkbox("devendra");
        c5=new Checkbox("lalu");
        c6=new Checkbox("nitish");
        c1.setCheckboxGroup(cg1);
        c2.setCheckboxGroup(cg1);
        c3.setCheckboxGroup(cg2);
        c4.setCheckboxGroup(cg2);
        c5.setCheckboxGroup(cg3);
        c6.setCheckboxGroup(cg3);
        add(l1);
        add(c1);
        add(c2);
        add(l2);
        add(c3);
        add(c4);
        add(l3);
        add(c5);
        add(c6);
        add(l4);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this); 
        c6.addItemListener(this);
        setSize(300,300);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e) {
       int count=0;            
        if(c1.getState())
            count++;
        if(c3.getState())
            count++;
        if(c6.getState())
            count++;
        l4.setText(String.valueOf(count));
    }
}
/**
 *
 * @author Vikram
 */
public class GK_Test {

    public static void main(String[] args) {
       gk obj=new gk();
    }
    
}
