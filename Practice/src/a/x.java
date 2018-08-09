package a;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class x extends JFrame implements ActionListener {

	private JButton jb,jb2;
	private JPanel jp;
	private JTextField jt1;
	private JTextField jt2;
	private JLabel l;
	public x () {
		
		setTitle("Math Program");
		l = new JLabel();
		setSize(500,500);
		jp = new JPanel();
		jp.setBackground(Color.GRAY);
		jb=new JButton("Add");
		jb2=new JButton("Subtract");
		jt1 = new JTextField();
		jt1.setPreferredSize(new Dimension(50,50));
		jt2 = new JTextField();
		jt2.setPreferredSize(new Dimension(50,50));
		jp.add(jt1);
		jp.add(jt2);
		jp.add(jb);
		jp.add(jb2);	
		jp.add(l);
		add(jp);
		
		setVisible(true);
	
		jb.addActionListener(this);
		jb2.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		new x();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JButton buttonCalled = (JButton) e.getSource();
        String buttonValue = buttonCalled.getText();
        
        
		int x = Integer.parseInt(jt1.getText());
		int y = Integer.parseInt(jt2.getText());
		
		if(buttonValue.equals("Add")) {
			l.setText(x+y+"");
		}
		else {
			l.setText(x-y+"");	
		}
		
	}
	
}
