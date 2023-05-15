package com.registro.usuarios.controlador.dto;

public class UsuarioRegistroDTO {

    private Long id;
    private String nombre;
    private String email;
    private String password;
    private String telefono;
    private String codigoCiudad;
    private String codigoPais;

    public UsuarioRegistroDTO() {}

    public UsuarioRegistroDTO(String nombre, String email, String password, String telefono, String codigoCiudad, String codigoPais) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.codigoCiudad = codigoCiudad;
        this.codigoPais = codigoPais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }
}
