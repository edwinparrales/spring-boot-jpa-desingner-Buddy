package col.main.pos.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link col.main.pos.entities.Cliente} entity
 */
public class ClienteDto implements Serializable {
    private final String barrio;
    private final String ciudad;
    private final String direccion;
    private final String email;
    private final String nombre;
    private final String numeroDocumento;
    private final String telefono;

    public ClienteDto(String barrio, String ciudad, String direccion, String email, String nombre, String numeroDocumento, String telefono) {
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.email = email;
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteDto entity = (ClienteDto) o;
        return Objects.equals(this.barrio, entity.barrio) &&
                Objects.equals(this.ciudad, entity.ciudad) &&
                Objects.equals(this.direccion, entity.direccion) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.numeroDocumento, entity.numeroDocumento) &&
                Objects.equals(this.telefono, entity.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barrio, ciudad, direccion, email, nombre, numeroDocumento, telefono);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "barrio = " + barrio + ", " +
                "ciudad = " + ciudad + ", " +
                "direccion = " + direccion + ", " +
                "email = " + email + ", " +
                "nombre = " + nombre + ", " +
                "numeroDocumento = " + numeroDocumento + ", " +
                "telefono = " + telefono + ")";
    }
}