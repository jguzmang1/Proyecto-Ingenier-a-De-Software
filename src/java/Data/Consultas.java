/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *
 * @author Juan Pablo Guzmán G
 */
public class Consultas extends Conexion{
    
    public boolean autenticacion(String identificacion, String contraseña){
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta = "select * from usuarios where identificacion = ? and contrasena = ?";
            pst = getConexion().prepareStatement(consulta, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, identificacion);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
            
                return true;
            }
            
        }catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
                
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
        }
    
        return false;
    }
    public boolean registrar(String identificacion,String nombre, String apellido, String area, String departamento, String cargo, String salario, String estado, String rol, String contraseña){
    
        PreparedStatement pst = null;
        
        try { 
            String consulta = "insert into usuarios (identificacion, nombre, apellido, area, departamento, cargo, salario, estado, rol, contrasena) values (?,?,?,?,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, identificacion);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setString(4, area);
            pst.setString(5, departamento);
            pst.setString(6, cargo);
            pst.setString(7, salario);
            pst.setString(8, estado);
            pst.setString(9, rol);
            pst.setString(10, contraseña);
            
            if(pst.executeUpdate() == 1){
            
                return true;
            }
        } catch (Exception ex) {
            System.err.println("Error" + ex);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close(); 
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Consultas co = new Consultas();
        System.out.println(co.registrar("20525823", "Hermando", "Rodriguez", "Compras", "Almacen", "Jefe Alamacen", "1000000", "Activo", "Empleado", "root"));
    }  
}
