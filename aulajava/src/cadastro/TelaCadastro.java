package cadastro;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame {
	
	
	//campos do lado direito da janela
	JLabel Nome = new JLabel("Nome:");
	JTextField txtnome = new JTextField();
	JLabel Endereco = new JLabel("Endereço:");
	JTextField txtendereco = new JTextField();
	JLabel Cidade = new JLabel("Cidade:");
	JTextField txtcidade = new JTextField();
	JLabel Bairro = new JLabel("Bairro:");
	JTextField txtbairro = new JTextField();
	JLabel Telefone = new JLabel("Telefone:");
	JTextField txttelefone = new JTextField();
	JLabel RG = new JLabel("RG:");
	JTextField txtrg = new JTextField();
	
	// campos do lado esquerdo da janela
	JLabel CEP = new JLabel("CEP:");
	JTextField txtcep = new JTextField();
	JLabel Celular = new JLabel("Celular:");
	JTextField txtcell = new JTextField();
	JLabel CPF = new JLabel("CPF:");
	JTextField txtcpf = new JTextField();
	
	// botões da janela
	
	JButton Salvar = new JButton("Salvar");
	JButton Imprimir = new JButton("Imprimir");
	
	
	
	public TelaCadastro() {
		super("Tela de Cadastro");
		
	Container paine = this.getContentPane();
	
	//setando  e dimensionando os campos da janela do lado esquerdo 
		
	paine.add(Nome);
	Nome.setBounds(10, 10, 60, 30);
	paine.add(txtnome);
	txtnome.setBounds(80, 10, 300, 30);
	
	paine.add(Endereco);
	Endereco.setBounds(10, 50, 60, 30);
	paine.add(txtendereco);
	txtendereco.setBounds(80, 50, 300, 30);
	
	paine.add(Cidade);
	Cidade.setBounds(10, 90, 60, 30);
	paine.add(txtcidade);
	txtcidade.setBounds(80, 90, 300, 30);
	
	
	paine.add(Bairro);
	Bairro.setBounds(10, 130, 60, 30);
	paine.add(txtbairro);
	txtbairro.setBounds(80, 130, 300, 30);
	
	paine.add(Telefone);
	Telefone.setBounds(10, 170, 60, 30);
	paine.add(txttelefone);
	txttelefone.setBounds(80, 170, 220, 30);
	
	paine.add(RG);
	RG.setBounds(10, 210, 60, 30);
	paine.add(txtrg);
	txtrg.setBounds(80, 210, 220, 30);
	
	
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(800, 400);
		this.setResizable(false);
		
		
	}
	
	public static void main(String [] args) {
			TelaCadastro cadastro = new TelaCadastro();
	}

}
