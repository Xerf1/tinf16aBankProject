package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField tfPassword;
	private JTextField tfBirthDate;
	private JTextField tfLastName;
	private JTextField tfName;
	private JTextField tfID;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp(core);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	static Core core;
	private JLabel lblID;
	
	public SignUp(Core c) {
		core = c;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(57, 59, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setBounds(57, 122, 69, 20);
		contentPane.add(lblLastname);
		
		JLabel lblBirthDate = new JLabel("Birth date");
		lblBirthDate.setBounds(57, 194, 69, 20);
		contentPane.add(lblBirthDate);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(57, 256, 69, 20);
		contentPane.add(lblPassword);
		
		tfPassword = new JTextField();
		tfPassword.setBounds(170, 253, 146, 26);
		contentPane.add(tfPassword);
		tfPassword.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				anzeigen();
				speichern();
				leeren();
				editable();
			}
		});
		btnSubmit.setBounds(161, 320, 115, 29);
		contentPane.add(btnSubmit);
		
		tfBirthDate = new JTextField();
		tfBirthDate.setBounds(170, 191, 146, 26);
		contentPane.add(tfBirthDate);
		tfBirthDate.setColumns(10);
		
		tfLastName = new JTextField();
		tfLastName.setBounds(170, 119, 146, 26);
		contentPane.add(tfLastName);
		tfLastName.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(170, 56, 146, 26);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfID = new JTextField();
		tfID.setEditable(false);
		tfID.setBounds(269, 14, 146, 26);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		lblID = new JLabel("Your ID");
		lblID.setBounds(185, 17, 69, 20);
		contentPane.add(lblID);
	}
	
	
	public void leeren(){
		tfPassword.setText(null);
		tfLastName.setText(null);
		tfName.setText(null);
		tfBirthDate.setText(null);
		tfID.setText(null);
	}
	public void enable(){
		tfPassword.setEditable(false);
		tfLastName.setEditable(false);
		tfName.setEditable(false);
		tfBirthDate.setEditable(false);
	}
	public void editable(){
		tfPassword.setEditable(true);
		tfLastName.setEditable(true);
		tfName.setEditable(true);
		tfBirthDate.setEditable(true);
	}
	public void speichern(){
		String pw = tfPassword.getText();
		String ln = tfLastName.getText();
		String name = tfName.getText();
		String bd = tfBirthDate.getText();
		enable();
		JOptionPane.showMessageDialog(null,"success, please remember your ID: "+core.getCurrentID());
		core.SignUp(pw, ln, name, bd);
	}
	
	public void anzeigen(){
		tfID.setText(String.valueOf(core.getCurrentID()));
	}
	
}
