package org.home.musicapi.service.jpa;

import java.util.List;

import org.home.musicapi.model.Albums;
import org.home.musicapi.repository.AlbumsRepository;
import org.home.musicapi.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService implements IAlbumsService {
	
	@Autowired
	private AlbumsRepository albumsRepo;

	@Override
	public List<Albums> buscarTodos() {
		List<Albums> albums = albumsRepo.findAll();
		return albums;
	}

	@Override
	public void createAlbum(Albums album) {
		albumsRepo.save(album);
		
	}

	@Override
	public void eliminar(int id) {
		albumsRepo.deleteById(id);
		
	}

}
