package col.main.pos.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rowid_factura", nullable = false)
    private Integer id;

    @Column(name = "codigo_factura")
    private String codigoFactura;

    @Column(name = "des_total")
    private Double desTotal;

    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;

    @Column(name = "imp_total")
    private Double impTotal;

    @Column(name = "observacines")
    private String observacines;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rowid_cliente")
    private Cliente rowidCliente;

    @OneToMany(mappedBy = "rowidFactura")
    private Set<FacturaDetalle> facturaDetalles = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Double getDesTotal() {
        return desTotal;
    }

    public void setDesTotal(Double desTotal) {
        this.desTotal = desTotal;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Double getImpTotal() {
        return impTotal;
    }

    public void setImpTotal(Double impTotal) {
        this.impTotal = impTotal;
    }

    public String getObservacines() {
        return observacines;
    }

    public void setObservacines(String observacines) {
        this.observacines = observacines;
    }

    public Cliente getRowidCliente() {
        return rowidCliente;
    }

    public void setRowidCliente(Cliente rowidCliente) {
        this.rowidCliente = rowidCliente;
    }

    public Set<FacturaDetalle> getFacturaDetalles() {
        return facturaDetalles;
    }

    public void setFacturaDetalles(Set<FacturaDetalle> facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }

}