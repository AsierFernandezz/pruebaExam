package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloEscudo {

	public ArrayList<Escudo> mostrarEscudos() {
		
		ArrayList<Escudo> escudos = new ArrayList<Escudo>();
		
		Conector conector = new Conector();
		
		
		try {
			Statement st = conector.getCn().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM escudos");
			
			while(rs.next()) {
				Escudo escudo = new Escudo();
				escudo.setId(rs.getInt("id"));
				escudo.setNombre(rs.getString("nombre"));
				escudo.setCapacidad_defensa(rs.getInt("capacidad_defensa"));
				
				escudos.add(escudo);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	

		return escudos;

	}
	
	public Escudo getEscudo(int id_escudo) {
		
		Escudo escudo = new Escudo();
		Conector conector = new Conector();
		
		try {
			PreparedStatement pst = conector.getCn().prepareStatement("SELECT * FROM escudos WHERE id=?");
			pst.setInt(1, id_escudo);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {

				escudo.setId(rs.getInt("id"));
				escudo.setNombre(rs.getString("nombre"));
				escudo.setCapacidad_defensa(rs.getInt("capacidad_defensa"));
				
				return escudo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return escudo;
		
	}
}
