import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Try3 extends JFrame implements ActionListener{
     Icon blank;
     Icon bart0=new ImageIcon("bart0.jpg");
     Icon bart1=new ImageIcon("bart1.jpg");
     Icon bart2=new ImageIcon("bart2.jpg");
     Icon bart3=new ImageIcon("bart3.jpg");
     Icon bart4=new ImageIcon("bart4.jpg");
     Icon bart5=new ImageIcon("bart5.jpg");
     Icon bart6=new ImageIcon("bart6.jpg");
     Icon bart7=new ImageIcon("bart7.jpg");
     Icon bart8=new ImageIcon("bart8.jpg");
     Icon bart9=new ImageIcon("bart9.jpg");
     Icon bart10=new ImageIcon("bart10.jpg");
     Icon bart11=new ImageIcon("bart11.jpg");
     JButton paper=new JButton(blank);
    JButton b0 = new JButton(bart0);
    
    JButton b1 = new JButton(bart1);
    JButton b2 = new JButton(bart2);
    JButton b3 = new JButton(bart3);
    JButton b4 = new JButton(bart4);
    JButton b5 = new JButton(bart5);
    JButton b6 = new JButton(bart6);
    JButton b7 = new JButton(bart7);
    JButton b8 = new JButton(bart8);
    JButton b9 = new JButton(bart9);
    JButton b10 = new JButton(bart10);
    JButton b11 = new JButton(bart11);
     public int x=0;
     public int y= 1;
    public Try3(){
        super("Swingin'Simpsons");
        setSize(460,370);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        GridLayout family = new GridLayout(3,4,1,1);
        pane.setLayout(family);
        b0.addActionListener(this);
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
        pane.add(b0);
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.add(b4);
        pane.add(b5);
        pane.add(b6);
        pane.add(b7);
        pane.add(b8);
        pane.add(b9);
        pane.add(b10);
        pane.add(b11);
        add(pane);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent evt){
        Object source = evt.getSource();
        
        setTitle("Swingin'Simpsons     current score: "+y);
        if(source == b0){
           Icon s1=b0.getIcon();
             if(b1.getIcon()==bart0){
                 x++;y++;
                 b1.setIcon(s1);
                 b0.setIcon(bart0);
              }else if(b4.getIcon()==bart0){
                 x++;y++;
                 b4.setIcon(s1);
                 b0.setIcon(bart0);}}

//qwq
        if(source == b1){
           Icon s2=b1.getIcon();
             if(b0.getIcon()==bart0){
                 b0.setIcon(s2);
                 b1.setIcon(bart0);x++;y++;
              }else if(b2.getIcon()==bart0){
                 b2.setIcon(s2);
                 b1.setIcon(bart0);x++;y++;
              }else if(b5.getIcon()==bart0){
                 b5.setIcon(s2);
                 b1.setIcon(bart0); x++;y++;}
              }

//qwq
          if(source == b2){
           Icon s1=b2.getIcon();
             if(b1.getIcon()==bart0){
                 b1.setIcon(s1);
                 b2.setIcon(bart0);x++;y++;
              }else if(b3.getIcon()==bart0){
                 b3.setIcon(s1);
                 b2.setIcon(bart0);x++;y++;
              }else if(b6.getIcon()==bart0){
                 b6.setIcon(s1);
                 b2.setIcon(bart0);x++;y++;}}
//qwq
        if(source == b3){
           Icon s1=b3.getIcon();
             if(b2.getIcon()==bart0){
                 b2.setIcon(s1);
                 b3.setIcon(bart0);x++;y++;
              }else if(b7.getIcon()==bart0){
                 b7.setIcon(s1);
                 b3.setIcon(bart0);x++;y++;}}
//qwq
        if(source == b4){
           Icon s1=b4.getIcon();
             if(b0.getIcon()==bart0){
                 b0.setIcon(s1);
                 b4.setIcon(bart0);x++;y++;
              }else if(b5.getIcon()==bart0){
                 b5.setIcon(s1);
                 b4.setIcon(bart0);x++;y++;
              }else if(b8.getIcon()==bart0){
                  b8.setIcon(s1);
                  b4.setIcon(bart0);x++;y++;}}
//qwq
         if(source == b5){
           Icon s1=b5.getIcon();
             if(b4.getIcon()==bart0){
                 b4.setIcon(s1);
                 b5.setIcon(bart0);x++;y++;
              }else if(b1.getIcon()==bart0){
                 b1.setIcon(s1);
                 b5.setIcon(bart0);x++;y++;
              }else if(b6.getIcon()==bart0){
                 b6.setIcon(s1);
                 b5.setIcon(bart0);x++;y++;
              }else if(b9.getIcon()==bart0){
                 b9.setIcon(s1);
                 b5.setIcon(bart0);x++;y++;}}
//qwq
        if(source == b6){
           Icon s1=b6.getIcon();
             if(b2.getIcon()==bart0){
                 b2.setIcon(s1);
                 b6.setIcon(bart0);x++;y++;
              }else if(b5.getIcon()==bart0){
                 b5.setIcon(s1);
                 b6.setIcon(bart0);x++;y++;
              }else if(b7.getIcon()==bart0){
                 b7.setIcon(s1);
                 b6.setIcon(bart0);x++;y++;
              }else if(b10.getIcon()==bart0){
                 b9.setIcon(s1);
                 b6.setIcon(bart0);x++;y++;}
                }
//qwq
         if(source == b7){
           Icon s1=b7.getIcon();
             if(b3.getIcon()==bart0){
                 b3.setIcon(s1);
                 b7.setIcon(bart0);x++;y++;
              }else if(b6.getIcon()==bart0){
                 b6.setIcon(s1);
                 b7.setIcon(bart0);x++;y++;
              }else if(b11.getIcon()==bart0){
                 b11.setIcon(s1);
                 b7.setIcon(bart0);x++;y++;}}
//qwq
         if(source == b8){
           Icon s1=b8.getIcon();
             if(b4.getIcon()==bart0){
                 b4.setIcon(s1);
                 b8.setIcon(bart0);x++;y++;
              }else if(b9.getIcon()==bart0){
                 b9.setIcon(s1);
                 b8.setIcon(bart0);x++;y++;}}
//qwq
         if(source == b9){
           Icon s1=b9.getIcon();
             if(b8.getIcon()==bart0){
                 b8.setIcon(s1);
                 b9.setIcon(bart0);x++;y++;
              }else if(b5.getIcon()==bart0){
                 b5.setIcon(s1);
                 b9.setIcon(bart0);x++;y++;
              }else if(b10.getIcon()==bart0){
                 b10.setIcon(s1);
                 b9.setIcon(bart0);x++;y++;}}
//qwq
          if(source == b10){
           Icon s1=b10.getIcon();
             if(b9.getIcon()==bart0){
                 b9.setIcon(s1);
                 b10.setIcon(bart0);x++;y++;
              }else if(b6.getIcon()==bart0){
                 b6.setIcon(s1);
                 b10.setIcon(bart0);x++;y++;
              }else if(b11.getIcon()==bart0){
                 b11.setIcon(s1);
                 b10.setIcon(bart0); x++;y++;
               }}
//qwq
          if(source == b11){
           Icon s1=b11.getIcon();
             if(b10.getIcon()==bart0){
                 b10.setIcon(s1);
                 b11.setIcon(bart0);x++;y++;
              }else if(b7.getIcon()==bart0){
                 b7.setIcon(s1);
                 b11.setIcon(bart0);x++;y++;}}
        
        if(b0.getIcon()==bart0 &&b1.getIcon()==bart1 && b2.getIcon()==bart2 && b3.getIcon()==bart3 &&b4.getIcon()==bart4 && b5.getIcon()==bart5 && b6.getIcon()==bart6 && b7.getIcon()==bart7 && b8.getIcon()==bart8 && b9.getIcon()==bart9 && b10.getIcon()==bart10 && b11.getIcon()==bart11){
            Try4 qaq =new Try4();}
         }
         class Try4 extends JFrame implements FocusListener {
            int z=x;
            JTextField name0= new JTextField("NONE",18);
            JTextField score0= new JTextField("0",18);
            
            JTextField name1= new JTextField("NONE",18);
            JTextField score1= new JTextField("0",18);
            
            JTextField name2= new JTextField("NONE",18);
            JTextField score2= new JTextField("0",18);
            
            JTextField name3= new JTextField("NONE",18);
            JTextField score3= new JTextField("0",18);
            
            JTextField name4= new JTextField("NONE",18);
            JTextField score4= new JTextField("0",18);
            
            JTextField name5= new JTextField("NONE",18);
            JTextField score5= new JTextField("0",18);
            
            JTextField name6= new JTextField("NONE",18);
            JTextField score6= new JTextField("0",18);
            
            JTextField name7= new JTextField("NONE",18);
            JTextField score7= new JTextField("0",18);
            
            JTextField name8= new JTextField("NONE",18);
            JTextField score8= new JTextField("0",18);
            
            JTextField name9= new JTextField("YOUR NAME:",18);
            JTextField score9= new JTextField("enter your name",18);
          public Try4(){
            super("HIGH SCORES");
            JPanel pane2=new JPanel();
            GridLayout family2=new GridLayout(10,2,1,1);
            score9.addFocusListener(this);
            name0.setEditable(false);
            score0.setEditable(false);
            name1.setEditable(false);
            score1.setEditable(false);
            name2.setEditable(false);
            score2.setEditable(false);
            name3.setEditable(false);
            score3.setEditable(false);
            name4.setEditable(false);
            score4.setEditable(false);
            name5.setEditable(false);
            score5.setEditable(false);
            name6.setEditable(false);
            score6.setEditable(false);
            name7.setEditable(false);
            score7.setEditable(false);
            name8.setEditable(false);
            score8.setEditable(false);
            name9.setEditable(false);
            pane2.setLayout(family2);
            pane2.add(name0);
            pane2.add(score0);
            pane2.add(name1);
            pane2.add(score1);
            pane2.add(name2);
            pane2.add(score2);
            pane2.add(name3);
            pane2.add(score3);
            pane2.add(name4);
            pane2.add(score4);
            pane2.add(name5);
            pane2.add(score5);
            pane2.add(name6);
            pane2.add(score6);
            pane2.add(name7);
            pane2.add(score7);
            pane2.add(name8);
            pane2.add(score8);
            pane2.add(name9);
            pane2.add(score9);
            add(pane2);
            pack();
            setVisible(true);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           }
           public void focusGained(FocusEvent event){
                   
                   score0.setText("score:  "+z);
                   String y=score9.getText();
                   name0.setText(y);}
         
           public void focusLost(FocusEvent event){
                focusGained(event);
             }
           }
public static void main(String[] args){
        Try3 wow = new Try3();
        }
}  
//import images//create buttons//for score//current score shows on the title
