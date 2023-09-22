package pe.com.detalle.proyecto3.RestController;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.detalle.proyecto3.entity.inventario;
import pe.com.detalle.proyecto3.service.InventarioService;

@RestController
@RequestMapping("/inventario")

public class InventarioRestController {

    @Autowired
    private InventarioService servicio;

    @GetMapping
    public List<inventario> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<inventario> findAllCustom() {
        return servicio.findALLCustom();
    }

    @GetMapping("/{id}")
    public Optional<inventario> findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public inventario add(@RequestBody inventario c) {
        return servicio.add(c);
    }

    @PutMapping("/{id}")

    public inventario update(@PathVariable long id, @RequestBody inventario c) {
        c.setCodigo(id);
        return servicio.update(c);
    }

    @DeleteMapping("/{id}")

    public inventario delete(@PathVariable long id) {
        inventario objinventario = new inventario();
        objinventario.setEstado(false);
        return servicio.delete(inventario.builder().codigo(id).build());
    }
}
