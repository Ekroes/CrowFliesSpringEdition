package com.crowflies.AsTheCrowFliesSpringEdition.Service;

import java.util.List;

import com.crowflies.AsTheCrowFliesSpringEdition.Entity.Artist;

public interface ArtistService {

	public List<Artist> listArtists();

	public void saveArtist(Artist theArtist);

	public Artist getArtist(int theId);

	public void deleteArtist(int theId);

}
