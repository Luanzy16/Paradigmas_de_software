/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaDatos.Conexion;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luanz
 */
public class DataLibro {
    private String codigo;
    private String titulo;
    private int cantidad;
    private String autor;
    private int precio;
    
    public String EliminarLibro(){
        Conexion objmod = new Conexion();
        String cad = "delete from libro where codigo='"+ this.getCodigo()+"'";
        return objmod.Ejecutar(cad);
    }
    
    public String Grabarlibro(){
        Conexion objmod = new Conexion();
        String cad = "insert into libro values('"+ this.getCodigo()+"','"+this.getTitulo()
                + "','" + this.getCantidad() + "','" + this.getAutor() + "','" + this.getPrecio()+"')";
        return objmod.Ejecutar(cad);
    }
    
    public String EditarLibro(){
        Conexion objmod = new Conexion();
        String cad = "Update libro set titulo='" + this.getTitulo()+"',cantidad=' "+this.getCantidad()
                +"',autor=' "+ this.getAutor()+ "',precio=' "+ this.getPrecio()+"' where codigo='"+this.getCodigo()+"'";
                
        return objmod.Ejecutar(cad);
    }
    
    public ArrayList<DataLibro> ListaLibro(){
        ArrayList lista1 = new ArrayList();
        try{
            Conexion objmod = new Conexion();
            ResultSet tabla = objmod.Listar("select * from libro");
            DataLibro objlibro;
            while(tabla.next()){
                objlibro = new DataLibro();
                objlibro.setCodigo(tabla.getString("Codigo"));
                objlibro.setTitulo(tabla.getString("Titulo"));
                objlibro.setCantidad(tabla.getInt("Cantidad"));
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
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
