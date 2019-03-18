package calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.lang.Math;
public class Calculadora extends JFrame {
	
	
	JTextField campo = new JTextField();
	
	JButton MC = new JButton("MC");
	
	JButton MR = new JButton("MR");
	
	JButton MS = new JButton("MS");
	
	JButton Mmais = new JButton("M+");
	
	JButton Mmenos = new JButton("M-");
	
	JButton SETA = new JButton("<-");
	
	JButton CE = new JButton("CE");
	
	JButton C = new JButton("C");
	
	JButton MAISMENOS = new JButton("+-");
	
	JButton RAIZ = new JButton("Raiz");
	
	JButton SETE = new JButton("7");
	
	JButton OITO = new JButton("8");
	
	JButton NOVE = new JButton("9");
	
	JButton DIVISAO = new JButton("/");
	
	JButton  PCENT = new JButton("%");

	JButton QUATRO = new JButton("4");

	JButton CINCO = new JButton("5");
	
	JButton SEIS = new JButton("6");
	
	JButton MULTI = new JButton("*");
	
	JButton UMBX = new JButton("1/X");
	
	JButton UM = new JButton("1");
	
	JButton DOIS = new JButton("2");

	JButton TRES = new JButton("3");
	
	JButton MENOS = new JButton("-");
	
	JButton IGUAL = new JButton("=");
	
	JButton ZERO = new JButton("0");
	
	JButton VIRGULA = new JButton(",");
	
	JButton MAIS = new JButton("+");
	

		FuncoesMatematicas FM = new FuncoesMatematicas();
		String sinal = null;
		double valor1 = 0,  valor2=0;


