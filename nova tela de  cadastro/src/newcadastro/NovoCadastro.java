package newcadastro;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class NovoCadastro extends JFrame {
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
		
		// Botões do campo Sexo
		JLabel SEXO = new JLabel ("Sexo:");
		JRadioButton[] Rbtnsexo = new JRadioButton[2];
		ButtonGroup gpradio = new ButtonGroup();{
			Rbtnsexo[0]= new JRadioButton("Masculino");
			Rbtnsexo[1]= new JRadioButton("Feminino");}
		
		MaskFormatter formatTel = null; //add mascara
		MaskFormatter formatCel = null;
		MaskFormatter formatCpf = null;
		MaskFormatter formatCep = null;
		MaskFormatter formatRg = null;
		
		// Campo Estado 
		JLabel Estado = new JLabel("Estado");
		JComboBox cmbEst = new JComboBox();
		
		public NovoCadastro() {
			super("Tela de Cadastro");
			
		Container paine = this.getContentPane();
		
		//adicionando os nome e campos do lado direito  na janela de  cadastro 
			
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
		
		try {
			formatTel = new MaskFormatter ("(##)####-####");
			txttelefone = new JFormattedTextField(formatTel);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		paine.add(Telefone);
		Telefone.setBounds(10, 170, 60, 30);
		paine.add(txttelefone);
		txttelefone.setBounds(80, 170, 220, 30);
		
		try {
			formatRg = new MaskFormatter("##.###.###-A");
			txtrg = new JFormattedTextField(formatRg);
		} catch (Exception exr){
			exr.printStackTrace();
		}
		
		paine.add(RG);
		RG.setBounds(10, 210, 60, 30);
		paine.add(txtrg);
		txtrg.setBounds(80, 210, 220, 30);
		
		//adicionando os nome e campos do lado esquerdo  na janela de  cadastro 
		
		try {
			formatCep = new MaskFormatter("#####-###");
			txtcep = new JFormattedTextField(formatCep);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		paine.add(CEP);
		CEP.setBounds(450, 50, 60, 30);
		paine.add(txtcep);
		txtcep.setBounds(500, 50, 250, 30);
		
		try {
			formatCel = new MaskFormatter("(##)######-####");
			txtcell= new JFormattedTextField(formatCel);
		} catch(Exception exc) {
			exc.printStackTrace();
		}
		
		paine.add(Celular);
		Celular.setBounds(450, 170, 60, 30);
		paine.add(txtcell);
		txtcell.setBounds(500, 170, 250, 30);
		
		try {
			formatCpf = new MaskFormatter("###.###.###.##");
			txtcpf = new JFormattedTextField(formatCpf);
		} catch (Exception exf) {
			exf.printStackTrace();
		}
		
		paine.add(CPF);
		CPF.setBounds(450, 210, 60, 30);
		paine.add(txtcpf);
		txtcpf.setBounds(500, 210, 250, 30);
		
		//adcionando os botões do tipo radio para campo sexo: Masculino ou Feminino
		
		paine.add(SEXO);
		SEXO.setBounds(450, 20, 60, 30);
		gpradio.add(Rbtnsexo[0]);
		gpradio.add(Rbtnsexo[1]);
		paine.add(Rbtnsexo[0]);
		Rbtnsexo[0].setBounds(500, 20, 100, 30);
		paine.add(Rbtnsexo[1]);
		Rbtnsexo[1].setBounds(600, 20, 100, 30);
		
		// adcionando o campo estado na janela de cadastro no lado direito 
		
		paine.add(Estado);
		Estado.setBounds(450, 90, 60, 30);
		paine.add(cmbEst);
		cmbEst.setBounds(500, 90, 250, 30);
		
		cmbEst.addItem("-------");
		cmbEst.addItem("AC");		cmbEst.addItem("AL");
		cmbEst.addItem("AP");		cmbEst.addItem("AM");
		cmbEst.addItem("BA");		cmbEst.addItem("CE");
		cmbEst.addItem("DF");		cmbEst.addItem("ES");
		cmbEst.addItem("GO");		cmbEst.addItem("MA");
		cmbEst.addItem("MT");		cmbEst.addItem("MS");
		cmbEst.addItem("MG");		cmbEst.addItem("PA");
		cmbEst.addItem("PB");		cmbEst.addItem("PR");
		cmbEst.addItem("PE");		cmbEst.addItem("PI");
		cmbEst.addItem("RJ");		cmbEst.addItem("RN");
		cmbEst.addItem("RS");		cmbEst.addItem("RO");
		cmbEst.addItem("RR");		cmbEst.addItem("SC");
		cmbEst.addItem("SP");		cmbEst.addItem("SE");
		cmbEst.addItem("TO");		
		
		// adcionando os botões Salvar e Imprimir na janela de cadastro e posicionando 
		
		paine.add(Salvar);
		Salvar.setBounds(480, 300, 100, 30);
		paine.add(Imprimir);
		Imprimir.setBounds(600, 300, 100, 30);
		
		
			
			this.setLayout(null);
			this.setVisible(true);
			this.setSize(800, 400);
			this.setResizable(false);

		}

		public static void main(String [] args) {
			
			NovoCadastro cadastro = new NovoCadastro();		
		
		}
	}
