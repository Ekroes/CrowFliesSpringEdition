package com.crowflies.AsTheCrowFliesSpringEdition.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crowflies.AsTheCrowFliesSpringEdition.Entity.Artist;
import com.crowflies.AsTheCrowFliesSpringEdition.Service.ArtistService;



@Controller
@RequestMapping("/artist")
public class ArtistController {

	
	@Autowired
	private ArtistService artistService;
	
	@GetMapping("/list")
	public String listArtist(Model theModel){
		
		List<Artist> theArtists = artistService.listArtists();
		
		theModel.addAttribute("artists", theArtists);
		
		return "list-artists";
	}
	
	@GetMapping("/showAddArtistForm")
	public String showAddArtistForm(Model theModel){
		
		Artist theArtist = new Artist();
		
		theModel.addAttribute("artist", theArtist);
		
		return "artist-form";
		
	}
	
	@PostMapping("/saveArtist")
	public String saveArtist(@ModelAttribute("artist") Artist theArtist){
		
		if(theArtist.getEnd() == null || "".equals(theArtist.getEnd())){
			theArtist.setEnd(null);
		}
		
	artistService.saveArtist(theArtist);
		
		return "redirect:/artist/list";
		
	}
	
	@GetMapping("/showArtistUpdateForm")
	public String showArtistUpdateForm(@RequestParam("artistId") int theId,
			Model theModel){
		
		Artist theArtist = artistService.getArtist(theId);
		
		theModel.addAttribute("artist", theArtist);
		
		return "artist-form";
	}
	
	@GetMapping("/delete")
	public String deleteArtist(@RequestParam("artistId") int theId){
		
		artistService.deleteArtist(theId);
		
		return "redirect:/artist/list";
	}

}
