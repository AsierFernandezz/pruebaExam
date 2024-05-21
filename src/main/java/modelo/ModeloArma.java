package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloArma {

	public ArrayList<Arma> getArmas() {
	
		ArrayList<Arma> armas = new ArrayList<>();
		
		Conector conector = new Conector();
		
		try {
			Statement st = conector.getCn().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM armas");
			
			while(rs.next()) {
				Arma arma = new Arma();
				arma.setId(rs.getInt("id"));
				arma.setNombre(rs.getString("nombre"));
				arma.setCapacidad_danio(rs.getInt("capacidad_danio"));
				arma.setFoto(rs.getString("foto"));
				
				armas.add(arma);

				return armas;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return armas;

	}
	
	public Arma getArma(int id_arma) {
		
		Arma arma = new Arma();
		Conector conector = new Conector();
		
		try {
			PreparedStatement pst = conector.getCn().prepareStatement("SELECT * FROM armas WHERE id=?");
			pst.setInt(1, id_arma);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {

				arma.setId(rs.getInt("id"));
				arma.setNombre(rs.getString("nombre"));
				arma.setCapacidad_danio(rs.getInt("capacidad_danio"));
				arma.setFoto(rs.getString("foto"));
				
				return arma;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return arma;
		
	}

}
