package CustomerGST;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import java.awt.Component;
import java.awt.*;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.print.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;

public class CustomerGST extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtCustomerRef;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel jtxtSurname;
	private JLabel jtxtAddress;
	private JLabel jtxtPostCode;
	private JLabel jtxtMobile;
	private JLabel jtxtEmail;
	private JLabel lblNewLabel_7;
	private JLabel jtxtDOB;
	private JLabel lblNewLabel_9;
	private JTextField textField_8;
	private JLabel lblNewLabel_10;
	private JPanel panel_1_3;
	private JPanel panel_1_4;
	private JTextField jtxtBooks;
	private JTextField jtxtLaptop;
	private JCheckBox cchkLaptop;
	private JTextField jtxtPens;
	private JCheckBox chkPens;
	private JTextField jtxtRegister;
	private JCheckBox chkRegister;
	private JTextField  jtxtGold;
	private JCheckBox chkGold;
	private JTextField jtxtTabel;
	private JCheckBox chlTabel;
	private JTextField jtxtChairs;
	private JCheckBox chkChairs;
	private JTextField  jtxtBags;
	private JCheckBox chkBags;
	private JTextField jtxtCakes;
	private JCheckBox chkCakes;
	private JTextField jtxtGrocery;
	private JCheckBox chkGrocery;
	private JPanel panel_1_5;
	private JLabel textField_18;
	private JTextField jtxtTax;
	private JLabel textField;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JLabel jblTotal;
	private JButton btnPrint;
	private JFrame frame;
	private JLabel jtxtFirstname;
	private JTextArea jtxtReceipt;
	PreparedStatement pst;
	Connection con;
	String iTax, iSubTotal, iTotal;
	double[] itemcost = new double[20];
	public void Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetails", "root","root");
			 System.out.println("Connection");
			 JOptionPane.showMessageDialog(null,"Connect Sucessfully");
		}
		catch(ClassNotFoundException ex){
			System.out.println(ex);
			
		}
		catch(Exception ex) {
			System.out.println(ex);
			
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerGST frame = new CustomerGST();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerGST() {
		addWindowListener(new WindowAdapter(){
		

			@Override
			public void windowActivated(WindowEvent args0) {
				jtxtCustomerRef.setText(null);
				jtxtCustomerRef.setEditable(false);
				int refs=5015 +(int) (Math.random()*17328);
				String cRef="";
				cRef +=refs +1560;
				
				jtxtCustomerRef.setText(cRef);
				
			}
			
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 903);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(67, 0, 1366, 970);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(39, 26, 347, 654);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		jtxtCustomerRef = new JTextField();
		jtxtCustomerRef.setBounds(206, 30, 116, 31);
		jtxtCustomerRef.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(jtxtCustomerRef);
		jtxtCustomerRef.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Customer Ref\r\n");
		lblNewLabel.setBounds(32, 30, 131, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 71, 116, 31);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		jtxtFirstname = new JLabel("FisrtName\r\n");
		jtxtFirstname.setBounds(32, 71, 131, 31);
		jtxtFirstname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(jtxtFirstname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(206, 112, 116, 31);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(206, 157, 116, 31);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(206, 214, 116, 31);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(206, 271, 116, 31);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(206, 327, 116, 31);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		panel_1.add(textField_6);
		
		jtxtSurname= new JLabel("SurName");
		jtxtSurname.setBounds(32, 112, 131, 31);
		jtxtSurname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(jtxtSurname);
		
		jtxtAddress = new JLabel("Address\r\n");
		jtxtAddress.setBounds(32, 157, 131, 31);
		jtxtAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(jtxtAddress);
		
		jtxtPostCode = new JLabel("PostCode\r\n");
		jtxtPostCode.setBounds(32, 214, 131, 31);
		jtxtPostCode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(jtxtPostCode);
		
		jtxtMobile = new JLabel("Mobile\r\n");
		jtxtMobile.setBounds(32, 271, 131, 31);
		jtxtMobile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(jtxtMobile);
		
		jtxtEmail = new JLabel("Email\r\n");
		jtxtEmail.setBounds(32, 327, 131, 31);
		jtxtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(jtxtEmail);
		
		lblNewLabel_7 = new JLabel("State\r\n");
		lblNewLabel_7.setBounds(32, 385, 131, 31);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_7);
		
		jtxtDOB = new JLabel("Date of Birth");
		jtxtDOB.setBounds(32, 443, 131, 31);
		jtxtDOB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(jtxtDOB);
		
		lblNewLabel_9 = new JLabel("Type of ID\r\n");
		lblNewLabel_9.setBounds(32, 491, 131, 31);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(206, 443, 116, 31);
		panel_1.add(textField_8);
		
		lblNewLabel_10 = new JLabel("Gender\r\n");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(32, 550, 131, 31);
		panel_1.add(lblNewLabel_10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh", "Uttar Pradesh", "Delhi ", "Harayana ", "Gujarat", "Madhya Pradesh ", "Kerala", "Tamil Nadu "}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(206, 385, 116, 33);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Wholesaler", "Retailer", "Customer"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setBounds(206, 491, 116, 33);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_2.setBounds(206, 550, 116, 33);
		panel_1.add(comboBox_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(431, 26, 391, 566);
		panel_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JCheckBox chkBooks = new JCheckBox("Books\r\n");
		chkBooks.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chkBooks.isSelected()) {
					jtxtBooks.setEnabled(true);
					jtxtBooks.setText("");
					jtxtBooks.requestFocus();
				}
				else {
					jtxtBooks.setEnabled(false);
					jtxtBooks.setText("0");
					
				}
			}
		});
		chkBooks.setBackground(new Color(95, 158, 160));
		chkBooks.setBounds(24, 29, 120, 30);
		chkBooks.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1_1.add(chkBooks);
		
		jtxtBooks = new JTextField();
		jtxtBooks.setText("0\r\n");
		jtxtBooks.setBounds(222, 29, 148, 31);
		jtxtBooks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtBooks.setColumns(10);
		panel_1_1.add(jtxtBooks);
		
		jtxtLaptop = new JTextField();
		jtxtLaptop.setText("0\r\n");
		jtxtLaptop.setBounds(222, 79, 148, 30);
		jtxtLaptop.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtLaptop.setColumns(10);
		panel_1_1.add(jtxtLaptop);
		
		cchkLaptop = new JCheckBox("Laptop\r\n");
		cchkLaptop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cchkLaptop.isSelected()) {
					jtxtLaptop.setEnabled(true);
					jtxtLaptop.setText("");
					jtxtLaptop.requestFocus();
				}
				else {
					jtxtLaptop.setEnabled(false);
					jtxtLaptop.setText("0");
					
				}
				
			}
		});
		cchkLaptop.setBackground(new Color(95, 158, 160));
		cchkLaptop.setBounds(24, 79, 120, 30);
		cchkLaptop.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1_1.add(cchkLaptop);
		
		jtxtPens = new JTextField();
		jtxtPens.setText("0\r\n");
		jtxtPens.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtPens.setColumns(10);
		jtxtPens.setBounds(222, 129, 148, 30);
		panel_1_1.add(jtxtPens);
		
		chkPens = new JCheckBox("Pens");
		chkPens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkPens.isSelected()) {
					jtxtPens.setEnabled(true);
					jtxtPens.setText("");
					jtxtPens.requestFocus();
				}
				else {
					jtxtPens.setEnabled(false);
					jtxtPens.setText("0");
					
				}
			}
		});
		chkPens.setBackground(new Color(95, 158, 160));
		chkPens.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkPens.setBounds(24, 129, 120, 30);
		panel_1_1.add(chkPens);
		
		jtxtRegister = new JTextField();
		jtxtRegister.setText("0\r\n");
		jtxtRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtRegister.setColumns(10);
		jtxtRegister.setBounds(222, 179, 148, 30);
		panel_1_1.add(jtxtRegister);
		
		chkRegister = new JCheckBox("Register");
		chkRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkRegister.isSelected()) {
					jtxtRegister.setEnabled(true);
					jtxtRegister.setText("");
					jtxtRegister.requestFocus();
				}
				else {
					jtxtRegister.setEnabled(false);
					jtxtRegister.setText("0");
					
				}
			}
		});
		chkRegister.setBackground(new Color(95, 158, 160));
		chkRegister.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkRegister.setBounds(24, 179, 120, 30);
		panel_1_1.add(chkRegister);
		
		 jtxtGold = new JTextField();
		 jtxtGold.setText("0\r\n");
		 jtxtGold.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 jtxtGold.setColumns(10);
		 jtxtGold.setBounds(222, 229, 148, 30);
		panel_1_1.add( jtxtGold);
		
		chkGold = new JCheckBox("Gold");
		chkGold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkGold.isSelected()) {
					jtxtGold.setEnabled(true);
					jtxtGold.setText("");
					jtxtGold.requestFocus();
				}
				else {
					jtxtGold.setEnabled(false);
					jtxtGold.setText("0");
					
				}
			}
		});
		chkGold.setBackground(new Color(95, 158, 160));
		chkGold.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkGold.setBounds(24, 229, 120, 30);
		panel_1_1.add(chkGold);
		
		jtxtTabel = new JTextField();
		jtxtTabel.setText("0\r\n");
		jtxtTabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtTabel.setColumns(10);
		jtxtTabel.setBounds(222, 279, 148, 30);
		panel_1_1.add(jtxtTabel);
		
		chlTabel = new JCheckBox("Tabel\r\n");
		chlTabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chlTabel.isSelected()) {
					jtxtTabel.setEnabled(true);
					jtxtTabel.setText("");
					jtxtTabel.requestFocus();
				}
				else {
					jtxtTabel.setEnabled(false);
					jtxtTabel.setText("0");
					
				}
			}
		});
		chlTabel.setBackground(new Color(95, 158, 160));
		chlTabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		chlTabel.setBounds(24, 279, 120, 30);
		panel_1_1.add(chlTabel);
		
		jtxtChairs = new JTextField();
		jtxtChairs.setText("0\r\n");
		jtxtChairs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtChairs.setColumns(10);
		jtxtChairs.setBounds(222, 329, 148, 30);
		panel_1_1.add(jtxtChairs);
		
		chkChairs = new JCheckBox("Chairs");
		chkChairs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkChairs.isSelected()) {
					jtxtChairs.setEnabled(true);
					jtxtChairs.setText("");
					jtxtChairs.requestFocus();
				}
				else {
					jtxtChairs.setEnabled(false);
					jtxtChairs.setText("0");
					
				}
			}
		});
		chkChairs.setBackground(new Color(95, 158, 160));
		chkChairs.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkChairs.setBounds(24, 329, 120, 30);
		panel_1_1.add(chkChairs);
		
		 jtxtBags = new JTextField();
		 jtxtBags.setText("0\r\n");
		 jtxtBags.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 jtxtBags.setColumns(10);
		 jtxtBags.setBounds(222, 379, 148, 30);
		panel_1_1.add( jtxtBags);
		
		chkBags = new JCheckBox("Bags");
		chkBags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkBags.isSelected()) {
					jtxtBags.setEnabled(true);
					jtxtBags.setText("");
					jtxtBags.requestFocus();
				}
				else {
					jtxtBags.setEnabled(false);
					jtxtBags.setText("0");
					
				}
			}
		});
		chkBags.setBackground(new Color(95, 158, 160));
		chkBags.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkBags.setBounds(24, 379, 120, 30);
		panel_1_1.add(chkBags);
		
		jtxtCakes = new JTextField();
		jtxtCakes.setText("0\r\n");
		jtxtCakes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtCakes.setColumns(10);
		jtxtCakes.setBounds(222, 429, 148, 30);
		panel_1_1.add(jtxtCakes);
		
		chkCakes = new JCheckBox("Cakes");
		chkCakes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkCakes.isSelected()) {
					jtxtCakes.setEnabled(true);
					jtxtCakes.setText("");
					jtxtCakes.requestFocus();
				}
				else {
					jtxtCakes.setEnabled(false);
					jtxtCakes.setText("0");
					
				}
			}
		});
		chkCakes.setBackground(new Color(95, 158, 160));
		chkCakes.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkCakes.setBounds(24, 429, 120, 30);
		panel_1_1.add(chkCakes);
		
		jtxtGrocery = new JTextField();
		jtxtGrocery.setText("0\r\n");
		jtxtGrocery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtGrocery.setColumns(10);
		jtxtGrocery.setBounds(222, 479, 148, 30);
		panel_1_1.add(jtxtGrocery);
		
		chkGrocery = new JCheckBox("Grocery");
		chkGrocery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkGrocery.isSelected()) {
					jtxtGrocery.setEnabled(true);
					jtxtGrocery.setText("");
					jtxtGrocery.requestFocus();
				}
				else {
					jtxtGrocery.setEnabled(false);
					jtxtGrocery.setText("0");
					
				}
			}
		});
		chkGrocery.setBackground(new Color(95, 158, 160));
		chkGrocery.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkGrocery.setBounds(24, 479, 120, 30);
		panel_1_1.add(chkGrocery);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(859, 36, 456, 615);
		panel_1_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_2.setBackground(new Color(176, 224, 230));
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(25, 20, 410, 570);
		panel_1_2.add(jtxtReceipt);
		
		panel_1_3 = new JPanel();
		panel_1_3.setBounds(888, 672, 399, 126);
		panel.add(panel_1_3);
		panel_1_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_3.setBackground(new Color(176, 224, 230));
		panel_1_3.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			


			

			public void actionPerformed(ActionEvent e) {
				jtxtBooks.setEnabled(false);
				jtxtLaptop.setEnabled(false);
				jtxtPens.setEnabled(false);
				jtxtRegister.setEnabled(false);
				jtxtGold.setEnabled(false);
				jtxtTabel.setEnabled(false);
				jtxtChairs.setEnabled(false);
				jtxtBags.setEnabled(false);
				jtxtCakes.setEnabled(false);
				jtxtGrocery.setEnabled(false);
				
				(jtxtBooks).setText("0");
				( jtxtLaptop).setText("0");
				(jtxtPens).setText("0");
				(jtxtRegister).setText("0");
				( jtxtGold).setText("0");
				( jtxtTabel).setText("0");
				(jtxtChairs).setText("0");
				( jtxtBags).setText("0");
				(jtxtCakes).setText("0");
				(jtxtGrocery).setText("0");
				
				
				chkBooks.setSelected(false);
				cchkLaptop.setSelected(false);
				chkPens.setSelected(false);
				chkRegister.setSelected(false);
				chkGold.setSelected(false);
				chlTabel.setSelected(false);
				chkChairs.setSelected(false);
				chkBags.setSelected(false);
				chkCakes.setSelected(false);
				chkGrocery.setSelected(false);
				
				jtxtCustomerRef.setText(null);
				jtxtCustomerRef.setEnabled(false);
				int refs=5015+(int) (Math.random()*17328);
				String cRef="";
				cRef +=refs+1560;
				
				jtxtCustomerRef.setText(cRef);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_6.setText(null);
				textField_4.setText(null);
				textField_3.setText(null);
				jtxtTax.setText(null);
				textField_5.setText(null);
				textField_8.setText(null);
				jtxtTotal.setText(null);
				jtxtSubTotal.setText(null);
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnReset.setBounds(40, 36, 123, 65);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 28));
		panel_1_3.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Customer Billing System",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
				
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnExit.setBounds(213, 33, 127, 70);
		panel_1_3.add(btnExit);
		
		panel_1_4 = new JPanel();
		panel_1_4.setBounds(39, 690, 347, 108);
		panel_1_4.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_4.setBackground(new Color(176, 224, 230));
		panel.add(panel_1_4);
		panel_1_4.setLayout(null);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent arg0) {
				try {
					jtxtReceipt.print();
				}catch(Exception e) {
					System.err.format("No Printer found",e.getMessage());
				}
				
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnPrint.setBounds(29, 21, 127, 56);
		panel_1_4.add(btnPrint);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connect();
				itemcost[0] = Double.parseDouble(jtxtBooks.getText())*1.50;
				itemcost[1] = Double.parseDouble(jtxtLaptop.getText())*1.87;
				itemcost[2] = Double.parseDouble(jtxtPens.getText())*1.95;
				itemcost[3] = Double.parseDouble(jtxtRegister.getText())*2.10;
				itemcost[4] = Double.parseDouble(jtxtGold.getText())*1.20;
				itemcost[5] = Double.parseDouble(jtxtTabel.getText())*1.24;
				itemcost[6] = Double.parseDouble(jtxtChairs.getText())*4.50;
				itemcost[7] = Double.parseDouble(jtxtBags.getText())*10.50;
				itemcost[8] = Double.parseDouble(jtxtCakes.getText())*5.70;
				itemcost[9] = Double.parseDouble(jtxtGrocery.getText())*3.70;
				
				itemcost[10]=itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3]+itemcost[4];
				itemcost[11]=itemcost[5]+itemcost[6]+itemcost[7]+itemcost[8]+itemcost[9];
				
				itemcost[12]=itemcost[10]+itemcost[11];
				iTax =String.format(" ₹	%.2f", itemcost[12]/100);
				iSubTotal =String.format(" ₹	%.2f", itemcost[12]);
				iTotal =String.format(" ₹	%.2f", itemcost[12]+ (itemcost[12]/100));
				
				jtxtTax.setText(iTax);
				jtxtSubTotal.setText(iSubTotal);
				jtxtTotal.setText(iTotal);
				
				//==================================================================
