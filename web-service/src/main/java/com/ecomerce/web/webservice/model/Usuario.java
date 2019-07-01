package com.ecomerce.web.webservice.model;

import com.ecomerce.web.webservice.utils.Enums.TipoUsuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private long idUsuario;

    @NotNull
    private String password;

    @NotNull
    private String nombre;

    private String direccion;
    private String telefono;
    private String correo;

    @NotNull
    private TipoUsuario tipoUsuario;

    @OneToMany(mappedBy = "usuario")
    private List<ShoppingCar> listaShoppingCar;

    @OneToMany(mappedBy = "usuario")
    private List<Factura> factura;

    public Usuario(){}

    public Usuario(long idUsuario, @NotNull String password, @NotNull String nombre, String direccion, String telefono, String correo, @NotNull TipoUsuario tipoUsuario, List<ShoppingCar> listaShoppingCar, List<Factura> factura) {
        this.idUsuario = idUsuario;
        this.password = password;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
        this.listaShoppingCar = listaShoppingCar;
        this.factura = factura;
    }

    public List<ShoppingCar> getListaShoppingCar() {
        return listaShoppingCar;
    }

    public void setListaShoppingCar(List<ShoppingCar> listaShoppingCar) {
        this.listaShoppingCar = listaShoppingCar;
    }

    public List<Factura> getFactura() {
        return factura;
    }

    public void setFactura(List<Factura> factura) {
        this.factura = factura;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario == usuario.idUsuario &&
                Objects.equals(password, usuario.password) &&
                Objects.equals(nombre, usuario.nombre) &&
                Objects.equals(direccion, usuario.direccion) &&
                Objects.equals(telefono, usuario.telefono) &&
                Objects.equals(correo, usuario.correo) &&
                tipoUsuario == usuario.tipoUsuario &&
                Objects.equals(listaShoppingCar, usuario.listaShoppingCar) &&
                Objects.equals(factura, usuario.factura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, password, nombre, direccion, telefono, correo, tipoUsuario, listaShoppingCar, factura);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", password='" + password + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", listaShoppingCar=" + listaShoppingCar +
                ", factura=" + factura +
                '}';
    }
}
