package com.josuermz.usuarios.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.josuermz.usuarios.model.usuariosModel;

@Service
public class usuariosService {
	public List<usuariosModel> leerArchivo() throws IOException {
		List<usuariosModel> usuarios = new ArrayList<>();

		ClassPathResource resource = new ClassPathResource("repositorio.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));

		String linea;

		while ((linea = br.readLine()) != null) {
			String[] partes = linea.split(",");
			usuariosModel usuario = new usuariosModel();
			usuario.setId(Integer.parseInt(partes[0]));
			usuario.setClave(partes[1]);
			usuario.setTipo(partes[2]);
			usuario.setNombre(partes[3]);
			usuario.setUsername(partes[4]);
			usuario.setApellidoPaterno(partes[5]);
			usuario.setApellidoMaterno(partes[6]);
			usuario.setPassword(partes[7]);
			usuario.setTipoUsuario(partes[8]);
			usuario.setFechaInicioSesion(partes[9]);
			usuario.setFechaFinSesion(partes[10]);
			usuario.setTiempoLinea(partes[11]);
			usuario.setEstatus(partes[12]);
			usuarios.add(usuario);
		}

		br.close();
		return usuarios;
	}
}
