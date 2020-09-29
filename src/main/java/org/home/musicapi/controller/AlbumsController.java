package org.home.musicapi.controller;

import java.util.List;

import org.home.musicapi.model.Albums;
import org.home.musicapi.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AlbumsController {

	@Autowired
	private IAlbumsService serviceAlbum;
	
	@GetMapping("/albums")
	public List<Albums> buscarTodos(){
		return serviceAlbum.buscarTodos();
	}
	
	@PostMapping("/albums")
	public Albums crearAlbum(@RequestBody Albums album){
		serviceAlbum.createAlbum(album);
		return album;
	}
	
	@PutMapping("/albums")
	public Albums actualizarAlbum(@RequestBody Albums album){
		serviceAlbum.createAlbum(album);
		return album;
	}
	
	@DeleteMapping("/albums/{id}")
	public int eliminar(@PathVariable("id") int idal) {
		serviceAlbum.eliminar(idal);
		return idal;
	}
}
