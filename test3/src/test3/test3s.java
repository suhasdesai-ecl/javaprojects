package test3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;

public class test3s {

	JFrame frame;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textAddress1;
	private JTextField textAddress2;
	private JTextField textCity;
	JLabel lblStudentID;
	private String selectedRelation;
	private String selectedState;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3s window = new test3s();
					window.frame.getContentPane().setLayout(null);
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
	public test3s() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 595, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel panel = new Panel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Label label = new Label("New label");
		label.setBounds(186, 5, 62, 22);
		panel.add(label);
		
		Button buttonSecondScreen = new Button("MainScreen");
		buttonSecondScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonSecondScreen) {
					//System.out.println("next screen : " + lblStudentID.getText());
					String page2data[] = new String[100];
					page2data = test3Gui.page1data;
					String guafirstname = textFirstName.getText();
					String gualastname = textLastName.getText();
					page2data[10]=guafirstname;
					page2data[11]=gualastname;
					page2data[12]=selectedRelation;
					System.out.println(guafirstname+"   "+gualastname+"****"+selectedRelation);
					//String reltostudent = textRelField.getText();
                    ManageTempDatabase.addTempDatabase("", page2data, null,null);
					frame.dispose();
					test3Gui tg = new test3Gui();
					tg.mainFrame.setVisible(true);
				}
			}
		});
		buttonSecondScreen.setBounds(499, 463, 70, 22);
		panel.add(buttonSecondScreen);
		
		JLabel lblParentinfo = new JLabel("Guardians");
		lblParentinfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblParentinfo.setForeground(Color.GREEN);
		lblParentinfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblParentinfo.setBounds(174, 5, 221, 33);
		panel.add(lblParentinfo);
		
		JLabel lblFirstName = new JLabel("FirstName");
		lblFirstName.setForeground(Color.GREEN);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblFirstName.setBounds(10, 64, 92, 14);
		panel.add(lblFirstName);
		
		textFirstName = new JTextField();
		textFirstName.setColumns(10);
		textFirstName.setBounds(10, 89, 200, 20);//guafirstname
		panel.add(textFirstName);
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setForeground(Color.GREEN);
		lblLastname.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblLastname.setBounds(246, 65, 92, 14);
		panel.add(lblLastname);
		
		textLastName = new JTextField();
		textLastName.setColumns(10);
		textLastName.setBounds(246, 89, 200, 20);//guaLastName
		panel.add(textLastName);
		
		JLabel lblRel = new JLabel("Relation");
		lblRel.setForeground(Color.GREEN);
		lblRel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblRel.setBounds(477, 64, 92, 14);
		panel.add(lblRel);
		
		JLabel lblAddress1 = new JLabel("Address1");
		lblAddress1.setForeground(Color.GREEN);
		lblAddress1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAddress1.setBounds(10, 122, 118, 14);
		panel.add(lblAddress1);
		
		JLabel lblAddress2 = new JLabel("Address2");
		lblAddress2.setForeground(Color.GREEN);
		lblAddress2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAddress2.setBounds(246, 120, 118, 14);
		panel.add(lblAddress2);
		
		textAddress1 = new JTextField();
		textAddress1.setColumns(10);
		textAddress1.setBounds(10, 145, 200, 20);
		panel.add(textAddress1);//guaaddres1
		
		textAddress2 = new JTextField();
		textAddress2.setColumns(10);
		textAddress2.setBounds(246, 145, 200, 20);//guaaddress2
		panel.add(textAddress2);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setForeground(Color.GREEN);
		lblCity.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblCity.setBounds(10, 186, 118, 14);
		panel.add(lblCity);
		
		textCity = new JTextField();
		textCity.setColumns(10);
		textCity.setBounds(10, 209, 200, 20);//guacity
		panel.add(textCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setForeground(Color.GREEN);
		lblState.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblState.setBounds(246, 186, 92, 14);
		panel.add(lblState);
		
		JFormattedTextField formattedTextGphn = new JFormattedTextField();
		formattedTextGphn.setBounds(379, 209, 138, 20);
		panel.add(formattedTextGphn);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.GREEN);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblPhone.setBounds(379, 186, 92, 14);
		panel.add(lblPhone);
		
		lblStudentID = new JLabel("");
		lblStudentID.setForeground(Color.GREEN);
		lblStudentID.setBounds(10, 463, 118, 22);
		System.out.println("next screen : " + lblStudentID.getText());
		panel.add(lblStudentID);
		//
		String[] retcol1 = getstates.getStates();	//get states in string[] retcol1
		JComboBox comboBox = new JComboBox(retcol1);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==comboBox) {
					comboBox.setSelectedIndex(comboBox.getSelectedIndex());
					selectedState = (String)comboBox.getSelectedItem();
				}
			}
		});
		
		//
		//JComboBox comboBox = new JComboBox();
		comboBox.setBounds(246, 208, 86, 22);
		panel.add(comboBox);
		String[] relations = {"Mother","Father","Sister","Brother","Guardian","other"};
		JComboBox comboBoxRel = new JComboBox(relations);
		comboBoxRel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==comboBoxRel) {
					comboBoxRel.setSelectedIndex(comboBoxRel.getSelectedIndex());
					selectedRelation = (String)comboBoxRel.getSelectedItem();
				}
			}
		});
		comboBoxRel.setBounds(477, 88, 78, 22);
		panel.add(comboBoxRel);
	}
}
