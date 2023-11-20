package uy.edu.um;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VuelosDTO {

    private Long number;
    private String aerolinea;
    private String codigoVuelo;
    private String matricula;
    private String aeropuertoSalida;
    private String aeropuertoLlegada;
    private Boolean estadoAceptacionSalida;
    private Boolean estadoAceptacionLlegada;
    private String estadoVuelo;
    private LocalDate fechaSalida;
    private String horaSalida;
    private LocalDate fechaLlegada;
    private String horaLlegada;
    private String licenciaPiloto;
    private String puertaSalida;
    private String puertaLlegada;
    private String pistaSalida;
    private String pistaLlegada;


    
}

