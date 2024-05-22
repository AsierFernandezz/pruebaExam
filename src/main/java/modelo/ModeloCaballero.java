package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloCaballero {

	public ArrayList<Caballero> mostrarCaballeros() {

		ArrayList<Caballero> caballeros = new ArrayList<Caballero>();
		
		Conector conector = new Conector();
		
		try {
			Statement st = conector.getCn().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM caballeros");
			
			while(rs.next()) {
				Caballero caballero = new Caballero();
				caballero.setId(rs.getInt("id"));
				caballero.setNombre(rs.getString("nombre"));
				caballero.setFuerza(rs.getInt("fuerza"));
				caballero.setExperiencia(rs.getInt("experiencia"));
				caballero.setFoto(rs.getString("foto"));

				caballero.setArma(new ModeloArma().getArma(rs.getInt("arma_id")));
				caballero.setEscudo(new ModeloEscudo().getEscudo(rs.getInt("escudo_id")));
				
				caballeros.add(caballero);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return caballeros;

	}
	
	public void insertarCaballero(Caballero caballero) {
		
		Conector conector = new Conector();
		
		try {
			PreparedStatement pst = conector.getCn().prepareStatement("INSERT INTO caballeros (id,nombre, fuerza, experiencia, foto, arma_id, escudo_id) VALUES (?,?,?,?,?,?,?)");
			pst.setInt(1, caballero.getId());
			pst.setString(2, caballero.getNombre());
			pst.setInt(3, caballero.getFuerza());
			pst.setInt(4, caballero.getExperiencia());
			pst.setString(5, caballero.getFoto());
			pst.setInt(6, caballero.getArma().getId());
			pst.setInt(7, caballero.getEscudo().getId());
			
			pst.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean testNombre(String nombre) {

		Conector conector = new Conector();
		
		try {
			PreparedStatement pst = conector.getCn().prepareStatement("SELECT * FROM caballeros WHERE nombre=?");
			pst.setString(1, nombre);
			ResultSet rs = pst.executeQuery();
			
			return true;
			
		} catch (SQLException e) {
			return false;
		}
		
	}

}
