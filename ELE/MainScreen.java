package ELE;

import javax.swing.*;
import java.awt.*;

public class MainScreen {
        
    JFrame frame;
    
    ImageIcon i1 =new ImageIcon("icon/electricity.png");
    Image i2 = i1.getImage();
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    JLabel text=new JLabel("                      Power-x ");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();
    MainScreen() {
        createGUI();
        addImage();
        addText();
        addProgressBar();
        runningPBar();
    }
    
    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null); 
        frame.setUndecorated(true);
        frame.setSize(600,600); 
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0X45e6e6)); 
        frame.setVisible(true);
    } 

    public void addImage(){
        image.setBounds(90, 70, 400, 200);
        frame.add(image);
    }
    
    public void addText()
    {
        text.setFont(new Font("arial",Font.BOLD,22));
        text.setBounds(120,300,400,50);
        text.setForeground(Color.black);
        frame.add(text);
    }
    
    public void addProgressBar(){
        progressBar.setBounds(100,380,400,30); 
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.black);
        progressBar.setForeground(new Color(0X42f55d));
        progressBar.setValue(0);
        frame.add(progressBar);
    }
    public void runningPBar(){
        int i=0;
        while( i<=100)
        {
            try{
                Thread.sleep(10);
                progressBar.setValue(i);    
                i++;
                if(i==100)
                    frame.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
   
    
    public static void main(String[] args) {
        new MainScreen();
        new Login();
    }
}
