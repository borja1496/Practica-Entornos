import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora Borja");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblquOperacinDesea = new JLabel("\u00BFQu\u00E9 operaci\u00F3n desea realizar?");
		lblquOperacinDesea.setBounds(231, 37, 193, 14);
		contentPane.add(lblquOperacinDesea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sumar", "Restar", "Multiplicar", "Dividir"}));
		comboBox.setBounds(339, 62, 66, 20);
		contentPane.add(comboBox);
		
		JLabel lblPrimerNmero = new JLabel("Primer n\u00FAmero:");
		lblPrimerNmero.setBounds(10, 37, 96, 14);
		contentPane.add(lblPrimerNmero);
		
		valor1 = new JTextField();
		valor1.setBounds(135, 34, 86, 20);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		valor2 = new JTextField();
		valor2.setColumns(10);
		valor2.setBounds(135, 80, 86, 20);
		contentPane.add(valor2);
		
		JLabel lblSegundoNmero = new JLabel("Segundo n\u00FAmero:");
		lblSegundoNmero.setBounds(10, 83, 115, 14);
		contentPane.add(lblSegundoNmero);
		
		resultado = new JTextField();
		resultado.setColumns(10);
		resultado.setBounds(135, 131, 86, 20);
		contentPane.add(resultado);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(10, 134, 96, 14);
		contentPane.add(lblResultado);
		
		JButton Calcular = new JButton("Calcular");
		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String item;
				item = comboBox.getSelectedItem().toString();
				
				double num1, num2, resul;
				
				if(item.equalsIgnoreCase("Sumar")) {
					num1 = Double.parseDouble(valor1.getText());
					num2 = Double.parseDouble(valor2.getText());
					resul = num1 + num2;
					resultado.setText(String.valueOf(resul));
					
				}else if(item.equalsIgnoreCase("Restar")) {
					num1 = Double.parseDouble(valor1.getText());
					num2 = Double.parseDouble(valor2.getText());
					resul = num1 - num2;
					resultado.setText(String.valueOf(resul));
				
				}else if(item.equalsIgnoreCase("Multiplicar")) {
					num1 = Double.parseDouble(valor1.getText());
					num2 = Double.parseDouble(valor2.getText());
					resul = num1 * num2;
					resultado.setText(String.valueOf(resul));
					
				}else if(item.equalsIgnoreCase("Dividir")) {
					num1 = Double.parseDouble(valor1.getText());
					num2 = Double.parseDouble(valor2.getText());
					resul = num1 / num2;
					resultado.setText(String.valueOf(resul));					
				}									
			}
		});
		Calcular.setBounds(59, 182, 89, 23);
		contentPane.add(Calcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1.setText("");
				valor2.setText(null);
				resultado.setText(null);
				valor1.requestFocus();
				
			}
		});
		btnLimpiar.setBounds(277, 182, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnSalir.setBounds(167, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opcion 1");
		menuBar.add(mnNewMenu);
		
		JMenu mnOpcion = new JMenu("Opcion 2");
		menuBar.add(mnOpcion);
	}
}
