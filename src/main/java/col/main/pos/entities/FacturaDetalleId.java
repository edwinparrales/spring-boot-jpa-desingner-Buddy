package col.main.pos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FacturaDetalleId implements Serializable {
    private static final long serialVersionUID = -2844547157599667200L;
    @Column(name = "rowid_factura", nullable = false)
    private Integer rowidFactura;

    @Column(name = "rowid_producto", nullable = false)
    private Integer rowidProducto;

    public Integer getRowidFactura() {
        return rowidFactura;
    }

    public void setRowidFactura(Integer rowidFactura) {
        this.rowidFactura = rowidFactura;
    }

    public Integer getRowidProducto() {
        return rowidProducto;
    }

    public void setRowidProducto(Integer rowidProducto) {
        this.rowidProducto = rowidProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FacturaDetalleId entity = (FacturaDetalleId) o;
        return Objects.equals(this.rowidFactura, entity.rowidFactura) &&
                Objects.equals(this.rowidProducto, entity.rowidProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowidFactura, rowidProducto);
    }

}