package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.entidade.usuario;

@WebServlet("/cadastrarUsuario")
public class CadastroUsuarioServelet extends HttpServlet {

	//Simular o banco de dados
	private List<usuario> lstDeUsuario;
	
	@Override
	public void init() throws ServletException {
		this.lstDeUsuario = new ArrayList<usuario>();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");
		
		//Verificar se as senhas são iguais
		if(senha1.equals(senha2)) {
			usuario usu = new usuario();
			usu.setNome(req.getParameter("nome"));
			usu.setEmail(req.getParameter("email"));
			usu.setSenha(senha1);
			lstDeUsuario.add(usu);
			//redirecionar o usuário para a pag. de login
			resp.sendRedirect("index.html");
		}else {
			
			//redirecionar o usuário para a pag. de cadastro do usuário
			req.getRequestDispatcher("cadastroUsuario.html").forward(req, resp);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		for (usuario usuario : lstDeUsuario) {
			System.out.println(usuario.getNome().concat(" - ").concat(usuario.getEmail()));
		}
	}
	
	@Override
	public void destroy() {
		this.lstDeUsuario.clear();
	}
}