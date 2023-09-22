/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.detalle.proyecto3.service;

import java.util.List;
import java.util.Optional;
import pe.com.detalle.proyecto3.entity.Productos;

/**
 *
 * @author M513
 */
public interface ProductosService {

    public List<Productos> findAll();

    public List<Productos> findALLCustom();

    public Optional<Productos> findById(long id);

    public Productos add(Productos p);

    public Productos update(Productos p);

    public Productos delete(Productos p);
}
