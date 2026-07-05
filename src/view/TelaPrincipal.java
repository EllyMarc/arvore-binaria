package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_inserir;
	private JTextField textField_remover;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 659);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 244, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(10, 10, 730, 112);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout());
		
		JLabel lblNewLabel = new JLabel("ÁRVORE BINÁRIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(45, 149, 446, 118);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 10, 10));
		panel_1.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		textField_inserir = new JTextField();
		panel_1.add(textField_inserir);
		textField_inserir.setColumns(10);
		
		JButton btn_inserir = new JButton("Inserir");
		btn_inserir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_inserir.setContentAreaFilled(false);
		btn_inserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info = textField_inserir.getText().trim();
				//add a arvore
			}
		});
		panel_1.add(btn_inserir);
		
		textField_remover = new JTextField();
		panel_1.add(textField_remover);
		textField_remover.setColumns(10);
		
		JButton btn_remover = new JButton("Remover");
		btn_remover.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_remover.setContentAreaFilled(false);
		btn_remover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info = textField_remover.getText().trim();
				//add a arvore
			}
		});
		panel_1.add(btn_remover);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("/images/estrutura_linhas.png"));
		Image img = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);

		JLabel lblImagem = new JLabel(new ImageIcon(img));
		lblImagem.setBounds(524, 149, 118, 118);


		contentPane.add(lblImagem);

	}
}
