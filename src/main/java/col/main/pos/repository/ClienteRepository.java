package col.main.pos.repository;

import col.main.pos.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
  public List<Cliente> findClienteByNombreIsLikeIgnoreCase(String nombre);
  public List<Cliente> findClienteByNumeroDocumento(String numDocumento);
  public Long countClienteById(Integer id);

}