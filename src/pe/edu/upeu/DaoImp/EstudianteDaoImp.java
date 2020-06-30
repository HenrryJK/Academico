package pe.edu.upeu.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Dao.EstudianteDao;
import pe.edu.upeu.entity.Estudiante;
import pe.edu.upeu.util.Conexion;

public class EstudianteDaoImp implements EstudianteDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Estudiante e) {
		// TODO Auto-generated method stub
		int x = 0;
		String sql ="INSERT INTO Estudiante (idestudiante, idescuela, apellnombres, correo, telefono) VALUES (NULL, ?, ?, ?, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setInt(1, e.getIdescuela());
			ps.setString(2, e.getApellnombres());
			ps.setString(3, e.getCorreo());
			ps.setString(4, e.getTelefono());
			x = ps.executeUpdate();
		} catch (Exception er) {
			// TODO: handle exception
			System.out.println(er);
		}
		return x;
	}

	@Override
	public int update(Estudiante e) {
		// TODO Auto-generated method stub
		 int x = 0;
		 String sql = "Update Estudiante SET idescuela = ?, apellnombres= ? , correo = ?, telefono = ? where idestudiante = ?";
		 
		 try {
			 cx = Conexion.getConexion();
			 ps= cx.prepareStatement(sql);
			 ps.setInt(1, e.getIdescuela());
			 ps.setString(2, e.getApellnombres());
			 ps.setString(3, e.getCorreo());
			 ps.setString(4, e.getTelefono());
			 ps.setInt(5, e.getIdestudiante());
			 x = ps.executeUpdate();
		} catch (Exception er) {
			System.out.println(er);
		}
		 
					 
			return x;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int x = 0;
		
		String sql = "DELETE FROM Estudiante where idestudiante = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setInt(1, id);
			x = ps.executeUpdate();
		} catch (Exception er) {
			System.out.println(er);
		}
		return x;
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = new ArrayList<>();
		String sql = "select e.idescuela , e.nombre , " + 
		"a.idestudiante , a.apellnombres , " + 
		 "a.correo, a.telefono from estudiante as a," + 
		"escuelas as e where e.idescuela = a.idescuela and a.idestudiante = ?";
		
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			ps.setInt(1, id);
			rs= ps.executeQuery();
			while(rs.next()) {
				 Map<String, Object> map = new HashMap<String,Object>();
				 map.put("idescuela", rs.getInt("idescuela"));
				 map.put("nombre", rs.getString("nombre"));
				 map.put("idestudiante", rs.getInt("idestudiante"));
				 map.put("apellnombres",rs.getString("apellnombres"));
				 map.put("correo", rs.getString("correo"));
				 map.put("telefono", rs.getString("telefono"));
				  list.add(map);
				
			}
			
			
			
		} catch (Exception e) {
		
			System.out.println(e);
		 
		 
		
		}
		
		return list;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = new ArrayList<>();
		String sql = "select e.idescuela , e.nombre , " + 
		"a.idestudiante , a.apellnombres, " + 
		 "a.correo, a.telefono from estudiante as a," + 
		"escuelas as e where e.idescuela = a.idescuela";
		
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(sql);
			rs= ps.executeQuery();
			
			while(rs.next()) {
				 Map<String, Object> map = new HashMap<String,Object>();
				 map.put("idescuela", rs.getInt("idescuela"));
				 map.put("nombre", rs.getString("nombre"));
				 map.put("idestudiante", rs.getInt("idestudiante"));
				 map.put("apellnombre",rs.getString("apellnombres"));
				 map.put("correo", rs.getObject("correo"));
				 map.put("telefono", rs.getObject("telefono"));
				  list.add(map);
				
			}
			
			
			
		} catch (Exception e) {
		
			System.out.println(e);
		 
		}
		
		return list;
	}

}
