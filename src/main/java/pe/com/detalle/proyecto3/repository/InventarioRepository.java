/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.detalle.proyecto3.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.detalle.proyecto3.entity.inventario;

public interface InventarioRepository extends JpaRepository<inventario, Long> {

    @Query("select c from inventario c where c.estado= true")
    List<inventario> finDallCustom();

}
