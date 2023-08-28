package ELE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener{

    String atype, meter;
    Home(String atype, String meter) {
        this.atype = atype;
        this.meter = meter;
        setLayout(null);
        setBounds(300, 100, 700, 600);
        setResizable(false);

        ImageIcon i1 =  new ImageIcon("electrical.png");
        Image i2 = i1.getImage().getScaledInstance(700, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        mb.setBackground(new Color(0XFF5757));
        setJMenuBar(mb);
        
        JMenu master = new JMenu("Administrator");
        master.setFont(new Font("arial", Font.BOLD, 25));
        master.setForeground(Color.black);
        
        
        JMenuItem Newcustomer = new JMenuItem("New Customer");
        Newcustomer.setFont(new Font("arial", Font.BOLD, 15));
        Newcustomer.setBackground(Color.WHITE);
        Newcustomer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        Newcustomer.setPreferredSize(new Dimension(170, 50));
        Newcustomer.addActionListener(this);
        master.add(Newcustomer);
        
        JMenuItem Customerdetails = new JMenuItem("Customer Details");
        Customerdetails.setFont(new Font("arial", Font.BOLD, 15));
        Customerdetails.setBackground(Color.WHITE);
        Customerdetails.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        Customerdetails.setPreferredSize(new Dimension(170, 50));
        Customerdetails.addActionListener(this);
        master.add(Customerdetails);
     
        JMenuItem Calculatebill = new JMenuItem("Calculate Bill");
        Calculatebill.setFont(new Font("arial", Font.BOLD, 15));
        Calculatebill.setBackground(Color.WHITE);
        Calculatebill.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        Calculatebill.setPreferredSize(new Dimension(170, 50));
        Calculatebill.addActionListener(this);
        master.add(Calculatebill);
        
        JMenu info = new JMenu("Information");
        info.setFont(new Font("arial", Font.BOLD, 25));
        info.setForeground(Color.black);
        
        
        JMenuItem Viewinformation = new JMenuItem("View Information");
        Viewinformation.setFont(new Font("arial", Font.BOLD, 15));
        Viewinformation.setBackground(Color.WHITE);
        Viewinformation.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        Viewinformation.setPreferredSize(new Dimension(170, 50));
        Viewinformation.addActionListener(this);
        info.add(Viewinformation);
   
        if (atype.equals("Admin")) {
            mb.add(master);
        } else {
            mb.add(info);
        }
        
        setLayout(new FlowLayout());
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("New Customer")) {
            new NewCustomer();
        } else if (msg.equals("Customer Details")) {
            new CustomerDetails();
        } else if (msg.equals("Calculate Bill")) {
            new CalculateBill();
        } else if (msg.equals("View Information")) {
            new ViewInformation(meter);
        } 
    }

    public static void main(String[] args) {
        new Home("", "");
    }
}