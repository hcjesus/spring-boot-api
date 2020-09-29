package org.home.musicapi.repository;

import org.home.musicapi.model.Albums;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository<Albums, Integer> {

}
