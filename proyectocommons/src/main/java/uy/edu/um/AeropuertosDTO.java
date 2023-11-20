package uy.edu.um;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AeropuertosDTO {
    private Long id;
    private String nombre;
    private String pais;
    private String codigoIATA;
    private int cantidadPuertas;
    private int cantidadMangas;
    private int cantidadPuestos;
    private List<String> puertas;
    private List<String> pista;
    
}
