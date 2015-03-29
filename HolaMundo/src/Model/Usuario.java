package Model;

import java.util.ArrayList;

public class Usuario 
{
	private int id;
	private String email;
	private String password;
	private String nombre;
	private ArrayList<Usuario> contactos;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public ArrayList<Usuario> getContactos() 
	{
		return contactos;
	}
	public void setContactos(ArrayList<Usuario> contactos) 
	{
		this.contactos = contactos;
	}
}