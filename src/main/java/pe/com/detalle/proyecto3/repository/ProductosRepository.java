package pe.com.detalle.proyecto3.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.detalle.proyecto3.entity.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long> {

    @Query("SELECT p FROM productos p WHERE p.estado=true")
    List<Productos> finDallCustom();

}
