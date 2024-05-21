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
				caballero.setArma(new ModeloArma().getArma(rs.getInt("id")));
				caballero.setEscudo(new ModeloEscudo().getEscudo(rs.getInt("id")));
				
				caballeros.add(caballero);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return caballeros;

	}
	
	

}
