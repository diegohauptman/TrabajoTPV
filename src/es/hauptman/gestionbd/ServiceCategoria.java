/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.hauptman.gestionbd;

import es.hauptman.entities.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ServiceCategoria {
    
    private Connection conn = null;

    public ServiceCategoria() {
        conn = GestionSQL.getConnection();
    }
    
    public boolean save(Categoria categoria){
        
        String sql = "INSERT INTO categorias (descripcion) VALUES (?)";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setString(1, categoria.getDescripcion());
            query.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            //Logger.getLogger(ServiceCategoria.class.getName()).log(Level.SEVERE, 
            //IErrors.ERROR_SQL_STATEMENT, ex);
            return false;
        }finally {
            GestionSQL.closedConnection(conn, query);
        }
    }
    
    public List<Categoria> findAll(){
        
        String sql = "SELECT * FROM categorias";
        
        PreparedStatement query = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try {
            
            query = conn.prepareStatement(sql);
            rs = query.executeQuery();
            
            while (rs.next()) {                
                Categoria categoria = new Categoria();
                categoria.setDescripcion(rs.getString("descripcion"));
                categorias.add(categoria);
            }
            
                    } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
        }finally {
            GestionSQL.closedConnection(conn, query, rs);
        }
        return categorias;
    }
    
    public boolean update(Categoria categoria){
        
        String sql = "UPDATE categorias SET descripcion = ? WHERE id = ?";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setString(1, categoria.getDescripcion());
            query.setInt(2, categoria.getID());
            query.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            //Logger.getLogger(ServiceCategoria.class.getName()).log(Level.SEVERE, 
            //IErrors.ERROR_SQL_STATEMENT, ex);
            return false;
        }finally {
            GestionSQL.closedConnection(conn, query);
        }
    }
    
    public boolean delete(Categoria categoria){
        
        String sql = "DELETE FROM categoria WHERE id = ?";
        
        PreparedStatement query = null;
        
        try {
            query = conn.prepareStatement(sql);
            query.setInt(1, categoria.getID());
            query.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println(IErrors.ERROR_SQL_STATEMENT +ex);
            //Logger.getLogger(ServiceCategoria.class.getName()).log(Level.SEVERE, 
            //IErrors.ERROR_SQL_STATEMENT, ex);
            return false;
        }finally {
            GestionSQL.closedConnection(conn, query);
        }
    }
}