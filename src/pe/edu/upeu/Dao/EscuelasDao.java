package pe.edu.upeu.Dao;

import java.util.List;

import pe.edu.upeu.entity.Escuelas;

public interface EscuelasDao {
	public int create(Escuelas e);
	public int update(Escuelas e);
	public int delete(int id);
	public Escuelas read(int id);
	public List<Escuelas> readAll();
}
