package col.main.pos.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "factura_detalle")
public class FacturaDetalle {
    @EmbeddedId
    private FacturaDetalleId id;

    @MapsId("rowidFactura")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rowid_factura", nullable = false)
    private Factura rowidFactura;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "total")
    private Double total;

    public FacturaDetalleId getId() {
        return id;
    }

    public void setId(FacturaDetalleId id) {
        this.id = id;
    }

    public Factura getRowidFactura() {
        return rowidFactura;
    }

    public void setRowidFactura(Factura rowidFactura) {
        this.rowidFactura = rowidFactura;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}