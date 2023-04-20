package col.main.pos.repository;

import col.main.pos.entities.FacturaDetalle;
import col.main.pos.entities.FacturaDetalleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDetalleRepository extends JpaRepository<FacturaDetalle, FacturaDetalleId> {
}