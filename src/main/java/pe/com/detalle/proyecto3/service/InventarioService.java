
package pe.com.detalle.proyecto3.service;

import java.util.List;
import java.util.Optional;
import pe.com.detalle.proyecto3.entity.inventario;

public interface InventarioService {

    public List<inventario> findAll();

    public List<inventario> findALLCustom();

    public Optional<inventario> findById(long id);

    public inventario add(inventario c);

    public inventario update(inventario c);

    public inventario delete(inventario c);
}
