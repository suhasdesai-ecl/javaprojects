package test3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ScreenOne {

	JFrame screen1frame;
	JPanel panel;
	Label label;
	private JTextField textStudentID;
	private JTextField textDOB;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenOne window = new ScreenOne();
					window.screen1frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScreenOne() {
		initialize();
	}

	/**
	 * Initialize the contents of the screen1frame.
	 */
	private void initialize() {
		screen1frame = new JFrame();
		screen1frame.setBounds(10,10,650,448);
		
		panel = new JPanel();
		panel.setLayout(null);
		screen1frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		label = new Label("");
		label.setBackground(Color.WHITE);
		label.setBounds(493, 377, 118, 22);
		panel.add(label);
		
		JLabel lblIntro = new JLabel("Student Information");
		lblIntro.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblIntro.setBounds(183, 47, 282, 29);
		panel.add(lblIntro);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SHUHA\\Downloads\\school_logo.jpg"));
		lblNewLabel.setBounds(40, 47, 68, 55);
		panel.add(lblNewLabel);
		
		JLabel lblStudentID = new JLabel("Student ID");
		lblStudentID.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblStudentID.setBounds(131, 132, 108, 22);
		panel.add(lblStudentID);
		
		JLabel lblDOB = new JLabel("D.O.B.");
		lblDOB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblDOB.setBounds(131, 177, 108, 22);
		panel.add(lblDOB);
		
		textStudentID = new JTextField();
		textStudentID.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textStudentID.setBounds(259, 134, 191, 20);
		panel.add(textStudentID);
		textStudentID.setColumns(10);
		
		textDOB = new JTextField();
		textDOB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textDOB.setColumns(10);
		textDOB.setBounds(259, 177, 191, 20);
		panel.add(textDOB);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textStudentID.getText().length() <= 0 || textDOB.getText().length() <= 0 ){
					System.out.println("Entered info");
				}
			}
		});
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnSearch.setBounds(262, 244, 89, 23);
		panel.add(btnSearch);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnCancel.setBounds(361, 244, 89, 23);
		panel.add(btnCancel);
	}
}
