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
public class DataVenta {
    private int numeroVenta;
    private String nombreCliente;
    private int codigoLibro;
    private int totalPagar;
    
    /**
     * funcion que agrega elementos a la tabla venta por medio de la sintaxis de la base de datos y ejecuta la intruccion
     * @return funcion que ejecuta la intruccion en la database
     */
    public String GrabarVenta(){
        Conexion objmod = new Conexion();
        String cad = "insert into ventas values('"+ this.getNumeroVenta()+"','"+this.getNombreCliente()+ "','" + this.getCodigoLibro() + "','" + this.getTotalPagar()+"')";
        return objmod.Ejecutar(cad);
    }
    
    /**
     * funcion que ingresa y ejecuta la instruccion de editar un elemento en la base de datos 
     * @return funcion que ejecuta la instruccion
     */
    public String EditarVenta(){
        Conexion objmod = new Conexion();
        String cad = "Update ventas set nombreC='" + this.getNombreCliente()+"',codigoL=' "+this.getCodigoLibro()+"',totalP=' "+this.getTotalPagar()+"' where numeroV='"+this.getNumeroVenta()+"'";
                
        return objmod.Ejecutar(cad);
    }
     
    
    /**
     * Utiliza la tabla de la data base para crear otra tabla pero en la aplicacion con ayuda de una lista (ArrayList) dandole nombre a los induces de las columnas
     * @return lista1 
     */
    public ArrayList<DataVenta> ListaVenta(){
        ArrayList lista1 = new ArrayList();
        try{
            Conexion objmod = new Conexion();
            ResultSet tabla = objmod.Listar("select * from ventas"); //Resultset contiene los resultados de una consulta SQL
            DataVenta objventa;
            while(tabla.next()){
                objventa = new DataVenta();
                objventa.setNumeroVenta(tabla.getInt("numeroV"));
                objventa.setNombreCliente(tabla.getString("nombreC"));
                objventa.setCodigoLibro(tabla.getInt("codigoL"));
                objventa.setTotalPagar(tabla.getInt("totalP"));
                lista1.add(objventa);
            }
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista1;
    }
    
    
    // getters y setters
    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    
}
