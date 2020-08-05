/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author AKSHAT
 */
/*<applet code = "Calculator.class" width = 300 height = 400>
</applet>*/
public class Calculator extends Applet implements ActionListener, ItemListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    Button b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
    Button b31,b32,b33,b34,b35,b36,b37;
    TextField t;
    int r, d, fact, yo;
    String s="";
    Font f1;
    char cr;
    Label l1;
    double d1 , d2, ans = 0.0;
    CheckboxGroup cg1;
    Checkbox ch1,ch2;
    public void init()
    {
        f1 = new Font("Arial", Font.BOLD, 24);
        setFont(f1);
        
        l1 = new Label("Angle in :");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("+");
        b12 = new Button("-");
        b13 = new Button("x");
        b14 = new Button("/");
        b15 = new Button("=");
        b16 = new Button(".");
        b17 = new Button("!");
        b18 = new Button("^");
        b19 = new Button("log");
        b20 = new Button("CE");
        b21 = new Button("DEL");
        b22 = new Button("+-");
        b23 = new Button("(^2)");
        b24 = new Button("sin");
        b25 = new Button("cos");
        b26 = new Button("tan");
        b27 = new Button("asin");
        b28 = new Button("acos");
        b29 = new Button("atan");
        b30 = new Button("sqrt");
        b31 = new Button("%");
        b32 = new Button("BIN");
        b33 = new Button("HEX");
        b34 = new Button("OCT");
        b35 = new Button("1/x");
        b36 = new Button("e^x");
        b37 = new Button("ln");
               
        cg1 = new CheckboxGroup();
        ch1 = new Checkbox("Radians", cg1, true);
        ch2 = new Checkbox("Degrees", cg1, false);
        
        setBackground(Color.LIGHT_GRAY);
        t = new TextField();
        setLayout(null);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);
        b31.addActionListener(this);
        b32.addActionListener(this);
        b33.addActionListener(this);
        b34.addActionListener(this);
        b35.addActionListener(this);
        b36.addActionListener(this);
        b37.addActionListener(this);
        
        ch1.addItemListener(this);
        ch1.setBounds(1200, 150, 150, 50);
        add(ch1);
        ch2.addItemListener(this);
        ch2.setBounds(1200, 200, 150, 50);
        add(ch2);
        
        l1.setBounds(1200, 100, 150, 50);
        add(l1);
        t.setBounds(550, 100, 540, 70);
        add(t);
        b1.setBounds(550, 200, 40, 40);
        add(b1);
        b2.setBounds(600, 200, 40, 40);
        add(b2);
        b3.setBounds(650, 200, 40, 40);
        add(b3);
        b4.setBounds(550, 250, 40, 40);
        add(b4);
        b5.setBounds(600, 250, 40, 40);
        add(b5);
        b6.setBounds(650, 250, 40, 40);
        add(b6);
        b7.setBounds(550, 300, 40, 40);
        add(b7);
        b8.setBounds(600, 300, 40, 40);
        add(b8);
        b9.setBounds(650, 300, 40, 40);
        add(b9);
        b10.setBounds(600, 350, 40, 40);
        add(b10);
        b11.setBounds(700, 350, 40, 40);
        add(b11);
        b12.setBounds(700, 300, 40, 40);
        add(b12);
        b13.setBounds(700, 250, 40, 40);
        add(b13);
        b14.setBounds(700, 200, 40, 40);
        add(b14);
        b15.setBounds(650, 350, 40, 40);
        add(b15);
        b16.setBounds(550, 350, 40, 40);
        add(b16);
        b17.setBounds(750, 200, 40, 40);
        add(b17);
        b18.setBounds(750, 250, 40, 40);
        add(b18);
        b19.setBounds(800, 300, 90, 40);
        add(b19);
        b20.setBounds(800, 200, 90, 40);
        add(b20);
        b21.setBounds(800, 250, 90, 40);
        add(b21);
        b22.setBounds(750, 300, 40, 40);
        add(b22);
        b23.setBounds(900, 350, 90, 40);
        add(b23);
        b24.setBounds(900, 200, 90, 40);
        add(b24);
        b25.setBounds(900, 250, 90, 40);
        add(b25);
        b26.setBounds(900, 300, 90, 40);
        add(b26);
        b27.setBounds(1000, 200, 90, 40);
        add(b27);
        b28.setBounds(1000, 250, 90, 40);
        add(b28);
        b29.setBounds(1000, 300, 90, 40);
        add(b29);
        b30.setBounds(800, 350, 90, 40);
        add(b30);
        b31.setBounds(750, 350, 40, 40);
        add(b31);
        b32.setBounds(550, 400, 90, 40);
        add(b32);
        b33.setBounds(650, 400, 90, 40);
        add(b33);
        b34.setBounds(750, 400, 90, 40);
        add(b34);
        b35.setBounds(1000, 350, 90, 40);
        add(b35);
        b36.setBounds(850, 400, 90, 40);
        add(b36);
        b37.setBounds(950, 400, 40, 40);
        add(b37);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String b = ae.getActionCommand();
      
        if(b == b15.getLabel())
        {
            d2 = Double.parseDouble(s);
            if(r == 1)
            {
                ans = d1 + d2;
            }
            else if(r == 2)
            {
                ans = d1-d2;
            }
            else if(r == 3)
            {
                ans = d1*d2;
            }
            else if(r == 4)
            {
                ans = d1/d2;
            }
            else if(r == 5)
            {
                ans = Math.pow(d1, d2);
            }
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b20.getLabel())
        {
            s = "";
            t.setText(s);
        }
        else if(b == b17.getLabel())
        { 
            fact = 1;
            r = Integer.parseInt(s);
            for(int i = 1; i <= r; i++)
            {
                fact *= i;
            }
            s = String.valueOf(fact);
            t.setText(String.valueOf(fact));
        }
        else if(b == b19.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = Math.log10(d1);
            s = String.valueOf(ans);
            t.setText(String.valueOf(ans));
        }
        else if(b == b21.getLabel())
        {
            r = s.length();
            s = s.substring(0, r-1);
            t.setText(s);
        }
        else if(b == b22.getLabel())
        {
            d1 = Double.parseDouble(s);
            d1 *= -1;
            s = String.valueOf(d1);
            t.setText(s);
        }
        else if(b == b23.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = d1 * d1;
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b24.getLabel())
        {
            d1 = Double.parseDouble(s);
            if(yo == 2)
            {
                d1 = d1 / 180 * 3.14159265;
            }
            ans = Math.sin(d1);
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b25.getLabel())
        {
            d1 = Double.parseDouble(s);
            if(yo == 2)
            {
                d1 = d1 / 180 * 3.14159265;
            }
            ans = Math.cos(d1);
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b26.getLabel())
        {
            d1 = Double.parseDouble(s);
            if(yo == 2)
            {
                d1 = d1 / 180 * 3.14159265;
            }
            ans = Math.tan(d1);
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b35.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = 1 / d1;
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b27.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = Math.asin(d1);
            if(yo == 2)
            {
                ans = ans * 180 / 3.14159265;
            }
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b28.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = Math.acos(d1);
            if(yo == 2)
            {
                ans = ans * 180 / 3.14159265;
            }
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b29.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = Math.atan(d1);
            if(yo == 2)
            {
                ans = ans * 180 / 3.14159265;
            }
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b30.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = Math.sqrt(d1);
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b31.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = d1/100;
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b32.getLabel())
        {
            d1 = Double.parseDouble(s);
            s = "";
            r = (int)d1;
            while(r != 0)
            {
                d = r % 2;
                r /= 2;
                s = String.valueOf(d) + s;
            }
            t.setText(s);
            s = "";
        }
        else if(b == b33.getLabel())
        {
            d1 = Double.parseDouble(s);
            r = (int)d1;
            s = "";
            while(r != 0)
            {
                d = r % 16;
                r /= 16;
                switch(d)
                {
                    case 10:
                        s = 'A'+s;
                        break;
                    case 11:
                        s = 'B'+s;
                        break;
                    case 12:
                        s = 'C'+s;
                        break;
                    case 13:
                        s = 'D'+s;
                        break;
                    case 14:
                        s = 'E'+s;
                        break;
                    case 15:
                        s = 'F'+s;
                        break;
                    default:
                        s = String.valueOf(d) + s;
                }
            }
            t.setText(s);
            s = "";
        }
        else if(b == b34.getLabel())
        {
            d1 = Double.parseDouble(s);
            r = (int)d1;
            s = "";
            while(r != 0)
            {
                d = r%8;
                r /= 8;
                s = String.valueOf(d) + s;
            }
            t.setText(s);
            s = "";
        }
        else if(b == b36.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = Math.pow(2.71828183, d1);
            s = String.valueOf(ans);
            t.setText(s);
        }
        else if(b == b37.getLabel())
        {
            d1 = Double.parseDouble(s);
            ans = Math.log(d1);
            s = String.valueOf(ans);
            t.setText(s);;
        }
        else
        {
            if(b == b11.getLabel())
            {    
                r = 1;
                d1 = Double.parseDouble(s);
                s = "";
                t.setText(s);
            }
            else if(b == b12.getLabel())
            {
                r = 2;
                d1 = Double.parseDouble(s);
                s = "";
                t.setText(s);
            }
            else if(b == b13.getLabel())
            {
                r = 3;
                d1 = Double.parseDouble(s);
                s = "";
                t.setText(s);
            }
            else if(b == b14.getLabel())
            {
                r = 4;
                d1 = Double.parseDouble(s);
                s = "";
                t.setText(s);
            }
            else if(b == b18.getLabel())
            {
                r = 5;
                d1 = Double.parseDouble(s);
                s = "";
                t.setText(s);
            }
            else
            {
                s=s.concat(b);
                t.setText(s);
            }
        }
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(ch1.getState())
        {
            yo = 1;
        }
        else if(ch2.getState())
        {
            yo = 2;
        }
    }
    public void paint(Graphics g)
    {
        
    }
}
