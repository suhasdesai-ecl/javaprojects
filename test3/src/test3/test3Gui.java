package test3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JComboBox;

public class test3Gui {

	JFrame mainFrame;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textAddress;
	private JTextField textAddress2;
	private JTextField textCity;
	private JTextField textZip;
	private JTextField textGrade;
	static String[] col1 = new String[230];
	static String[] col2 = new String[230];
	static String[] retcol1 = new String[230];
	static String[] page1data = new String[100];
	private JTextField textStudentID;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	System.out.println("in main");
					test3Gui window = new test3Gui();
					window.mainFrame.setVisible(true);//this is where it goes to initialize
				//	System.out.println("after frame visible line");
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test3Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
		private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 626, 441);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		//System.out.println("in initialize");
		JPanel panel = new JPanel();
		panel.setForeground(Color.GREEN);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 600, 402);
		panel.setLayout(null);
		mainFrame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Enrollment System");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBounds(10, 11, 579, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblFirstName = new JLabel("FirstName");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblFirstName.setForeground(Color.GREEN);
		lblFirstName.setBounds(10, 86, 161, 14);
		panel.add(lblFirstName);
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setForeground(Color.GREEN);
		lblLastname.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblLastname.setBounds(232, 88, 161, 14);
		panel.add(lblLastname);
		
		textFirstName = new JTextField();
		textFirstName.setBounds(10, 111, 200, 20);
		panel.add(textFirstName);
		textFirstName.setColumns(10);
		System.out.println(textFirstName.getText());
		
		
		textLastName = new JTextField();
		textLastName.setColumns(10);
		textLastName.setBounds(232, 111, 200, 20);
		panel.add(textLastName);
		
		
		JLabel lblDOB = new JLabel("D.O.B.");
		lblDOB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblDOB.setForeground(Color.GREEN);
		lblDOB.setBounds(463, 88, 127, 14);
		panel.add(lblDOB);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setForeground(Color.GREEN);
		formattedTextField.setBounds(463, 111, 112, 20);
		panel.add(formattedTextField);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.GREEN);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblAddress.setBounds(10, 142, 161, 14);
		panel.add(lblAddress);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(10, 167, 200, 20);
		panel.add(textAddress);
		
		
		textAddress2 = new JTextField();
		textAddress2.setColumns(10);
		textAddress2.setBounds(232, 167, 200, 20);
		panel.add(textAddress2);
		
		JLabel lblAddress_2 = new JLabel("Address2");
		lblAddress_2.setForeground(Color.GREEN);
		lblAddress_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblAddress_2.setBounds(232, 142, 161, 14);
		panel.add(lblAddress_2);
		
		JFormattedTextField formattedTxtSphn = new JFormattedTextField();
		formattedTxtSphn.setForeground(Color.GREEN);
		formattedTxtSphn.setBounds(463, 167, 112, 20);
		panel.add(formattedTxtSphn);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.GREEN);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPhone.setBounds(459, 142, 161, 14);
		panel.add(lblPhone);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setForeground(Color.GREEN);
		lblCity.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblCity.setBounds(10, 198, 161, 20);
		panel.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setForeground(Color.GREEN);
		lblState.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblState.setBounds(232, 198, 88, 20);
		panel.add(lblState);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setForeground(Color.GREEN);
		lblZip.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblZip.setBounds(363, 198, 88, 20);
		panel.add(lblZip);
		
		textCity = new JTextField();
		textCity.setColumns(10);
		textCity.setBounds(10, 229, 200, 20);
		panel.add(textCity);
		
		textZip = new JTextField();
		textZip.setColumns(10);
		textZip.setBounds(363, 229, 79, 20);
		
		
		panel.add(textZip);
		
		JLabel lblGrade = new JLabel("GradeLevel");
		lblGrade.setForeground(Color.GREEN);
		lblGrade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblGrade.setBounds(10, 260, 161, 20);
		panel.add(lblGrade);
		
		textGrade = new JTextField();
		textGrade.setColumns(10);
		textGrade.setBounds(10, 292, 88, 20);
		
		panel.add(textGrade);
		
		Button buttonNextPage = new Button("Next Page");
		buttonNextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonNextPage) {
				//
					page1data[0]=textFirstName.getText(); //0 is student firstname
					page1data[1]=textLastName.getText(); //1 is student Lastname
					page1data[2]=textAddress.getText(); //2 is student Address1
					page1data[3]=textAddress2.getText(); //3 is student Address2
					page1data[4]=textCity.getText();//4 is student city
					page1data[6]=textZip.getText();//6 is student zip
					page1data[7]=textGrade.getText();//7 is student grade level;
					page1data[8]=textStudentID.getText();

				//
					ManageTempDatabase.addTempDatabase("", page1data, null,null);
					mainFrame.dispose();
					test3s ts = new test3s();
					ts.lblStudentID.setText(page1data[8]);
					ts.frame.setVisible(true);
				}
			}
		});
		buttonNextPage.setForeground(new Color(64, 0, 64));
		buttonNextPage.setBounds(438, 355, 123, 22);
		panel.add(buttonNextPage);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String url = "jdbc:mysql://localhost:3306/studentdb";
					ConnectMySql.getConnection(url);
				}catch(Exception err) {System.out.println(err);}
			}
		});
		btnSave.setBackground(new Color(0, 255, 0));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSave.setBounds(10, 336, 161, 41);
		panel.add(btnSave);
	    retcol1 = getstates.getStates();	//get states in string[] retcol1
		JComboBox comboBox = new JComboBox(retcol1);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==comboBox) {
					comboBox.setSelectedIndex(comboBox.getSelectedIndex());
					String selectedState = (String)comboBox.getSelectedItem();
					page1data[5]=selectedState;
				}
			}
		});
		comboBox.setBounds(232, 229, 79, 22);
		
		panel.add(comboBox);
		
		JLabel lblStudentID = new JLabel("StudentID");
		lblStudentID.setForeground(Color.GREEN);
		lblStudentID.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblStudentID.setBounds(10, 42, 161, 15);
		panel.add(lblStudentID);
		
		textStudentID = new JTextField();
		textStudentID.setColumns(10);
		textStudentID.setBounds(10, 60, 200, 20);
		panel.add(textStudentID);
		
		
		
	}

	
}
