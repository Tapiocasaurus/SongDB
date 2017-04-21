package edu.dmacc.spring.songDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="songs")
public class Song {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private int id;
private String songName;
private String bandName;
private String genre;
private int year;

public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
public String getSongName() {
	return songName;
}
public void setSongName(String songName) {
	this.songName = songName;
}
public String getBandName() {
	return bandName;
}
public void setBandName(String bandName) {
	this.bandName = bandName;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}
