package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField_LU;
	private JTextField textField_Apellido;
	private JTextField textField_Nombre;
	private JTextField textField_Email;
	private JTextField textField_Github;
	private JLabel lblNewLabel_imagen;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(618, 278));
		setResizable(false);
		setContentPane(contentPane);

		init();
	}

	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 211);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation,
				"Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);

		JLabel lblNewLabel_LU = new JLabel("LU");
		lblNewLabel_LU.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_LU.setBounds(10, 11, 65, 24);
		tabInformation.add(lblNewLabel_LU);

		JLabel lblNewLabel_Apellido = new JLabel("Apellido");
		lblNewLabel_Apellido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Apellido.setBounds(10, 46, 65, 24);
		tabInformation.add(lblNewLabel_Apellido);

		JLabel lblNewLabel_Nombre = new JLabel("Nombre");
		lblNewLabel_Nombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Nombre.setBounds(10, 81, 65, 26);
		tabInformation.add(lblNewLabel_Nombre);

		JLabel lblNewLabel_Email = new JLabel("E-mail");
		lblNewLabel_Email.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Email.setBounds(10, 118, 65, 24);
		tabInformation.add(lblNewLabel_Email);

		JLabel lblNewLabel_Github = new JLabel("Github URL");
		lblNewLabel_Github.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Github.setBounds(10, 153, 76, 19);
		tabInformation.add(lblNewLabel_Github);

		textField_LU = new JTextField();
		textField_LU.setBackground(Color.WHITE);
		textField_LU.setEditable(false);
		textField_LU.setBounds(85, 13, 330, 20);
		tabInformation.add(textField_LU);
		textField_LU.setColumns(10);
		textField_LU.setText("" + studentData.getId());
		;

		textField_Apellido = new JTextField();
		textField_Apellido.setFont(new Font("Calibri", Font.PLAIN, 12));
		textField_Apellido.setBackground(Color.WHITE);
		textField_Apellido.setEditable(false);
		textField_Apellido.setBounds(83, 48, 332, 20);
		tabInformation.add(textField_Apellido);
		textField_Apellido.setColumns(10);
		textField_Apellido.setText(studentData.getLastName());

		textField_Nombre = new JTextField();
		textField_Nombre.setFont(new Font("Calibri", Font.PLAIN, 12));
		textField_Nombre.setBackground(Color.WHITE);
		textField_Nombre.setEditable(false);
		textField_Nombre.setBounds(85, 84, 330, 20);
		tabInformation.add(textField_Nombre);
		textField_Nombre.setColumns(10);
		textField_Nombre.setText(studentData.getFirstName());

		textField_Email = new JTextField();
		textField_Email.setFont(new Font("Calibri", Font.PLAIN, 12));
		textField_Email.setBackground(Color.WHITE);
		textField_Email.setEditable(false);
		textField_Email.setBounds(85, 120, 330, 20);
		tabInformation.add(textField_Email);
		textField_Email.setColumns(10);
		textField_Email.setText(studentData.getMail());

		textField_Github = new JTextField();
		textField_Github.setFont(new Font("Calibri", Font.PLAIN, 12));
		textField_Github.setBackground(Color.WHITE);
		textField_Github.setEditable(false);
		textField_Github.setBounds(85, 152, 330, 20);
		tabInformation.add(textField_Github);
		textField_Github.setColumns(10);
		textField_Github.setText(studentData.getGithubURL());
		tabbedPane.setEnabledAt(0, true);
		contentPane.setLayout(null);

		lblNewLabel_imagen = new JLabel("");
		lblNewLabel_imagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_imagen
				.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		lblNewLabel_imagen.setBounds(445, 30, 154, 182);
		contentPane.add(lblNewLabel_imagen);
		contentPane.add(tabbedPane);

		DateTimeFormatter h = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalTime horaActual = LocalTime.now();
		LocalDate fechaActual = LocalDate.now();

		JLabel lblNewLabel_horaFecha = new JLabel(
				"Esta ventana fue generada el " + f.format(fechaActual) + " a las " + h.format(horaActual));
		lblNewLabel_horaFecha.setBounds(5, 217, 430, 14);
		contentPane.add(lblNewLabel_horaFecha);

	}
}