package pe.com.detalle.proyecto3.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.detalle.proyecto3.entity.inventario;
import pe.com.detalle.proyecto3.repository.InventarioRepository;

@Service
public class InventarioServiceImpl implements InventarioService {

    @Autowired
    private InventarioRepository repositorio;

    @Override
    public List<inventario> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<inventario> findALLCustom() {
        return repositorio.finDallCustom();
    }

    @Override
    public Optional<inventario> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public inventario add(inventario c) {
        return repositorio.save(c);
    }

    @Override
    public inventario update(inventario c) {
        inventario objinventario = repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objinventario);
        return repositorio.save(objinventario);
    }

    @Override
    public inventario delete(inventario c) {
        inventario objinventario = repositorio.getById(c.getCodigo());
        objinventario.setEstado(false);
        return repositorio.save(objinventario);
    }
}
