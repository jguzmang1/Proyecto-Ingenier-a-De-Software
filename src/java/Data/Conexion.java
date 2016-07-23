/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta clase es la encargada de realizar la conexión a la base de datos desarrollada en PostgreSQL 9.5
 * Se crean los parametros de la conexion a la base de datos 
 * @author Juan Pablo Guzmán G
 * @since Conexion 1.0.0
 */
public class Conexion {
    
    private String username = "postgres";
    private String password = "root";
    private String host = "localhost";
    private String port = "5432";
    private String database = "ikea";
    private String classname = "org.postgresql.Driver";
    private String url ="jdbc:postgresql://"+host+":"+port+"/"+database;
    private Connection conect;
   
    /**
     * Se crea el constructor de la clase conexion
     * Se pasan los parametros para generar la conexion 
     * @param  Conexion correcta o error en la conexion 
     * @author Juan Pablo Guzmán G
     */
    public Conexion(){
        try{
            Class.forName(classname);
            conect = DriverManager.getConnection(url, username, password);
        }catch(ClassNotFoundException e){
            System.err.println("ERROR"+e);
        }catch(SQLException e){
            System.err.println("ERROR"+e);
        }
    }
    /**
     * Metodo para obtener la conexion  
     * @return objeto que contiene la conexion 
     */
        public Connection getConexion(){
        
            return conect;
        }
        /**
     * Se crea un main para probar que la conexion funciona correctamente 
     * @return un objeto de la clase conexion
     * @author Juan Pablo Guzmán G
     */
        public static void main (String[] args){
         
            Conexion conect = new Conexion();
        }
}
    
   
    

