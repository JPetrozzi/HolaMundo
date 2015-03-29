package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Usuario;

public class UsuarioAdapter 
{
	public void CrearUsuario(Usuario u)
	{
		DataAdapter da = new DataAdapter();
		PreparedStatement ps = null;
		String queryString = "INSERT INTO usuarios (email,password,nombre) VALUES (?,?,?)";
		try 
		{
			ps = da.getConnection().prepareStatement(queryString);
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getNombre());
			ps.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				da.getConnection().close();
				ps.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public boolean isEmailValid(String email)
	{
		boolean isValid = false;
		DataAdapter da = new DataAdapter();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String queryString = "SELECT * FROM usuarios WHERE email = ?;";
		try 
		{
			ps = da.getConnection().prepareStatement(queryString);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next())
			{
				isValid = false;
			}
			else
			{
				isValid = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				da.getConnection().close();
				ps.close();
				rs.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return isValid;
	}
}
