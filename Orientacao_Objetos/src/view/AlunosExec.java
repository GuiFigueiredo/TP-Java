package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {
	public static void main (String []args) {
		Alunos alunos = new Alunos();
		try {
			
			alunos.setNome("Davi luiz");
			alunos.setEndereco("rua davi luiz");
			alunos.setBairro("Jd davi luiz");
			
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			alunosJdbcDao.salvar(alunos);
			alunosJdbcDao.listar();
			alunosJdbcDao.alterar();
			alunosJdbcDao.excluir();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
