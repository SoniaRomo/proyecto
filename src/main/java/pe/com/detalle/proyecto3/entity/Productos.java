/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.detalle.proyecto3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "productos")
@Table(name = "productos")

public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "preciocompra")
    private double preciocompra;
    @Column(name = "precioventa")
    private double precioventa;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estadopro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "idcodigo", nullable = false)
    private Productos productos;

}
