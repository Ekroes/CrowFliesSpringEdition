package com.crowflies.AsTheCrowFliesSpringEdition.DAO;

import java.util.List;

import com.crowflies.AsTheCrowFliesSpringEdition.Entity.Artist;

public interface ArtistDAO {

	public List<Artist> listArtists();

	public void saveArtist(Artist theArtist);

	public Artist getArtist(int theId);

	public void deleteArtist(int theId);

}