	public Calculadora(){
	
		super ("calculadora");
		
		Container paine = this.getContentPane();
		
		
		paine.add(campo);
		campo.setBounds(20, 80, 340, 100);
		campo.setFont(new Font("Arial", Font.PLAIN, 20));
		
		paine.add(MC);
		MC.setBounds(20, 190, 60, 60);
		MC.setFont(new Font("Arial", Font.PLAIN, 20));
		MC.setMargin(new Insets(1,1,1,1));
		
		paine.add(MR);
		MR.setBounds(90, 190, 60, 60);
		MR.setFont(new Font("Arial", Font.PLAIN, 20));
		MR.setMargin(new Insets(1,1,1,1));
		
		paine.add(MS);
		MS.setBounds(160, 190, 60, 60);
		MS.setFont(new Font("Arial", Font.PLAIN, 20));
		MS.setMargin(new Insets(1,1,1,1));
		
		paine.add(Mmais);
		Mmais.setBounds(230, 190, 60, 60);
		Mmais.setFont(new Font("Arial", Font.PLAIN, 20));
		Mmais.setMargin(new Insets(1,1,1,1));
		
		paine.add(Mmenos);
		Mmenos.setBounds(300, 190, 60, 60);
		Mmenos.setFont(new Font("Arial", Font.PLAIN, 20));
		Mmenos.setMargin(new Insets(1,1,1,1));
		
		paine.add(SETA);
		SETA.setBounds(20, 260, 60, 60);
		SETA.setFont(new Font("Arial", Font.PLAIN, 20));
		
		paine.add(CE);
		CE.setBounds(90, 260, 60, 60);
		CE.setFont(new Font("Arial", Font.PLAIN, 20));
		CE.setMargin(new Insets(1,1,1,1));
		CE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals(valor1)) {
					campo.setText("0");
				}
			}
		});
		
		paine.add(C);
		C.setBounds(160, 260, 60, 60);
		C.setFont(new Font("Arial", Font.PLAIN, 20));
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			campo.setText("");	
			}
		});
		paine.add(MAISMENOS);
		MAISMENOS.setBounds(230, 260, 60, 60);
		MAISMENOS.setFont(new Font("Arial", Font.PLAIN, 20));
		
		paine.add(RAIZ);
		RAIZ.setBounds(300, 260, 60, 60);
		RAIZ.setFont(new Font("Arial", Font.PLAIN, 20));
		RAIZ.setMargin(new Insets(1,1,1,1));
		RAIZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1= Double.parseDouble(campo.getText());
				sinal = "raiz";
				campo.setText(FM.raiz(valor1)+"");
				
			}
		});
		
		
		paine.add(SETE);
		SETE.setBounds(20, 330, 60, 60);
		SETE.setFont(new Font("Arial", Font.PLAIN, 20));
		SETE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
					campo.setText("7");
				}else {
					campo.setText(campo.getText()+"7");
				}
			}
		});
		
		paine.add(OITO);
		OITO.setBounds(90, 330, 60, 60);
		OITO.setFont(new Font("Arial", Font.PLAIN, 20));
		OITO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
					campo.setText("8");
				}else {
					campo.setText(campo.getText()+"8");
				}
			}
			
		});


		paine.add(NOVE);
		NOVE.setBounds(160, 330, 60, 60);
		NOVE.setFont(new Font("Arial", Font.PLAIN, 20));
		NOVE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
					campo.setText("9");
				}else {
					campo.setText(campo.getText()+"9");
					
				}
			}
			
		});

		
		paine.add(DIVISAO);
		DIVISAO.setBounds(230, 330, 60, 60);
		DIVISAO.setFont(new Font("Arial", Font.PLAIN, 20));
		DIVISAO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(campo.getText());
				sinal = "divisão";
				campo.setText("0");
			}
		});
		paine.add(PCENT);
		PCENT.setBounds(300, 330, 60, 60);
		PCENT.setFont(new Font("Arial", Font.PLAIN, 20));
		PCENT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1= Double.parseDouble(campo.getText());
				sinal ="porcentagem";
				campo.setText("0");
			}
		});
		
		paine.add(QUATRO);
		QUATRO.setBounds(20, 400, 60, 60);
		QUATRO.setFont(new Font("Arial", Font.PLAIN, 20));
		QUATRO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
					campo.setText("4");
				}else {
					campo.setText(campo.getText()+"4");
					
				}
			}
		});
		
		paine.add(CINCO);
		CINCO.setBounds(90, 400, 60, 60);
		CINCO.setFont(new Font("Arial", Font.PLAIN, 20));
		CINCO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
					campo.setText("5");
				}else {
					campo.setText(campo.getText()+"5");
				}
			}
			
		});
		
		paine.add(SEIS);
		SEIS.setBounds(160, 400, 60, 60);
		SEIS.setFont(new Font("Arial", Font.PLAIN, 20));
		SEIS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
					campo.setText("6");
				}else {
					campo.setText(campo.getText()+"6");
				}
			}
		});
		
		paine.add(MULTI);
		MULTI.setBounds(230, 400, 60, 60);
		MULTI.setFont(new Font("Arial", Font.PLAIN, 20));
		MULTI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				valor1= Double.parseDouble(campo.getText());
				sinal = "multiplicação";
				campo.setText("0");
			}
		});
		paine.add(UMBX);
		UMBX.setBounds(300, 400, 60, 60);
		UMBX.setFont(new Font("Arial", Font.PLAIN, 20));
		UMBX.setMargin(new Insets(1,1,1,1));
		
		paine.add(UM);
		UM.setBounds(20, 470, 60, 60);
		UM.setFont(new Font("Arial", Font.PLAIN, 20));
		UM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
					campo.setText("1");
				}else {
					campo.setText(campo.getText()+"1");
				}
			}
		});
		paine.add(DOIS);
		DOIS.setBounds(90, 470, 60, 60);
		DOIS.setFont(new Font("Arial", Font.PLAIN, 20));
		DOIS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
				campo.setText("2");
				
			}else {
				campo.setText(campo.getText()+"2");
			}
			}
		});
		paine.add(TRES);
		TRES.setBounds(160, 470, 60, 60);
		TRES.setFont(new Font("Arial", Font.PLAIN, 20));
		TRES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
					campo.setText("3");
				}else {
					campo.setText(campo.getText()+"3");
					}
				
			}
		});
		paine.add(MENOS);
		MENOS.setBounds(230, 470, 60, 60);
		MENOS.setFont(new Font("Arial", Font.PLAIN, 20));
		MENOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(campo.getText());
					sinal ="subtração";
					campo.setText("0");
			}
		});
		
		paine.add(IGUAL);
		IGUAL.setBounds(300, 470, 60, 130);
		IGUAL.setFont(new Font("Arial", Font.PLAIN, 20));
		IGUAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2= Double.parseDouble(campo.getText());
				if(sinal.equals("soma")) {
					campo.setText(FM.soma(valor1,valor2)+"");
				}
				else if(sinal.equals("subtração")) {
					campo.setText(FM.subtrair(valor1,valor2)+"");
				} 
				else if(sinal.equals("multiplicação")) {
					campo.setText(FM.multiplicar(valor1, valor2)+"");
				}
				else if(sinal.equals("divisão")) {
					campo.setText(FM.dividir(valor1, valor2)+"");
				}
				else if(sinal.equals("porcentagem")) {
					campo.setText(FM.porcentagem(valor1, valor2)+"");
				}

			}
		});
		
		paine.add(ZERO);
		ZERO.setBounds(20, 540, 130, 60);
		ZERO.setFont(new Font("Arial", Font.PLAIN, 20));
		ZERO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campo.getText().equals("0")) {
					campo.setText("0");
				}else {
					campo.setText(campo.getText()+"0");
				}
			}
		});
		
		paine.add(VIRGULA);
		VIRGULA.setBounds(160, 540, 60, 60);
		VIRGULA.setFont(new Font("Arial", Font.PLAIN, 20));
		
		paine.add(MAIS);
		MAIS.setBounds(230, 540, 60, 60);
		MAIS.setFont(new Font("Arial", Font.PLAIN, 20));
		MAIS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1= Double.parseDouble(campo.getText());
				sinal = "soma";
				campo.setText("0");
			}
		});
		
		
		
		
	
	
			this.setLayout(null);
			this.setVisible(true);
			this.setResizable(false);
			this.setSize(390,650);
			this.setLocation(400, 100);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	
	}
	
	public static void main(String [] args) {
		
	Calculadora calculadora = new Calculadora();
		}
	}

