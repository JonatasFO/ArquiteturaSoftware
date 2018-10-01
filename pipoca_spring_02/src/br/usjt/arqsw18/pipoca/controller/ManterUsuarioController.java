package br.usjt.arqsw18.pipoca.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.arqsw18.pipoca.model.entity.Usuario;
import br.usjt.arqsw18.pipoca.model.service.UsuarioService;

@Controller
public class ManterUsuarioController {
    
	private UsuarioService uService;
	
	@Autowired
	public ManterUsuarioController (UsuarioService uService) {
		this.uService = uService;
	}
	
	@RequestMapping ("/cadastro")
	public String novoUsuario() {
		return "CRIAR USUARIO";
	}
	
	@RequestMapping ("/fazerLogin")
	public String fazerLogin (Usuario usuario, HttpServletRequest request) throws IOException {
		if(uService.existe(usuario)) {	
			request.getSession().setAttribute("USUARIO LOGADO", usuario);
			return "index";
		}		
		
		return "LOGIN";
	}
	
	@RequestMapping ("/LOGOUT")
	public String fazerLogin (HttpServletRequest request) throws IOException {
		request.getSession().invalidate();
		return "LOGIN";
	}
	
	@RequestMapping ("/LOGIN")
	public String Login () {
		return "Login";
	}
	
	@RequestMapping ("/CRIAR USUARIO")
	public String criarUsuario (Usuario usuario, HttpServletRequest request) throws IOException {
		uService.inserirUsuario(usuario);
		return this.fazerLogin(usuario, request);
	}
}