//				  jtxtReceipt.setEnabled(true);
				  //=================================================================
				 
				   int refs=1325 +(int) (Math.random()*4328);
				  //===============================================================
				  Calendar timer = Calendar.getInstance();
				  timer.getTime();
				  SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				  tTime.format(timer.getTime());
				  SimpleDateFormat TDate = new SimpleDateFormat("dd-MM-yyyy");
				  TDate.format(timer.getTime());
				  //===============================================================
				  jtxtReceipt.setText("\t      Customer Billing System\n" + 
				  "Reference:\t\t\t" +refs+
				  "\n=====================================================\t"+
						  
						  
						  "\n==================================================\t" +
						  "\nCustomer Ref:\t\t\t" + jtxtCustomerRef.getText()+
						  "\nFirstName: \t\t\t"+ textField_1.getText()+
						  "\nSurname: \t\t\t" + textField_2.getText() +
						  "\nAddress: \t\t\t" + textField_3.getText() +
						  "\nPostCode: \t\t\t" + textField_4.getText() +
						   "\nBooks: \t\t\t" + jtxtBooks.getText() +
						   "\nLaptop: \t\t\t" +jtxtLaptop.getText() +
						   "\nPens : \t\t\t" +jtxtPens.getText() +
						   "\nRegister: \t\t\t" + jtxtRegister.getText() +
						   "\nGold: \t\t\t" + jtxtGold.getText() +
						   "\nTabel: \t\t\t" +jtxtTabel.getText() +
						   "\nChairs: \t\t\t" +jtxtChairs.getText() +
						   "\nBags: \t\t\t" +jtxtBags.getText() +
						   "\nCakes: \t\t\t" +jtxtCakes.getText() +
						   "\nGrocery: \t\t\t" +jtxtGrocery.getText() +
						   
						  
						  	"\n===============================================\t" +
						  	"\nGST:\t\t\t" +iTax+
						  	"\nSubTotal: \t\t\t" +iSubTotal +
						  	"\nTotal: \t\t\t" +iTotal +
						  	"\n================================================\t" +
						  	"\nDate:" +TDate.format(timer.getTime()) +
						  			"\t\tTime:" +tTime.format(timer.getTime()) +
						  			
						"\n\n\tThank You for Shopping at iShop\n");
				  String CustomerRef = jtxtCustomerRef.getText();
				  String Bill=  jtxtReceipt.getText();
				  try {
					    pst = con.prepareStatement("INSERT INTO data(CusRef,bill) VALUES(?,?);");
					   
					    pst.setString(1, CustomerRef);
					    pst.setString(2, Bill);
					    
					    
					    pst.executeUpdate();
					     JOptionPane. showMessageDialog (null, "Record Addedddd!!!!!");
					   
					}
					catch(Exception e1){
					  e1.printStackTrace();
					}

				  
				
				
				
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnTotal.setBounds(192, 25, 119, 49);
		panel_1_4.add(btnTotal);
		
		panel_1_5 = new JPanel();
		panel_1_5.setBounds(417, 603, 428, 195);
		panel_1_5.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_5.setBackground(new Color(176, 224, 230));
		panel.add(panel_1_5);
		panel_1_5.setLayout(null);
		
		textField_18= new JLabel("GST\r\n");
		textField_18.setBounds(40, 25, 59, 25);
		textField_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1_5.add(textField_18);
		
		jtxtTax = new JTextField();
		jtxtTax.setBounds(181, 22, 208, 31);
		jtxtTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtTax.setColumns(10);
		panel_1_5.add(jtxtTax);
		
		textField = new JLabel("Sub Total\r\n");
		textField.setBounds(40, 70, 107, 31);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1_5.add(textField);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setBounds(181, 70, 208, 31);
		jtxtSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtSubTotal.setColumns(10);
		panel_1_5.add(jtxtSubTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setBounds(181, 123, 208, 31);
		jtxtTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtTotal.setColumns(10);
		panel_1_5.add(jtxtTotal);
		
		jblTotal = new JLabel("Total\r\n");
		jblTotal.setBounds(43, 123, 82, 31);
		jblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1_5.add(jblTotal);
	}
}
