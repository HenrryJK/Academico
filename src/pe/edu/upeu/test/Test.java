package pe.edu.upeu.test;

import com.google.gson.Gson;

import pe.edu.upeu.Dao.EscuelasDao;
import pe.edu.upeu.Dao.EstudianteDao;
import pe.edu.upeu.DaoImp.EscuelasDaoImp;
import pe.edu.upeu.DaoImp.EstudianteDaoImp;
import pe.edu.upeu.util.Conexion;

public class Test {
	private static EstudianteDao pd = new EstudianteDaoImp();
	private static Gson g = new Gson();
	private static EscuelasDao es = new EscuelasDaoImp();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conex();
		//listarP();
		ListaC();
		
 }
	 static void conex() {
		  if(Conexion.getConexion()!=null) {
			  System.out.println("Conectado");
		  }else {
			 System.out.println("Desconectado"); 
		  }	  
	  }
	 
	 
	 static void listarP() {
		  System.out.println(g.toJson(pd.readAll()));
	}
	 
	 static void ListaC() {
		 System.out.println(g.toJson(es.readAll()));
		
	}
	
	
}
