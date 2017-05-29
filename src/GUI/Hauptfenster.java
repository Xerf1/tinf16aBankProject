package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import main.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Hauptfenster extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptfenster frame = new Hauptfenster();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Core core;
	/**
	 * @wbp.nonvisual location=837,359
	 */
	private final JLabel label = new JLabel("New label");
	private JTextField tfPassword;
	  
	public Hauptfenster() {
		core = new Core();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Bank Simulation");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblWelcomeToThe.setBounds(163, 28, 418, 89);
		contentPane.add(lblWelcomeToThe);
		
		JLabel lblSignIn = new JLabel("Sign In");
		lblSignIn.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSignIn.setBounds(349, 129, 69, 29);
		contentPane.add(lblSignIn);
		
		tfID = new JTextField();
		tfID.setBounds(310, 163, 146, 26);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(212, 166, 69, 20);
		contentPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(212, 217, 69, 20);
		contentPane.add(lblPassword);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(tfID.getText()==null){
					JOptionPane.showMessageDialog(null, "Please enter an ID");
				}else{
					checkValues();
				}
			}
		});
		btnSubmit.setBackground(Color.GRAY);
		btnSubmit.setBounds(330, 264, 115, 29);
		contentPane.add(btnSubmit);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBackground(Color.DARK_GRAY);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp s = new SignUp(core);
				s.setVisible(true);
			}
		});
		btnSignUp.setBounds(619, 335, 115, 29);
		contentPane.add(btnSignUp);
		
		tfPassword = new JTextField();
		tfPassword.setBounds(310, 214, 146, 26);
		contentPane.add(tfPassword);
		tfPassword.setColumns(10);
	}
	public void empty(){
		tfPassword.setText(null);
		tfID.setText(null);
	}
	public void checkValues(){
		if(!tfID.getText().equals("")){
			int id = Integer.parseInt(tfID.getText());
			boolean check = core.signIn(tfPassword.getText(), id);
			if(check){
				JOptionPane.showMessageDialog(null, "logged in");
				Menue frame = new Menue();
				frame.setVisible(true);
				empty();
			}else{
				JOptionPane.showMessageDialog(null, "failure, try again");
				empty();
			}
		}else{
			JOptionPane.showMessageDialog(null, "Please enter a valid ID");
		}
	}
}
