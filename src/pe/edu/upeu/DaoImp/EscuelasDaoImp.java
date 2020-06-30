package pe.edu.upeu.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.Dao.EscuelasDao;
import pe.edu.upeu.entity.Escuelas;
import pe.edu.upeu.util.Conexion;

public class EscuelasDaoImp implements EscuelasDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Escuelas e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Escuelas e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Escuelas read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Escuelas> readAll() {
		// TODO Auto-generated method stub
		List<Escuelas> list = new ArrayList<>();
		String sql = "select * from escuelas";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Escuelas a = new Escuelas();
				a.setIdescuela(rs.getInt("idescuela"));
				a.setNombre(rs.getString("nombre"));
			    list.add(a);
			    
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	}


