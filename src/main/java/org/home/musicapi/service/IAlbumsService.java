package org.home.musicapi.service;

import java.util.List;

import org.home.musicapi.model.Albums;

public interface IAlbumsService {
	List<Albums> buscarTodos();
	void createAlbum(Albums album);
	void eliminar(int id);

}
