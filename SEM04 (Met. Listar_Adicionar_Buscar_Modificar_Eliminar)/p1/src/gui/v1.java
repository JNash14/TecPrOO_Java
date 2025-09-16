package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglo.ArregloEstudiantes;
import clase.Estudiante;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNom;
	private JButton btnNewButton;
	private JButton btnBuscar;
	private JScrollPane scrollPane;
	private JTextArea txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setTitle("ESTUDIANTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setBounds(27, 8, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNota = new JLabel("Nota1");
		lblNota.setBounds(244, 11, 46, 14);
		contentPane.add(lblNota);
		
		JLabel lblNota_2 = new JLabel("Nota2");
		lblNota_2.setBounds(244, 36, 46, 14);
		contentPane.add(lblNota_2);
		
		JLabel lblNom = new JLabel("Nombre");
		lblNom.setBounds(27, 33, 46, 14);
		contentPane.add(lblNom);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(83, 5, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(315, 8, 86, 20);
		contentPane.add(txtNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(315, 33, 86, 20);
		contentPane.add(txtNota2);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(83, 30, 86, 20);
		contentPane.add(txtNom);
		
		btnNewButton = new JButton("Listar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(21, 77, 72, 23);
		contentPane.add(btnNewButton);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(103, 77, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(202, 77, 79, 23);
		contentPane.add(btnBuscar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(293, 77, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(392, 77, 72, 23);
		contentPane.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 129, 432, 175);
		contentPane.add(scrollPane);
		
		txtarea = new JTextArea();
		scrollPane.setViewportView(txtarea);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnAdicionar) {
			do_btnAdicionar_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtarea.setText("");//limpiar el area donde se muestra el listado
		listado();
		Imprimir("Cantidad de estudiantes: "+ae.Tamaño());
		Imprimir("Promedio general: "+ae.PromedioGeneral());
		//investigar, math.raw o row para redondear decimales
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		Estudiante es = ae.Buscar(leerCodigo());
		if(es != null)
		{
			Imprimir("Codigo\tNombre\tNota 1\tNota 2\tPromedio");
			Imprimir(""+es.getCod()+"\t"+es.getNom()+"\t"+es.getN1()+"\t"+es.getN2()+"\t"+es.Promedio());
		}
		else		
			JOptionPane.showMessageDialog(this, "No existe el código"); //mensaje de error		
	}
	
	//metodos
	int leerCodigo()
	{
		return Integer.parseInt(txtCodigo.getText());
	}
	String leerNombre()
	{
		return txtNom.getText();
	}
	double leerN1()
	{
		return Double.parseDouble(txtNota1.getText());
	}
	double leerN2()
	{
		return Double.parseDouble(txtNota2.getText());
	}
	void Imprimir(String s)
	{
		txtarea.append(s+"\n");
	}
	
	//crear un objeto para acceder a la clase arregloEstudiante
	ArregloEstudiantes ae = new ArregloEstudiantes();
	private JButton btnAdicionar;
	private JButton btnEliminar;
	private JButton btnModificar;
	void listado()
	{
		Imprimir("Codigo\tNombre\tNota 1\tNota 2\tPromedio");
		for (int i=0; i<ae.Tamaño() ; i++)
		{			
			Imprimir(""+ae.Obtener(i).getCod()+"\t"+ae.Obtener(i).getNom()+"\t"+
					ae.Obtener(i).getN1()+"\t"+ae.Obtener(i).getN2()+"\t"+ae.Obtener(i).Promedio());			
		}
	}
	
	protected void do_btnAdicionar_actionPerformed(ActionEvent e) {
		Estudiante es = ae.Buscar(leerCodigo());
		if(es == null)
		{
			Estudiante e1 = new Estudiante(leerCodigo(), leerNombre(), leerN1(), leerN2());
			ae.Adicionar(e1);
		}
		else
			JOptionPane.showMessageDialog(this, "Código existente"); 
	}
	
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		Estudiante es = ae.Buscar(leerCodigo());
		if(es != null)		
			ae.Eliminar(es);		
		else
			JOptionPane.showMessageDialog(this, "No existe el código"); 
	}
	
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		Estudiante es = ae.Buscar(leerCodigo());
		if(es != null)	
		{
			es.setNom(leerNombre());
			es.setN1(leerN1());
			es.setN2(leerN2());
		}			
		else
			JOptionPane.showMessageDialog(this, "No existe el código"); 
	}
}
