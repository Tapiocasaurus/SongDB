package edu.dmacc.spring.songDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.dmacc.spring.songDB.Song;


@Controller
public class SongController {
	@Autowired SongDao dao;
	private static final String[] genres = {"Rock", "Country","Blues","Jazz","Hip-Hop","Classical"};
	
	@RequestMapping(value = "/form")
	public ModelAndView user(){
	ModelAndView modelAndView = new ModelAndView();
	
	modelAndView.setViewName("songForm");
	modelAndView.addObject("song", new Song());
	modelAndView.addObject("genres", genres);
	
	return modelAndView;
}

@RequestMapping(value = "/result")
	public ModelAndView processSong(Song song){
	System.out.println("In processUser");
	ModelAndView modelAndView = new ModelAndView();
	dao.insertUser(song);
	System.out.println("Value in getname" + song.getSongName());
	modelAndView.setViewName("songResult");
	modelAndView.addObject("u", song);
	return modelAndView;
}

@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll(){
	ModelAndView modelAndView = new ModelAndView();
	List<Song> allUsers = dao.getAllUsers();
	modelAndView.setViewName("viewAllSongs");
	modelAndView.addObject("all", allUsers);
	return modelAndView;
}

@Bean
	public SongDao dao(){
	SongDao bean = new SongDao();
	return bean;
}

}
