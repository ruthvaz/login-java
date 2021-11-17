package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	// cores
	Color azulEscuro = new Color(23, 75, 211);
	Color azulButton = new Color(24, 188, 37);
	Color verdeEscuro = new Color(31, 145, 40);
	
	private JPanel contentPane;
	private JTextField tfUser;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 409);
		contentPane = new JPanel();
		contentPane.setBackground(azulEscuro);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(75, 150, 308, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/login/img/user.png")));
		lblNewLabel_1.setBounds(260, 0, 48, 48);
		panel.add(lblNewLabel_1);
		
		tfUser = new JTextField();
		tfUser.setBorder(null);
		tfUser.setBounds(10, 11, 240, 26);
		panel.add(tfUser);
		tfUser.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/login/img/ray.png")));
		lblNewLabel.setBounds(75, 11, 308, 128);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(75, 214, 308, 48);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Login.class.getResource("/login/img/lock.png")));
		lblNewLabel_1_1.setBounds(260, 0, 48, 48);
		panel_1.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBounds(10, 11, 240, 26);
		panel_1.add(passwordField);
		
		JPanel panelButton = new JPanel();
		panelButton.setLayout(null);
		panelButton.setBackground(azulButton);
		panelButton.setBounds(75, 296, 308, 48);
		contentPane.add(panelButton);
		
		JLabel lblButton = new JLabel("Login");
		lblButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelButton.setBackground(verdeEscuro);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelButton.setBackground(azulButton);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Olá " + tfUser.getText());
			}
		});
		lblButton.setFont(new Font("Arial", Font.BOLD, 15));
		lblButton.setForeground(Color.WHITE);
		lblButton.setHorizontalTextPosition(SwingConstants.CENTER);
		lblButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblButton.setBounds(0, 0, 308, 48);
		panelButton.add(lblButton);
		
		JLabel lblNewLabel_3 = new JLabel("x");
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Fechar?", "Confirmão", JOptionPane.YES_NO_OPTION) == 0)
					dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_3.setOpaque(true);
				lblNewLabel_3.setBackground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_3.setBackground(azulEscuro);
				lblNewLabel_3.setOpaque(false);
				
			}
		});
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(425, 11, 22, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("-");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(ICONIFIED);
			}
		});
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(393, 11, 22, 22);
		contentPane.add(lblNewLabel_3_1);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	}
}
