package expertostech.encriptarsenhausuario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import expertostech.encriptarsenhausuario.model.UsuarioModel;
import expertostech.encriptarsenhausuario.repository.UsuarioRepositiry;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/api/usuario")
public class UsuarioController {

	private final UsuarioRepositiry repository;
	private final PasswordEncoder encoder;

	@GetMapping("/listarTodos")
	public ResponseEntity<List<UsuarioModel>> listarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}

	@PostMapping("salvar")
	public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario) {
		usuario.setPassword(encoder.encode(usuario.getPassword()));
		return ResponseEntity.ok(repository.save(usuario));
	}

	@GetMapping("/validarSenha")
	public ResponseEntity<Boolean> validarSenha(@RequestParam String login, @RequestParam String password) {
		log.info("[inicia ] validar senha");
		Optional<UsuarioModel> optUsuario = repository.findByLogin(login);
		if (optUsuario.isEmpty()) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
		}
		boolean valid = false;
		UsuarioModel usuario = optUsuario.get();
		valid = encoder.matches(password, usuario.getPassword());
		HttpStatus status = (valid ? HttpStatus.OK : HttpStatus.UNAUTHORIZED);
		log.info("[finaliza ] validar senha");
		return ResponseEntity.status(status).body(valid);
		
	}
}
