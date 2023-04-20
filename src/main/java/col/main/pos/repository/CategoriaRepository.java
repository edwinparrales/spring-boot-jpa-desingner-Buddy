package col.main.pos.repository;

import col.main.pos.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    public List<Categoria> findCategoriasByDescripcionIsLikeIgnoreCase(String descipcion);
}