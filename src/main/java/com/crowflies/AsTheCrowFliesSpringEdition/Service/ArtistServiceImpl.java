package com.crowflies.AsTheCrowFliesSpringEdition.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crowflies.AsTheCrowFliesSpringEdition.DAO.ArtistDAO;
import com.crowflies.AsTheCrowFliesSpringEdition.Entity.Artist;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	private ArtistDAO artistDAO;
	
	@Override
	@Transactional
	public List<Artist> listArtists() {
		// TODO Auto-generated method stub
		return artistDAO.listArtists();
	}

	@Override
	@Transactional
	public void saveArtist(Artist theArtist) {
		artistDAO.saveArtist(theArtist);
	

	}

	@Override
	@Transactional
	public Artist getArtist(int theId) {
		// TODO Auto-generated method stub
		return artistDAO.getArtist(theId);
	}

	@Override
	@Transactional
	public void deleteArtist(int theId) {
		artistDAO.deleteArtist(theId);

	}

}
