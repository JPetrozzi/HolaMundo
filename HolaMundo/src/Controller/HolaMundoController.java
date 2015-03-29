package Controller;

import Model.*;
import Data.*;

public class HolaMundoController 
{
	private UsuarioAdapter ua;
	
	public boolean RegistrarUsuario(String email, String pass, String nom)
	{
		boolean rta;
		ua = new UsuarioAdapter();
		if(ua.isEmailValid(email))
		{
			Usuario u  = new Usuario();
			u.setEmail(email);
			u.setPassword(pass);
			u.setNombre(nom);
			ua.CrearUsuario(u);
			rta = true;
		}
		else
		{
			rta = false;
		}
		return rta;
	}
}
