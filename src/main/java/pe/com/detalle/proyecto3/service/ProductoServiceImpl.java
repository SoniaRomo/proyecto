/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.detalle.proyecto3.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.detalle.proyecto3.entity.Productos;
import pe.com.detalle.proyecto3.repository.ProductosRepository;

@Service
public class ProductoServiceImpl implements ProductosService {

    @Autowired
    private ProductosRepository repositorio;

    @Override
    public List<Productos> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Productos> findALLCustom() {
        return repositorio.finDallCustom();
    }

    @Override
    public Optional<Productos> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Productos add(Productos p) {
        return repositorio.save(p);
    }

    @Override
    public Productos update(Productos p) {
        Productos objproducto = repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objproducto);
        return repositorio.save(objproducto);
    }

    @Override
    public Productos delete(Productos p) {
        Productos objproducto = repositorio.getById(p.getCodigo());
        objproducto.setEstado(false);
        return repositorio.save(objproducto);
    }

}
