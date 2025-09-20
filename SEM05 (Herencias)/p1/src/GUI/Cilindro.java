package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Padre.Círculo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Cilindro extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtRadio;
	private JTextField txtAltura;
	private JTextField txtAreaCilindro;
	private JTextField txtVolCilindro;
	private JButton btnProcesar;
	private JButton btnLimpiar;
	private JTextArea txtS;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cilindro dialog = new Cilindro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cilindro() {
		setModal(true);
		setTitle("Cilindro");
		setBounds(100, 100, 394, 349);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Radio:");
			lblNewLabel.setBounds(35, 11, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblAltura = new JLabel("Altura:");
			lblAltura.setBounds(35, 47, 46, 14);
			contentPanel.add(lblAltura);
		}
		{
			JLabel lblArea = new JLabel("Area:");
			lblArea.setBounds(35, 79, 46, 14);
			contentPanel.add(lblArea);
		}
		{
			JLabel lblVolumen = new JLabel("Volumen:");
			lblVolumen.setBounds(35, 113, 46, 14);
			contentPanel.add(lblVolumen);
		}
		{
			txtRadio = new JTextField();
			txtRadio.setBounds(91, 8, 86, 20);
			contentPanel.add(txtRadio);
			txtRadio.setColumns(10);
		}
		{
			txtAltura = new JTextField();
			txtAltura.setColumns(10);
			txtAltura.setBounds(91, 44, 86, 20);
			contentPanel.add(txtAltura);
		}
		{
			txtAreaCilindro = new JTextField();
			txtAreaCilindro.setEditable(false);
			txtAreaCilindro.setColumns(10);
			txtAreaCilindro.setBounds(91, 76, 86, 20);
			contentPanel.add(txtAreaCilindro);
		}
		{
			txtVolCilindro = new JTextField();
			txtVolCilindro.setEditable(false);
			txtVolCilindro.setColumns(10);
			txtVolCilindro.setBounds(91, 110, 86, 20);
			contentPanel.add(txtVolCilindro);
		}
		{
			btnProcesar = new JButton("Procesar");
			btnProcesar.addActionListener(this);
			btnProcesar.setBounds(35, 154, 89, 23);
			contentPanel.add(btnProcesar);
		}
		{
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.addActionListener(this);
			btnLimpiar.setBounds(134, 154, 89, 23);
			contentPanel.add(btnLimpiar);
		}
		{
			btnSalir = new JButton("Salir");
			btnSalir.addActionListener(this);
			btnSalir.setBounds(233, 154, 89, 23);
			contentPanel.add(btnSalir);
		}
		
		txtS = new JTextArea();
		txtS.setBounds(35, 188, 296, 91);
		contentPanel.add(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiar) {
			do_btnLimpiar_actionPerformed(e);
		}
		if (e.getSource() == btnProcesar) {
			do_btnProcesar_actionPerformed(e);
		}
	}
	protected void do_btnProcesar_actionPerformed(ActionEvent e) {
		double radio = Double.parseDouble(txtRadio.getText());
		double altura = Double.parseDouble(txtAltura.getText());
		Hijos.Cilindro cl = new Hijos.Cilindro(radio,altura);
		txtAreaCilindro.setText(""+cl.AreaCilindro());
		txtVolCilindro.setText(""+cl.VolumenCilindro());
		txtS.setText(cl.MensajeCilindro());
	}
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
		txtRadio.setText("");
		txtAltura.setText("");
		txtAreaCilindro.setText("");
		txtVolCilindro.setText("");
	}
	protected void do_btnSalir_actionPerformed(ActionEvent e) {
		dispose();
	}
}
