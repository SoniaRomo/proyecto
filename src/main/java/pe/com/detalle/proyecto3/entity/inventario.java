
package pe.com.detalle.proyecto3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Entity(name = "inventario")
@Table(name = "inventario")
public class inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idcodigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "unddisponibles")
    private int unidadesdis;
    @Column(name = "estadocat")
    private boolean estado;

}
