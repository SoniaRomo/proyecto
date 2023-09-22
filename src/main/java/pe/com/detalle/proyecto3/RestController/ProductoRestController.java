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
import pe.com.detalle.proyecto3.entity.Productos;
import pe.com.detalle.proyecto3.service.ProductosService;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {

    @Autowired
    private ProductosService servicio;

    @GetMapping
    public List<Productos> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Productos> findAllCustom() {
        return servicio.findALLCustom();
    }

    @GetMapping("/{id}")
    public Optional<Productos> findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Productos add(@RequestBody Productos p) {
        return servicio.add(p);
    }

    @PutMapping("/{id}")

    public Productos update(@PathVariable long id, @RequestBody Productos p) {
        p.setCodigo(id);
        return servicio.update(p);
    }

    @DeleteMapping("/{id}")

    public Productos delete(@PathVariable long id) {
        Productos objproducto = new Productos();
        objproducto.setEstado(false);
        return servicio.delete(Productos.builder().codigo(id).build());
    }

}
