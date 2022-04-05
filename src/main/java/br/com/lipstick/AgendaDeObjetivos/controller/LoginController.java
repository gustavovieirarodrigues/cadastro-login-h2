package br.com.lipstick.AgendaDeObjetivos.controller;

import br.com.lipstick.AgendaDeObjetivos.model.Credenciais;
import br.com.lipstick.AgendaDeObjetivos.model.TodosUsuarios;
import br.com.lipstick.AgendaDeObjetivos.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

	TodosUsuarios todosUsuarios;

	@Autowired
	public LoginController(TodosUsuarios todosUsuarios) {
		this.todosUsuarios = todosUsuarios;
	}

	public LoginController() {

	}

	@PostMapping("/login")
	public ResponseEntity<String> validarLogin(@RequestBody Credenciais credenciais){
		if (todosUsuarios.usuarioExiste(credenciais) == null){
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("ERRO");
		}
		return ResponseEntity.ok("Sucesso");
	}
}

