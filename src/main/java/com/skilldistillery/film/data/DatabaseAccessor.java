package com.skilldistillery.film.data;

import java.sql.SQLException;
import com.skilldistillery.film.entities.*;
import java.util.List;

import com.skilldistillery.film.entities.*;

public interface DatabaseAccessor{
  public Film getFilmById(int filmId) throws SQLException;
  public Actor getActorById(int actorId) throws SQLException;
  public List<Actor> getActorsByFilmId(int filmId) throws SQLException;
  public List<Film> getFilmBySearchTerm(String searchTerm) throws SQLException;
  public String getFilmLanguage(int filmId) throws SQLException;
  public Film getAllFilmDetails(int filmId) throws SQLException;
  public Film getFilmCategories(int filmId) throws SQLException;
  public List<FilmInventory> getFilmInventory(int filmId) throws SQLException;
  public Film addFilm(Film film) throws SQLException;
  public boolean deleteFilm(Film film) throws SQLException;
  
}
