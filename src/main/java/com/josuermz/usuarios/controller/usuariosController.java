package com.josuermz.usuarios.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.josuermz.usuarios.model.usuariosModel;
import com.josuermz.usuarios.service.usuariosService;

import org.springframework.ui.Model;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class usuariosController {

	@Autowired
	usuariosService UsuariosService;

	@GetMapping("/usuarios")
	public ResponseEntity<List<usuariosModel>> obtenerUsuarios() throws IOException {
		List<usuariosModel> usuarios = UsuariosService.leerArchivo();
		return ResponseEntity.ok(usuarios);
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/datos")
	public String datos() {
		return "datos";
	}
}
