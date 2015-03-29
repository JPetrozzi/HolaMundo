package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.HolaMundoController;


@WebServlet("/RegistrarUsuario")
public class RegistrarUsuario extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public RegistrarUsuario() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HolaMundoController hmc = new HolaMundoController();
		String email = request.getParameter("email");
		String pass = request.getParameter("pass1");
		String nom = request.getParameter("nombre");
		
		if(hmc.RegistrarUsuario(email, pass, nom))
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("registro.jsp?msg=error");
		}
	}

}
