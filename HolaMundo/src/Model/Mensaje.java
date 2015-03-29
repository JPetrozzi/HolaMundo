package Model;

import java.util.Date;

public class Mensaje 
{
	private int id;
	private String contenido;
	private Date fecha_hora;
	private Usuario autor;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getContenido() 
	{
		return contenido;
	}
	public void setContenido(String contenido) 
	{
		this.contenido = contenido;
	}
	
	public Date getFecha_hora() 
	{
		return fecha_hora;
	}
	public void setFecha_hora(Date fecha_hora) 
	{
		this.fecha_hora = fecha_hora;
	}
	
	public Usuario getAutor() 
	{
		return autor;
	}
	public void setAutor(Usuario autor) 
	{
		this.autor = autor;
	}
}