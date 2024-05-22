package modelo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class StoreCaballero
 */
@WebServlet("/StoreCaballero")
public class StoreCaballero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreCaballero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("msg", request.getParameter("msg"));	
		
		String nombre = request.getParameter("nombre");
		int fuerza = Integer.parseInt(request.getParameter("fuerza"));
		int experiencia = Integer.parseInt(request.getParameter("experiencia"));
		String foto = request.getParameter("foto");
		
		ModeloArma ma = new ModeloArma();
		ModeloEscudo me = new ModeloEscudo();
		Arma arma = ma.getArma(Integer.parseInt(request.getParameter("arma")));
		Escudo escudo = me.getEscudo(Integer.parseInt(request.getParameter("escudo")));
		
		
		if(Validador.nombreCompleto(nombre)== true && Validador.expYFuerza(experiencia, fuerza)==true && Validador.nombreExiste(nombre)==true && Validador.armaEscudoRellenado(arma, escudo)==true) {
			ModeloCaballero mc = new ModeloCaballero();
			Caballero caballero = new Caballero();
			caballero.setNombre(nombre);
			caballero.setFuerza(fuerza);
			caballero.setExperiencia(experiencia);
			caballero.setFoto(foto);
			
			caballero.setArma(arma);
	
			caballero.setEscudo(escudo);
	
			mc.insertarCaballero(caballero);
			
			response.sendRedirect("IndexCaballeros");
		
		}else if (Validador.nombreCompleto(nombre)==false) {
			//response.sendRedirect("IndexCaballeros?msg=failRegistroNombre");
		}
	}

}
