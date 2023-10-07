$(document).ready(function() {
	cargarDatos();
	function cargarDatos() {
		$.ajax({
			url: '/usuarios',
			method: 'GET',
			success: function(data) {
				$.each(data, function(index, usuario) {
					var fila = '<tr>' +
						'<td>' + usuario.id + '</td>' +
						'<td>' + usuario.clave + '</td>' +
						'<td>' + usuario.tipo + '</td>' +
						'<td>' + usuario.nombre + '</td>' +
						'<td>' + usuario.username + '</td>' +
						'<td>' + usuario.apellidoPaterno + '</td>' +
						'<td>' + usuario.apellidoMaterno + '</td>' +
						'<td>' + usuario.password + '</td>' +
						'<td>' + usuario.tipoUsuario + '</td>' +
						'<td>' + usuario.fechaInicioSesion + '</td>' +
						'<td>' + usuario.fechaFinSesion + '</td>' +
						'<td>' + usuario.tiempoLinea + '</td>' +
						'<td>' + usuario.estatus + '</td>' +
						'</tr>';
					$('#tablaUsuarios tbody').append(fila);
				});
				$('#tablaUsuarios').DataTable();
			},
			error: function(error) {
				console.error(error);
			}

		});
	}

	$('#tipoUsuarioFiltro').on('change', function() {
		var tipoUsuario = $(this).val();
		$('#tablaUsuarios tbody tr').hide();
		if (tipoUsuario) {
			$('#tablaUsuarios tbody tr').each(function() {
				var tipoUsuarioFila = $(this).find('td:eq(8)').text();
				if (tipoUsuarioFila === tipoUsuario) {
					$(this).show();
				}
			});
		} else {
			$('#tablaUsuarios tbody tr').show();
		}
	});
});
$('#btnActualizar').on('click', function(event) {
	event.preventDefault();
	$('#tablaUsuarios tbody').empty();
	$.ajax({
		url: '/usuarios',
		method: 'GET',
		success: function(data) {
			$.each(data, function(index, usuario) {
				var fila = '<tr>' +
					'<td>' + usuario.id + '</td>' +
					'<td>' + usuario.clave + '</td>' +
					'<td>' + usuario.tipo + '</td>' +
					'<td>' + usuario.nombre + '</td>' +
					'<td>' + usuario.username + '</td>' +
					'<td>' + usuario.apellidoPaterno + '</td>' +
					'<td>' + usuario.apellidoMaterno + '</td>' +
					'<td>' + usuario.password + '</td>' +
					'<td>' + usuario.tipoUsuario + '</td>' +
					'<td>' + usuario.fechaInicioSesion + '</td>' +
					'<td>' + usuario.fechaFinSesion + '</td>' +
					'<td>' + usuario.tiempoLinea + '</td>' +
					'<td>' + usuario.estatus + '</td>' +
					'</tr>';
				$('#tablaUsuarios tbody').append(fila);
			});
			$('#tablaUsuarios').DataTable();
		},
		error: function(error) {
			console.error(error);
		}

	});
});

