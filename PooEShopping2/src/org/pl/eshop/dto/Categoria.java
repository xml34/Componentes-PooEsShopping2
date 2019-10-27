package org.pl.eshop.dto;
public class Categoria {
    private Integer id;
    private String nombre;
    private String descripcion;
    
    public Categoria() {
        nombre = "";
    }
    public Categoria(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        if (id == null){
            throw new IllegalArgumentException("Error in setId categoria id null");
        }
        if (id <= 0){
            throw new IllegalArgumentException("Error in setIt categoria id <= 0");
        }
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null){
            throw new IllegalArgumentException("Error null name in categoria");
        }
        if (nombre.length() < 3){
            throw new IllegalArgumentException("Error empty name in categoria");
        }
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
