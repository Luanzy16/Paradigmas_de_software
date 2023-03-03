package CapaNegocio;

import CapaDatos.Conexion;
import java.sql.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luanz
 */
public class DataLibro {
    private int codigo;
    private String titulo;
    private String autor;
    private int precio;
    
    /**
     * Funcion que guarda la sintaxis de eliminar un elemento de la tabla en la base de datos para luego ejecutarla en la misma
     * @return accion de eliminar elemento (funcion)
     */
    public String EliminarLibro(){
        Conexion objmod = new Conexion();
        String cad = "delete from libros where codigo='"+ this.getCodigo()+"'";
        return objmod.Ejecutar(cad);
  
    }
    
    /**
     * funcion que agrega elementos a la tabla libro por medio de la sintaxis de la base de datos y ejecuta la intruccion
     * @return funcion que ejecuta la intruccion en la database
     */
    public String Grabarlibro(){
        Conexion objmod = new Conexion();
        String cad = "insert into libros values('"+ this.getCodigo()+"','"+this.getTitulo()
                + "','" + this.getAutor() + "','" + this.getPrecio()+"')";
        return objmod.Ejecutar(cad);
    }
    
    /**
     * funcion que ingresa y ejecuta la instruccion de editar un elemento en la base de datos 
     * @return funcion que ejecuta la instruccion
     */
    public String EditarLibro(){
        Conexion objmod = new Conexion();
        String cad = "Update libros set titulo='" + this.getTitulo()+"',autor=' "+ this.getAutor()+ "',precio=' "+ this.getPrecio()+"' where codigo='"+this.getCodigo()+"'";
                
        return objmod.Ejecutar(cad);
    }
     
    
    /**
     * Utiliza la tabla de la data base para crear otra tabla pero en la aplicacion con ayuda de una lista (ArrayList) dandole nombre a los induces de las columnas
     * @return lista1 
     */
    public ArrayList<DataLibro> ListaLibro(){
        ArrayList lista1 = new ArrayList();
        try{
            Conexion objmod = new Conexion();
            ResultSet tabla = objmod.Listar("select * from libros"); //Resultset contiene los resultados de una consulta SQL
            DataLibro objlibro;
            while(tabla.next()){
                objlibro = new DataLibro();
                objlibro.setCodigo(tabla.getInt("Codigo"));
                objlibro.setTitulo(tabla.getString("Titulo"));
                objlibro.setAutor(tabla.getString("Autor"));
                objlibro.setPrecio(tabla.getInt("Precio"));
                lista1.add(objlibro);
            }
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
