/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenchacon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;


/**
 *
 * @author redjas
 */
public class QueryMaker {
    
    
    public ResultSet resultados;
    
    public void executeQuery(String query)
    {
       
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenChacon?serverTimezone=UTC","root", "rootkey123@");
            Statement smt = conexion.createStatement();
            ResultSet resultado = smt.executeQuery(query);
            
            this.resultados = resultado;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        
        
        /*
        try(ResultSet resultados = this.consultor.executeQuery(query)){
            this.resultado = resultados;
            System.out.println("Query realizada con exito");
            while (resultados.next()){
                System.out.println(resultados.getInt("id"));
            }
            
        }
        catch(SQLException e){
            System.out.println("Hubo un problema cen la consulta");
            e.printStackTrace();
        }
        */
        
    }

    
    public boolean executeInsert(String query){
        
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenChacon?serverTimezone=UTC ","root", "rootkey123@");
            Statement smt = conexion.createStatement();
            smt.executeUpdate(query);
            
            return true;
            
            
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        
        
    }
    

    
    
    
    
    
    
    
    
    
}
