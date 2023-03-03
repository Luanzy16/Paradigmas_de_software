/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaDatos.Conexion;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author luanz
 */
public class DataCliente {
    private int id;
    private String nombreCliente;
    private String direccion;
    
   
    
    /**
     * funcion que agrega elementos a la tabla cliente por medio de la sintaxis de la base de datos y ejecuta la intruccion
     * @return funcion que ejecuta la intruccion en la database
     */
    public String GrabarCliente(){
        Conexion objmod = new Conexion();
        String cad = "insert into clientes values('"+ this.getId()+"','"+this.getNombreCliente()+ "','" + this.getDireccion()+"')";
        return objmod.Ejecutar(cad);
    }
    
   
    
    /**
     * Utiliza la tabla de la data base para crear otra tabla pero en la aplicacion con ayuda de una lista (ArrayList) dandole nombre a los induces de las columnas
     * @return lista1 
     */
    public ArrayList<DataCliente> ListaCliente(){
        ArrayList lista1 = new ArrayList();
        try{
            Conexion objmod = new Conexion();
            ResultSet tabla = objmod.Listar("select * from clientes"); //Resultset contiene los resultados de una consulta SQL
            DataCliente objcliente;
            while(tabla.next()){
                objcliente = new DataCliente();
                objcliente.setId(tabla.getInt("id"));
                objcliente.setNombreCliente((tabla.getString("nombre")));
                objcliente.setDireccion(tabla.getString("direccion"));
                
                lista1.add(objcliente);
            }
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
