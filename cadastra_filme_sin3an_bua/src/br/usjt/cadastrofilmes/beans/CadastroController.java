package br.usjt.cadastrofilmes.beans;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {

	@RequestMapping("/cadastrar")
	public String n(Filmes f) {
		Random r = new Random();
		//System.out.println(r.nextInt());
		int id = r.nextInt();
		System.out.println(id);
		// System.out.println("chamou o controller cadastrar");
		return "cadastrado";

	}
	
	@RequestMapping("novoFilme")
	public String form() {
	 return "cadastrar";
	 }
	 
}