package aula;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraTela extends JFrame{
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	public PrimeiraTela() {
		super("Titulo da Minha Janela");
		
		Container paine = this.getContentPane();   //Fixa os objetos no layout
		
		paine.add(lblNome);
		lblNome.setBounds(10,20,100,20);
		
		paine.add(txtNome);
		txtNome.setBounds(50,20,220,20);
		
		////////////////////////////////////////////////////
		
		JLabel lblCpf = new JLabel("CPF: ");
		JTextField txtCpf = new JTextField();
			
			
			paine.add(lblCpf);
			lblCpf.setBounds(10,50,100,20);
			
			paine.add(txtCpf);
			txtCpf.setBounds(50,50,220,20);
			
		////////////////////////////////////////////////////
			
		JLabel lblEndereco = new JLabel("Endereço: ");
		JTextField txtEndereco = new JTextField();
		
			paine.add(lblEndereco);
			lblEndereco.setBounds(10,80,100,20);
			
			paine.add(txtEndereco);
			txtEndereco.setBounds(70,80,200,20);
		
		////////////////////////////////////////////////////
			
			JLabel lblTelefone = new JLabel("Telefone: ");
			JTextField txtTelefone = new JTextField();
			
				paine.add(lblTelefone);
				lblTelefone.setBounds(10,110,100,20);
				
				paine.add(txtTelefone);
				txtTelefone.setBounds(70,110,200,20);
		
			
		////////////////////////////////////////////////////
		
				JLabel lblCelular = new JLabel("Celular: ");
				JTextField txtCelular = new JTextField();
				
					paine.add(lblCelular);
					lblCelular.setBounds(290,110,100,20);
					
					paine.add(txtCelular);
					txtCelular.setBounds(340,110,200,20);
				
		////////////////////////////////////////////////////
			
		this.setLayout(null);
		this.setSize(600, 400);
		//this.setResizable(0);
		this.setVisible(true);
		
		
	}
	public static void main(String args[]) {
		PrimeiraTela tela = new PrimeiraTela();
	}
}
