package pe.edu.upeu.Dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.entity.Estudiante;

public interface EstudianteDao {
	public int create(Estudiante e);
	public int update(Estudiante e);
	public int delete(int id);
	public List<Map<String,Object>> read(int id);
	public List<Map<String,Object>> readAll();
	 
}
