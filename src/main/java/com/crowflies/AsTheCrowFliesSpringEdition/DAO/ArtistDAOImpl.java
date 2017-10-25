package com.crowflies.AsTheCrowFliesSpringEdition.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crowflies.AsTheCrowFliesSpringEdition.Entity.Artist;

public class ArtistDAOImpl implements ArtistDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Artist> listArtists() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveArtist(Artist theArtist) {
		// TODO Auto-generated method stub

	}

	@Override
	public Artist getArtist(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteArtist(int theId) {
		// TODO Auto-generated method stub

	}

}
