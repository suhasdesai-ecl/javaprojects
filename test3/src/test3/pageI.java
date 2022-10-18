package test3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.ImageIcon;

public class pageI {

	private JFrame frame;
	private JTextField textUsername;
	private JPasswordField passwordField;
	String loginUrl = "jdbc:mysql://localhost:3306/logindb";
    String[] col1 = new String[10];
    String[] col2 = new String[10];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pageI window = new pageI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pageI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 613, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIntro = new JLabel("Student Information");
		lblIntro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblIntro.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntro.setBounds(165, 29, 282, 29);
		frame.getContentPane().add(lblIntro);
		
		textUsername = new JTextField();
		textUsername.setBounds(257, 122, 139, 20);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setBounds(256, 91, 117, 20);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblPassword.setBounds(257, 153, 117, 20);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblLoginsts = new JLabel("");
		lblLoginsts.setBounds(505, 442, 82, 14);
		frame.getContentPane().add(lblLoginsts);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnLogin) {
				 //if(textUsername.getText().equals("Suhas") && passwordField.getText().equals("Suhas123")) {
			    	  //System.out.println("Success");
			    	 //lblLoginsts.setText("Success");	  
			         DatabaseConnect dbc = new DatabaseConnect();
				     try {
				    	 Connection logindbcon = dbc.getConnection(loginUrl);
				    	 if(logindbcon.equals(null)){
				    		 JOptionPane.showMessageDialog(null, "No Connection");
				    	 }else {
				    		 System.out.println("Connected");
				    		 DatabaseQuery dbq = new DatabaseQuery();
				    		 String[] result = dbq.logindbDatabase(logindbcon,"","",col1,col2,"getdata");
				    	 }       
				      } catch (Exception e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					    JOptionPane.showMessageDialog(null, "Problem with database/Connection");
				 	  }
					  for(int u=0;u < col1.length;u++){
		    			 //
		    			 if(col1[u].equals(textUsername.getText()+"-"+passwordField.getText())) {
				        		lblLoginsts.setText("Success");
				        		frame.dispose();
				        		ScreenOne scn = new ScreenOne();
				        		scn.label.setText(textUsername.getText());
				        		//scn.lblIntro2.setText("**");
				        		scn.screen1frame.setVisible(true);
		    			 }
		    			 //
		    		  }
				     
				}
			 }
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnLogin.setBounds(314, 228, 82, 23);
		btnLogin.setFocusable(false);
		frame.getContentPane().add(btnLogin);
		frame.getContentPane().add(lblLoginsts);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					System.out.println("Pressed Enter");
					btnLogin.requestFocus();
				}
			}
		});
		passwordField.setBounds(257, 184, 139, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnRegister.setFocusable(false);
		btnRegister.setBounds(294, 276, 102, 23);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SHUHA\\Downloads\\school_logo.jpg"));
		lblNewLabel.setBounds(29, 29, 68, 55);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
