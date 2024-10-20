package com.security.test.springbootsecurity.produto;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.test.springbootsecurity.produto.model.Product;
import com.security.test.springbootsecurity.produto.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController
public class ProductController {
	private final ProductRepository repository;
	@PostMapping("/private")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		return ResponseEntity.ok(repository.save(product));
	}
	@GetMapping("/private/access")
	public String accessPrivate(@AuthenticationPrincipal OidcUser principal) {
		return "You have access private" + principal;
	}
	
	@GetMapping("/public")
	public ResponseEntity<List<Product>> listarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}

}
